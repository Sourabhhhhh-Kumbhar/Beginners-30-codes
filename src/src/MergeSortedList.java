import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortedList
{
    public static List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2)
    {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        // Compare the front elements and take the smaller one
        while (i < list1.size() && j < list2.size())
        {
            if (list1.get(i) <= list2.get(j))
            {
                result.add(list1.get(i++));
            }
            else
            {
                result.add(list2.get(j++));
            }
        }

        // Append whatever is left over
        while (i < list1.size()) result.add(list1.get(i++));
        while (j < list2.size()) result.add(list2.get(j++));

        return result;
    }

    public static void main(String[] args)
    {
        List<Integer> a = Arrays.asList(1, 3, 5);
        List<Integer> b = Arrays.asList(2, 4, 6);

        System.out.println(mergeSortedLists(a, b)); // [1, 2, 3, 4, 5, 6]
    }
}