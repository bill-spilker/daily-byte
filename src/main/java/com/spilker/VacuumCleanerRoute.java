package com.spilker;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class VacuumCleanerRoute {

    /*
    This question is asked by Amazon. Given a string representing the sequence of moves a robot vacuum makes,
     return whether or not it will return to its original position.

     The string will only contain L, R, U, and D characters, representing left, right, up, and down respectively.

    Ex: Given the following strings...

    "LR", return true
    "URURD", return false
    "RUULLDRD", return true
     */
    public static boolean originalLocation(String moves) {
        moves = moves.toUpperCase();
        int x = 0;
        int y = 0;
        char[] movesArray = moves.toCharArray();
        for(char i: movesArray)
        {
            if(i == 'L'){
                x+= -1;
            }
            else if (i == 'R')
            {
                x+= 1;
            }
            else if (i == 'D')
            {
                y+= -1;
            }
            else if(i == 'U')
            {
                y+= 1;
            }
        }

        if(x == 0 && y == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
