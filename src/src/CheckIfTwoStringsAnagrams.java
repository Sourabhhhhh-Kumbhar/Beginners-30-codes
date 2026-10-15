import java.util.*;

import java.util.Arrays;

public class CheckIfTwoStringsAnagrams
{
    public static boolean checkIfTwoStringsAnagrams(String s1, String s2)
    {
        if (s1 == null || s2 == null) return false;

        // Ignore case and spaces
        s1 = s1.replaceAll("\\s+", "").toLowerCase();
        s2 = s2.replaceAll("\\s+", "").toLowerCase();

        if (s1.length() != s2.length()) return false;

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }

    public static void main(String[] args)
    {
        System.out.println(checkIfTwoStringsAnagrams("Listen", "Silent"));        // true
        System.out.println(checkIfTwoStringsAnagrams("Dormitory", "Dirty Room")); // true
        System.out.println(checkIfTwoStringsAnagrams("Hello", "World"));          // false
    }
}