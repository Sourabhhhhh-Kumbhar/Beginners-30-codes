class GCD
{
    static int findGCD(int a , int b)
    {
        while(b != 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

public class GreatestCommonDivisor
{
    public static void main(String[] args)
    {
        int num1 = 48;
        int num2 = 18;

        int result = GCD.findGCD(num1, num2);

        System.out.println("Greatest Common Divisor is: " + result);
    }
}

//Explanation
//
//For 48 and 18:
//
//48 % 18 = 12
//18 % 12 = 6
//12 % 6 = 0
//
//When the remainder becomes 0, the GCD is 6.