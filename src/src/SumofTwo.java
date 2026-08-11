class Sumof
{
    void sum(int a, int b)
    {
        int sum = a + b;

        System.out.println(sum);
    }
}

public class SumofTwo
{
    public static void main(String[] args)
    {
        Sumof obj = new Sumof();

        obj.sum(4 , 5);
    }
}