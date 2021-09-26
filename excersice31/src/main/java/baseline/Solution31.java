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

    public static void main(String[] args)
    {
        Table table1 = new Table();

        int restingHR = table1.takeValidHR();
        int age = table1.takeValidAge();
        table1.makeTable(restingHR, age);
    }
}
