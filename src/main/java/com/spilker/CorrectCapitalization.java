package com.spilker;

public class CorrectCapitalization {

    /*
    This question is asked by Google.

    Given a string, return whether or not it uses capitalization correctly.
    A string correctly uses capitalization if all letters are capitalized,
    no letters are capitalized, or only the first letter is capitalized.

    Ex: Given the following strings...

    "USA", return true
    "Calvin", return true
    "compUter", return false
    "coding", return true
     */
    public static boolean capitalizationCheck(String input)
    {
        char[] inputArray = input.toCharArray();

        int capitalCounter = 0;
        for(char character: inputArray)
        {
            if(Character.isUpperCase(character))
            {
                capitalCounter++;
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Length: " + inputArray.length);
        System.out.println("Counter: " + capitalCounter);
        System.out.println("First char: " + inputArray[0]);
        System.out.println();
        boolean allCapital = inputArray.length == capitalCounter;
        boolean noCapital = capitalCounter == 0;
        boolean firstCapital = Character.isUpperCase(inputArray[0]) && capitalCounter == 1;

        return allCapital || noCapital || firstCapital;
    }
}
