import java .util.*;

public class SortIntegersFromList
{
    public static void sortAscending(List<Integer> numbers)
    {
        Collections.sort(numbers);

        for(int num : numbers)
        {
            System.out.println(num);
        }
    }
}

public static void main(String[] args)
{
    List<Integer> numbers = new ArrayList<>();

    numbers.add(50);
    numbers.add(20);
    numbers.add(10);
    numbers.add(90);
    numbers.add(40);
    numbers.add(60);

    SortIntegersFromList.sortAscending(numbers);
}