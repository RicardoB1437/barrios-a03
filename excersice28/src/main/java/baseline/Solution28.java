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
    //Reluctantly changed so there will be an addNums class

    Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        AddNums calc = new AddNums();

        //initializing array that numbers will be stored in
        int[] arr = new int[5];
        for(int i=0;i<5;i++)
        {
            //take each number
            arr[i] = calc.takeInput();
        }

        //pass off array of numbers to addNums funtion and print
        int total = calc.addNums(arr);
        System.out.printf("The total is %d.", total);
    }
}
