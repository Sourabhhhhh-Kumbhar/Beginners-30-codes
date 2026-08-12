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