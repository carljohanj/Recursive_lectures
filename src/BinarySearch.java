public class BinarySearch
{
    public static int counter = 0;
    public static void main(String[] args)
    {
        int[] numberArray = new int[1000000];

        int n = 0;
        for(int i = 0; i < numberArray.length; i++)
        {
            numberArray[i] = n;
            n += 5;
        }

        int result = recursiveBinarySearch(numberArray, 0, numberArray.length -1, 250000);

        if (result == -1)
            System.out.println("Värdet kunde inte hittas.");
        else
        {
            System.out.println("Värdet hittades på plats " + result + " i arrayen!");
            System.out.println("Antal sökningar i array med " + numberArray.length + " värden för att hitta rätt nummer: " + counter);
        }
    }

    public static int recursiveBinarySearch(int[] array, int start, int end, int target)
    {
        // Base case: if the search bounds are invalid, return -1 (target not found)
        if (end < start) return -1;

        int middle = (start + end) / 2;

        //Kolla om målvärdet är mittenvärdet:
        if (target == array[middle]) return middle;

        // Om målvärdet är mindre än mitten söker vi genom vänstra halvan av samlingen:
        if (target < array[middle])
        {
            return recursiveBinarySearch(array, start, middle - 1, target);
        }

        // Annars är målvärdet större och
        return recursiveBinarySearch(array, middle + 1, end, target);
    }
}
