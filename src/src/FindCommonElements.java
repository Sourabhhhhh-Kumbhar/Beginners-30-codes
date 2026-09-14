import java.util.*;

public class FindCommonElements
{
    public static void findCommonElements(List<Integer> list1, List<Integer> list2)
    {
        for (int num : list1)
        {
            if (list2.contains(num))
            {
                System.out.println(num);
            }
        }
    }

    public static void main(String[] args)
    {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 62, 7, 8, 9, 10);
        List<Integer> list2 = Arrays.asList(1, 22, 3, 4, 51, 6, 73, 8, 92, 10);

        findCommonElements(list1, list2);
    }
}
