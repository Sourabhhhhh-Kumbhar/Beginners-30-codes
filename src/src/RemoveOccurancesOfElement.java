import java.util.*;

public class RemoveOccurancesOfElement
{
    // Returns a new list with every occurrence of 'target' removed
    public static List<Integer> removeOccurances(List<Integer> list, int target)
    {
        // This will hold only the elements we want to keep
        List<Integer> res = new ArrayList<>();

        // Go through each element in the original list
        for (int num : list)
        {
            // Keep it only if it is NOT the element we want to remove
            if (num != target)
            {
                res.add(num);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4);
        int target = 2;

        // Prints the list after removing all 2s
        System.out.println(removeOccurances(list, target));
    }
}