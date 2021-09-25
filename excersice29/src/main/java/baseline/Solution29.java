/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Ricardo Barrios
 */

package baseline;

/*
 * all methods/classes previously here were placed in appropriate classes
 */

public class Solution29
{
    //Don’t allow the user to enter 0.
    //Don’t allow non-numeric values.
    //Use a loop to trap bad input, so you can ensure that the user enters valid values.

    public static void main(String[] args)
    {
        Exception test = new Exception();

        int years = 0;
        //do while loop to test condition at end of loop instead of beginning
        //ensures we prompt for input at least once
        do
        {
            String input = test.takeNum();
            years = test.exception(input);
        }
        while(years == -1);

        System.out.printf("It will take %d years to double your initial investment.", years);
    }
}
