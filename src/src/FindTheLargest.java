class Large
{
    void large()
    {
        int a = 10;
        int b = 70;
        int c = 23;

        int largest = Math.max(a , Math.max(b , c));

        System.out.println("Largest number is " + largest);
    }
}

public class FindTheLargest
{
    public static void main(String[] args)
    {
        Large obj = new Large();

        obj.large();
    }
}


//Using If Else
//if (a >= b && a >= c) {
//    System.out.println(a);
//} else if (b >= a && b >= c) {
//    System.out.println(b);
//} else {
//    System.out.println(c);
//}