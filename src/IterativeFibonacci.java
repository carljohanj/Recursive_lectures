import java.util.Scanner;

public class IterativeFibonacci
{
    public static int counter = 0;
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = -1;
        while(n < 0)
        {
            System.out.println("Vilket tal i fibonaccisekvensen vill du beräkna?");
            n = scan.nextInt();
        }

        System.out.println("Det " + n + " fibonaccitalet är: " + fib(n));
        System.out.println("Antal loopvarv för att räkna ut talet: " + counter);
    }

    /**
     * En metod som använder tabulering för att beräkna fibonacci iterativt.
     * Det här är ett exempel på dynamisk programmering.
     * @param n Det tal i fibonaccisekvensen som vi vill beräkna
     * @return Det beräknade talet
     */
    public static long fib(int n)
    {
        if (n <= 1) return n;

        //Fibonaccisekvensen: 0, 1, 1, 2, 3, 5, 8, 13, 21... osv
        //Vi initialiserar n1 och n2 så att de innehåller de första två talen för sekvensen
        long n1 = 0;
        long n2 = 1;
        long sum = 0;

        for(int i = 2; i <= n; i++)
        {
            counter++;
            //                               sum              n2              n1
            //Fibonacci beräknas så här: Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)
            //Om vi plussar n2 och n1 kommer sum nu att innehålla tal 3:
            sum = n2 + n1;

            //Vi behöver nu förändra värdena för n1 och n2 så att de är redo för nästa loopvarv
            //Exempel: Första varvet i loopen kommer att räkna ut Fib 3, som är 1 (0 + 1 = 1)
            /*Om vi vill beräkna 4:e talet (som är 2) i nästa varv behöver vi ställa upp variablerna
            * så att de innehåller tal 2 och 3 i sekvensen. Tal 2 hålls just nu av n2 och tal 3 av sum */
            //n1 tilldelas därför värdet som n2 just nu har, och n2 får samma värde som sum:
            n1 = n2;
            n2 = sum;

            //n1 är nu 1 och n2 är 1, och vi är redo att lägga ihop dem och få 2 i nästa loopvarv
        }

        return sum;
    }
}
