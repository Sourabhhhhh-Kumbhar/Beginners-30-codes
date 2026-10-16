public class SumOfDigits
{
    //Returns the sum of all Digits in the given number
    public static int sumOfDigits(int n)
    {
        //Handles negetive numbers by working with the absolute value
        n = Math.abs(n);

        int sum = 0;

        //Keeps going until no digits are left
        while(n > 0)
        {
            //n % 10 gives the last digit so add it to sum
            sum += n % 10;

            //n / 10 chops off the last digit
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        int number = 123;

        //Prints the sum of the digits
        System.out.println(sumOfDigits(number));
    }
}
