class PalindromeString
{
    void checkString()
    {
        String str = "madam";

        String reversed = new StringBuilder(str).reverse().toString();

        if (str.equals(reversed))
            {
            System.out.println("Palindrome");
            }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
public class CheckStringPalindrome
{
    public static void main(String[] args)
    {
        PalindromeString obj = new PalindromeString();
        obj.checkString();
    }
}

//String == Reverse(String) → Palindrome
//String != Reverse(String) → Not Palindrome