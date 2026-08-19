

class SecondLargest
{
    static int findSecondLargest(int[] numbers)
    {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num :  numbers)
        {
            if(num > largest)
            {
                secondLargest = largest;
                largest = num;
            }
            else if(num > secondLargest && num != largest)
            {
                secondLargest = num;
            }
        }
        return secondLargest;
    }
}

public class FindSecondLargest
{
    public static void main(String[] args)
    {
        int[] numbers = {10,3,90,33,22,55,13,54,21};

        int result = SecondLargest.findSecondLargest(numbers);

        System.out.println("Second Largest Number is: " + result);
    }
}