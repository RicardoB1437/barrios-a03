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

public class Solution30
{
    //Create a program that generates a multiplication table for the numbers 1 through 12 (inclusive).
    //Use a nested loop to complete this program.
    //Align each column within the table without using the tab character.

    public static void main(String[] args)
    {
        Table table = new Table();

        //calls on makeTable function, which prints each row and formats the spaces
        table.makeTable();
    }
}
