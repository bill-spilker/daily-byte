package com.spilker;

public class ReverseString
{

    /*
    This question is asked by Google. Given a string, reverse all of its characters and return the resulting string.

    Ex: Given the following strings...

    “Cat”, return “taC”
    “The Daily Byte”, return "etyB yliaD ehT”
    “civic”, return “civic”
     */

    /**
     * Reverses String
     * @param input - String to be reversed
     * @return
     */
    public static String reverseString(String input)
    {
        System.out.println("Input: " + input);
        StringBuilder stringBuilder = new StringBuilder();
        char[] inputArray = input.toCharArray();

        for(char character: inputArray)
        {
            stringBuilder.insert(0, character);
        }

        String output = stringBuilder.toString();
        System.out.println("Output: " + output);
        return output;
    }
}
