import java.util.Scanner;

class Vowels
{
    static int countVowels(String str)
    {
        int count = 0;

        str = str.toLowerCase();

        for(char ch : str.toCharArray())
        {
            if("Hello".indexOf(ch) != -1)
            {
                count++;
            }

        }
        return count;
    }
}

public class NumberofVowels
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int countVowels = Vowels.countVowels(str);

        System.out.println("number of vowels: " + countVowels);
    }
}