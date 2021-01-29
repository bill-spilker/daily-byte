package com.spilker;

import java.lang.ref.SoftReference;
import java.util.Locale;

public class ValidPalindrome
{
    /*
    This question is asked by Facebook. Given a string, return whether or not
    it forms a palindrome ignoring case and non-alphabetical characters.

    Note: a palindrome is a sequence of characters that reads the same forwards and backwards.

    Ex: Given the following strings...

    ```
    "level", return true
    "algorithm", return false
    "A man, a plan, a canal: Panama.", return true
    ```
     */

    public static boolean validate(String input)
    {
        System.out.println("Input: " + input);
        String stripped = input.replaceAll("[^A-Za-z]", "").toUpperCase();
        System.out.println("Stripped input: " + stripped);

        int length = stripped.length();
        System.out.println("Length: " + length);
        if (length % 2 != 0)
        {
            length = length - 1;
            System.out.println("Modified Length: " + length);
        }

        System.out.println("For loop length: " + length/2);
        for(int i = 0; i < length/2; i++)
        {
            System.out.println("Iteration : " + i);
            System.out.println("Beginning Char: " + stripped.charAt(i));
            System.out.println("End Char: " + stripped.charAt(length - i));
            if(stripped.charAt(i) != stripped.charAt(length - i))
            {
                return false;
            }
        }
        return true;
    }
}
