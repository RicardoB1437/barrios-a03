/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Ricardo Barrios
 */

package baseline;
import java.util.Scanner;
import java.util.*;
import java.util.Random;

/*
 * all current methods/classes will be placed in their proper locations after psuedocode is done
 * they are all here simply for the moment so that i can visualize all code together
 */

public class Solution37
{
    //

    public static void main(String[] args)
    {
        Password pass = new Password();

        List<Character> nums = pass.makeNumList();
        List<Character> chars = pass.makeCharList();
        List<Character> special = pass.makeSpecialList();

        //prompt for length, num chars, num special
        int passLength = pass.takePassLength();
        int numNumbers = pass.takeNumNumbers();
        int numSpecial = pass.takeNumSpecial();

        //make password
        List<Character> password = pass.makePassword(nums, chars, special, passLength, numNumbers, numSpecial);
        //print password
        pass.printPass(password);
    }
}
