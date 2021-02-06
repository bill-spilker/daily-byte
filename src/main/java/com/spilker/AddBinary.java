package com.spilker;

import java.sql.SQLOutput;

public class AddBinary
{
    /*
    This question is asked by Apple.
    Given two binary strings (strings containing only 1s and 0s)
    return their sum (also as a binary string).

    Note: neither binary string will contain leading 0s unless the string itself is 0

    Ex: Given the following binary strings...

    "100" + "1", return "101"
    "11" + "1", return "100"
    "1" + "0", return  "1"
     */
    public static String addBinary(String first, String second)
    {
        // First, going to make the two string the same length so when looping
        // later we know the strings are the same length which will help when
        // we have to do a carry
        int firstLength = first.length();
        int secondLength = second.length();

        if (firstLength > secondLength)
        {
            int difference = firstLength - secondLength;
            second = appendLendingZeros(difference, second);
            System.out.println("Second: " + second);
        }
        else if (firstLength < secondLength)
        {
            int difference = secondLength - firstLength;
            first = appendLendingZeros(difference, first);
            System.out.println("First: " + first);
        }

        // Now Looping Through the strings starting at the end
        //
        // Grabbing the two characters start at the end to start the addition
        //
        // Then Adding carrying logic for when a carry needs to happen
        StringBuilder sb = new StringBuilder();
        int indexedLength = first.length() - 1;
        boolean carry = false;
        for(int i=0; i <= indexedLength; i++)
        {
            char one = first.charAt(indexedLength - i);
            char two = second.charAt(indexedLength - i);

            if(one == '1' && two == '1' && !carry)
            {
                sb.insert(0,'0');
                carry = true;
            }
            else if(one == '1' && two == '1' && carry)
            {
                sb.insert(1,'0');
                carry = true;
            }
            else if(((one == '1' && two == '0') || (one == '0' && two == '1'))  && !carry)
            {
                sb.insert(0, '1');
                carry = false;
            }
            else if(((one == '1' && two == '0') || (one == '0' && two == '1'))  && carry)
            {
                sb.insert(0, '0');
                carry = true;
            }
            else if (one == '0' && two == '0' && !carry)
            {
                sb.insert(0, '0');
                carry = false;
            }
            else if (one == '0' && two == '0' && carry)
            {
                sb.insert(0, '1');
                carry = false;
            }
        }
        // If ending with carry true, need to append the carry to the results
        if(carry)
        {
            sb.insert(0, '1');
        }

        return sb.toString();
    }

    public static String appendLendingZeros(int difference, String input)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < difference; i++)
        {
            sb.append("0");
        }
        sb.append(input);
        return sb.toString();
    }
}
