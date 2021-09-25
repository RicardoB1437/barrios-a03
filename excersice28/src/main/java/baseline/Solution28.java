/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Ricardo Barrios
 */

package baseline;
import java.util.Scanner;


public class Solution28
{
    //Write a program that prompts the user for five numbers and computes the total of the numbers.
    //The prompting must use repetition, such as a counted loop, not three separate prompts.
    //This code is extremely simple and using separate classes would just be over the top

    Scanner input = new Scanner(System.in);

    //made public to aid in testing (which doesnt work anyway since junit doesnt prompt for input)
    public int addNums()
    {
        int total = 0;
        //loop through 5 times and ask for a number
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter a number: ");
            total += input.nextInt();
        }
        return total;
    }

    public static void main(String[] args)
    {
        Solution28 sol = new Solution28();
        int total = sol.addNums();
        System.out.printf("The total is %d.", total);
    }
}
