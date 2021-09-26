/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Ricardo Barrios
 */

package baseline;
import java.util.Scanner;

/*
 * all current methods/classes will be placed in their proper locations after psuedocode is done
 * they are all here simply for the moment so that i can visualize all code together
 */

public class Solution31
{
    //Don’t hard-code the percentages. Use a loop to increment the percentages from 55 to 95.
    //Ensure that the heart rate and age are entered as numbers. Don’t allow the user to continue
    // without entering valid inputs.
    //Display the results in a tabular format.

    Scanner input = new Scanner(System.in);

    private String takeRestingHR()
    {
        //System.out.print("Resting Pulse: ");
        //return input.nextLine();
    }

    private String takeAge()
    {
        //System.out.print("Age: ");
        //return input.nextLine();
    }

    public int exceptionCheck(String input)
    {
        //use try catch inside while loop to continuously ask for input if string cant be parsed
    }

    public void makeTable(int restingHR, int age)
    {
        //TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
        //generate table of targetHeartRates using formula
    }

    public static void main(String[] args)
    {
        //Table table1 = new Table();
        //call on makeTable function
    }
}
