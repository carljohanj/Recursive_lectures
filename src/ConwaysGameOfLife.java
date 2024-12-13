import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

@SuppressWarnings("all")
public class ConwaysGameOfLife extends JPanel
{
    private static final int ROWS = 25; // Number of rows (vertical)
    private static final int COLUMNS = 40; // Number of columns (horizontal)
    private static final int CELL_SIZE = 25; // Size of each cell in pixels
    private static final int WIDTH = COLUMNS * CELL_SIZE; // Total width of the grid
    private static final int HEIGHT = ROWS * CELL_SIZE; // Total height of the grid
    private int[][] grid = new int[ROWS][COLUMNS]; // Current grid state
    private Timer timer;

    public ConwaysGameOfLife()
    {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.WHITE);
        initializeGrid();

        addMouseListener(new MouseAdapter()
        {
            @Override
            public void mousePressed(MouseEvent e)
            {
                int row = e.getY() / CELL_SIZE; // Map y-coordinate to row
                int col = e.getX() / CELL_SIZE; // Map x-coordinate to column
                if (row >= 0 && row < ROWS && col >= 0 && col < COLUMNS)
                {
                    grid[row][col] = (grid[row][col] == 1) ? 0 : 1; // Toggle state
                    repaint();
                }
            }
        });

        timer = new Timer(300, e ->
        {
            grid = nextGeneration(grid);
            repaint();
        });
    }

    private void initializeGrid()
    {
        Random random = new Random();
        for (int i = 0; i < ROWS; i++)
        {
            for (int j = 0; j < COLUMNS; j++)
            {
                grid[i][j] = random.nextInt(2); // Randomly assign 0 or 1
            }
        }
    }

    private int[][] nextGeneration(int[][] currentGrid)
    {
        int[][] newGrid = new int[ROWS][COLUMNS];

        for (int i = 0; i < ROWS; i++)
        {
            for (int j = 0; j < COLUMNS; j++)
            {
                int liveNeighbors = countLiveNeighbors(currentGrid, i, j);

                // Apply Game of Life rules
                if (currentGrid[i][j] == 1) { // Cell is alive
                    newGrid[i][j] = (liveNeighbors < 2 || liveNeighbors > 3) ? 0 : 1;
                } else { // Cell is dead
                    newGrid[i][j] = (liveNeighbors == 3) ? 1 : 0;
                }
            }
        }
        return newGrid;
    }

    private int countLiveNeighbors(int[][] grid, int row, int col)
    {
        int liveNeighbors = 0;
        for (int i = -1; i <= 1; i++)
        {
            for (int j = -1; j <= 1; j++)
            {
                if (i == 0 && j == 0) continue; // Skip the cell itself
                int newRow = (row + i + ROWS) % ROWS; // Wrap around vertically
                int newCol = (col + j + COLUMNS) % COLUMNS; // Wrap around horizontally
                liveNeighbors += grid[newRow][newCol];
            }
        }
        return liveNeighbors;
    }


    // Draw the grid
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        for (int i = 0; i < ROWS; i++)
        {
            for (int j = 0; j < COLUMNS; j++)
            {
                if (grid[i][j] == 1) {
                    g.setColor(Color.BLACK); // Live cells
                } else {
                    g.setColor(Color.WHITE); // Dead cells
                }
                g.fillRect(j * CELL_SIZE, i * CELL_SIZE, CELL_SIZE, CELL_SIZE);
                g.setColor(Color.GRAY); // Grid lines
                g.drawRect(j * CELL_SIZE, i * CELL_SIZE, CELL_SIZE, CELL_SIZE);
            }
        }
    }

    public void start()
    {
        timer.start();
    }

    public void stop()
    {
        timer.stop();
    }

    public void reset()
    {
        initializeGrid();
        repaint();
        start();
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Game of Life");
        ConwaysGameOfLife gamePanel = new ConwaysGameOfLife();

        JButton startButton = new JButton("Start");
        JButton stopButton = new JButton("Stop");
        JButton resetButton = new JButton("Reset");

        startButton.addActionListener(e -> gamePanel.start());
        stopButton.addActionListener(e -> gamePanel.stop());
        resetButton.addActionListener(e -> gamePanel.reset());

        JPanel controlPanel = new JPanel();
        controlPanel.add(startButton);
        controlPanel.add(stopButton);
        controlPanel.add(resetButton);

        frame.add(gamePanel, BorderLayout.CENTER);
        frame.add(controlPanel, BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
