import java.util.Scanner;

public class Ackermann
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int m = 0;
        int n = 0;

        while(m < 1)
        {
            System.out.println("Ange första talet för Ackermann:");
            m = scan.nextInt();
        }

        while(n < 1)
        {
            System.out.println("Ange det andra talet för Ackermann:");
            n = scan.nextInt();
        }

        System.out.println("Resultatet för Ackermann(" + m + ", " + n + ") är: " + ackermann(m, n));
    }

    public static int ackermann(int m, int n)
    {
        if (m == 0)
            return n + 1;
        else if ((m > 0) && (n == 0))
            return ackermann(m - 1, 1);
        else if ((m > 0) && (n > 0))
            return ackermann(m - 1, ackermann(m, n - 1));
        else
            return n + 1;
    }
}
