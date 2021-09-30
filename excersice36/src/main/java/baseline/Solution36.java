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

public class Solution36
{
    //

    public static void main(String[] args)
    {
        Calculator calc = new Calculator();

        //create list
        List<Integer> nums = calc.makeList();

        //calculate values
        double avg = calc.averageInts(nums);
        double max = calc.max(nums);
        double min = calc.min(nums);
        double std = calc.std(nums);

        //print values
        calc.printValues(nums, avg, max, min, std);
    }
}
