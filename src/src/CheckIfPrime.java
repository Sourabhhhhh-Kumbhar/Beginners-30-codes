class CheckPrime
{
    static boolean isPrime(int num)
    {
        if (num <= 1)
        {
            return false;
        }

        for (int i = 2; i < num; i++)
        {
            if(num % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}

public class CheckIfPrime
{
    public static void main(String[] args)
    {
        int num = 7;

        boolean result = CheckPrime.isPrime(num);

        System.out.println("Is " + num + " Prime? " + result);
    }
}