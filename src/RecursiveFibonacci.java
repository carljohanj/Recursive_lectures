import java.util.Scanner;

public class RecursiveFibonacci
{
    public static int counter = 0;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = -1;
        while(n < 0)
        {
            System.out.println("Vilket tal i fibonaccisekvensen vill du beräkna?");
            n = scanner.nextInt();
        }

        System.out.println("Det " + n + " fibonaccitalet är " + fib(n));
        System.out.println("Antal metodanrop för att beräkna numret: " + counter);
    }

    /* I fibonaccisekvensen beräknas varje nytt tal utifrån de två föregående
     * Formeln är Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)
     * Om inte basfallet uppnås vill vi därför göra två nya anrop för att beräkna föregående tal
     * Metoderna kommer att arbeta nedåt och göra nya anropskedjor ända tills basfallet nås
     * När en anropskedja nått basfallet kommer den börja returnera beräkningar */
    public static long fib(int n)
    {
        counter++;

        if (n <= 1) return n;
        return fib(n-1) + fib(n-2);
    }
}
