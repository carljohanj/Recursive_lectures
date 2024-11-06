import java.util.Scanner;

public class RecursiveFibonacciDynamic
{
    static long[] memo;
    static int counter = 0;

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = -1;

        while(n < 0)
        {
            System.out.println("Vilket tal i fibonaccisekvensen vill du beräkna?");
            n = scan.nextInt();
        }

        // Nu när vi har värdet för n kan vi initialisera arrayen som ska lagra värdena
        // för varje fibonaccital på motsvarande indexplats:
        // fib(1) lagras på plats 1, fib(2) på plats 2, fib(5) på plats 5, osv
        memo = new long[n + 1];

        System.out.println("Det " + n + " fibonaccitalet är: " + fib(n));
        System.out.println("Antal metodanrop för att beräkna fib(" + n + "): " + counter);
    }

    /**
     * En metod som använder memoisering för att beräkna fibonacci rekursivt.
     * Det här är ett exempel på dynamisk programmering.
     * @param n Det tal i fibonaccisekvensen vi vill beräkna
     * @return Det beräknade talet
     */
    public static long fib(int n)
    {
        counter++;

        if (n <= 1) return n;

        // Kollar om indexplatsen redan innehåller ett kalkylerat värde; i så fall returnerar vi det.
        // Exempel: om n är 4 kontrollerar den om plats 4 i arrayen innehåller det fjärde fibonaccitalet.
        // Är värdet däremot 0 innebär det att det inte finns något beräknat värde än (alla int-arrayer som
        // initialiseras utan att fyllas med specifika värden får 0 skrivet till alla indexplatser automatiskt).
        if(memo[n] != 0) return memo[n];

        // Om värdet inte redan finns så beräknar vi det rekursivt och sparar det i arrayen:
        memo[n] = fib(n-1) + fib(n-2);

        //Vi returnerar nu det beräknade värdet:
        return memo[n];
    }

}
