import java.util.Scanner;

class StringReverse
{
    void reverse(String s)
    {
        String reversed = new StringBuilder(s).reverse().toString();

        System.out.println(reversed);
    }
}

public class ReverseString
{
    public static void main(String[] args)
    {
        String s = "Yoooooooooo";

        StringReverse obj = new StringReverse();

        obj.reverse(s);
    }
}

//Using Looop
//String str = "Hello";
//String reversed = "";
//
//for (int i = str.length() - 1; i >= 0; i--) {
//    reversed = reversed + str.charAt(i);
//}
//
//System.out.println(reversed);