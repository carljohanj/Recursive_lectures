public class BinarySearch
{
    public static int counter = 0;
    public static void main(String[] args)
    {
        int[] numberArray = new int[1000000];

        int n = 0;
        for(int i: numberArray)
        {
            numberArray[i] = n;
            n += 5;
        }

        boolean result = binarySearch(numberArray, 3000, 0, numberArray.length);

        if (!result)
            System.out.println("Värdet kunde inte hittas.");
        else
        {
            System.out.println("Värdet hittades i arrayen!");
            System.out.println("Antal sökningar i array med " + numberArray.length + " värden för att hitta rätt nummer: " + counter);
        }
    }

    public static boolean binarySearch(int[] data, int target, int low, int high)
    {
        counter++;

        if (low > high) return false;



        return false;
    }
}
