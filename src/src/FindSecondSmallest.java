import java.util.*;

public class FindSecondSmallest {

    // Returns the second smallest distinct number in the list
    public static int secondSmallest(List<Integer> list) {

        // Start both as the largest possible value so any real number beats them
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        // Go through every number exactly once
        for (int num : list) {

            // New smallest found: old smallest becomes the second smallest
            if (num < smallest) {
                second = smallest;
                smallest = num;
            }
            // Bigger than smallest but smaller than second: new second smallest
            else if (num < second && num != smallest) {
                second = num;
            }
        }

        // If second never changed, there was no second distinct value
        if (second == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Need at least two distinct numbers");
        }

        return second;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 3, 1, 2);

        // Prints the second smallest number
        System.out.println(secondSmallest(list));
    }
}