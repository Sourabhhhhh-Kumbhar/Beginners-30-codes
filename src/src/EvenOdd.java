class Hey
{
    void checkEvenOdd(int a)
    {
        if ( a % 2 == 0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}

public class EvenOdd
{
    public static void main(String[] args)
    {
        Hey obj = new Hey();

        obj.checkEvenOdd(7);
    }
}
