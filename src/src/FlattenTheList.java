import java.lang.classfile.constantpool.IntegerEntry;
import java.util.*;

public class FlattenTheList
{
    //Takes a list of lists and returns one single flat list
    public static List<Integer> flatten(List<List<Integer>> nested)
    {
        //This will hold all the numbers in order
        List<Integer> result = new ArrayList<>();

        //Go Through each inner list one by one
        for(List<Integer> inner : nested)
        {
            //Add every element of the inner list to the result
            result.addAll(inner);
        }
        return result;
    }

    public static void main(String[]args)
    {
        List<List<Integer>> nested = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(5,6),
                Arrays.asList(3,4)

        );

        //Prints the flattened list
        System.out.println(flatten(nested));
    }
}
