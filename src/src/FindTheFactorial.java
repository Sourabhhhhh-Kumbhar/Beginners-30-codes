class FindFactorial
{
    void factorial(int n)
    {
        int factorial = 1;

        for (int i = 1; i <= n; i++)
        {
            factorial = factorial * i;
        }

        System.out.println("Factorial is: " + factorial);
    }
}

public class FindTheFactorial
{
    public static void main(String[] args)
    {
        FindFactorial obj = new FindFactorial();

        obj.factorial(5);
    }
}

//Formula
//
//n! = n × (n−1) × (n−2) × ... × 1
//
//For example:
//
//5! = 5 × 4 × 3 × 2 × 1 = 120
//
//You can remember the Java logic as:
//
//factorial = factorial * i