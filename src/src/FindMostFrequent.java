import java.util.HashMap;
import java.util.Map;

public class FindMostFrequent
{
    //Returns the element that appears most often in the array
    public static int mostFrequent(int[] arr)
    {
        //Stores each number along with how many times it has appeared
        Map<Integer, Integer> counts = new HashMap<>();

        int best = arr[0];      //The most frequent element found so far
        int bestCount = 0;      //how many times that element has arrived

        //Go through every number in the array exactly once
        for(int num : arr)
        {
            //If num is new sets its count to 1
            //If it already exist add 1 to its count
            //merge() returns the updated count
            int c = counts.merge(num,1, Integer::sum);

            //If this numbers count beats the current best update the winner
            if(c > bestCount)
            {
                bestCount = c;
                best = num;
            }
        }
        return best;
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,3,2,2};

        //Prints the most frequent element
        System.out.println(mostFrequent(arr));
    }
}
