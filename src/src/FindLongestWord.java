public class FindLongestWord
{
    static int longestWord(String sentence)
    {
        String[] words = sentence.split(" ");
        int max = 0;

        for (String word : words)
        {
            if (word.length() > max)
            {
                max = word.length();
            }
        }
        return max;
    }
}

public static void main (String[] args)
{
    String sentence = "Java is very powerful";

    System.out.println(FindLongestWord.longestWord(sentence));
}