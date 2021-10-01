/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Ricardo Barrios
 */

package baseline;
import java.util.Scanner;
import java.util.*;

/*
 * all current methods/classes will be placed in their proper locations after psuedocode is done
 * they are all here simply for the moment so that i can visualize all code together
 */

public class Solution38
{
    //

    public static void main(String[] args)
    {
        NumList numbers = new NumList();

        //prompt user for list of numbers
        String input = numbers.takeInput();

        //take input and put into list of nums
        List<Integer> nums = numbers.filterSpaces(input);

        //take list of nums and filter even nums
        List<Integer> evenNums = numbers.filterEvenNumbers(nums);

        //print list
        numbers.printList(evenNums);

    }
}
