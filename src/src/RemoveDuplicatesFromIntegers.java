import java.util.*;

public class RemoveDuplicatesFromIntegers
{

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list)
    {
        return new ArrayList<>(new LinkedHashSet<>(list));
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(1, 2, 2, 3, 4, 4, 5)
        );

        System.out.println(removeDuplicates(list));
    }
}