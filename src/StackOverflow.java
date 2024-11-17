public class StackOverflow
{
    static int counter = 0;
    public static void main(String[] args)
    {

        printMessage();
    }

    public static void printMessage()
    {
        counter++;
        System.out.println("Inget Stack overflow än så länge... Antal metodanrop: " + counter);
        printMessage();
    }
}
