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

    private String takeNum()
    {
        //System.out.print("Enter a number: ");
        //return input.nextLine();
    }

    public List<Integer> makeList() throws exception
    {
        //List<Integer> nums = new ArrayList<Integer>();
        //while loop
        //use try catch and parse strings as nums and place in list
        //call takeNum
        //check if string equals "done" before parsing
        //add to list until takeNum returns "done"
        //return list
    }

    public double average(List<Integer> nums)
    {
        //double sum = 0;
        //for loop through length of list
        //sum += nums.get(i)
        //return sum / nums.size();
    }

    public double max(List<Integer> nums)
    {
        //double max = nums.get(0);
        //for loop through length of list
        //if nums.get(i) > max max = nums.get(i)
        //return max
    }

    public double min(List<Integer> nums)
    {
        //double min = nums.get(0);
        //for loop through length of list
        //if nums.get(i) < min min = nums.get(i)
        //return min
    }

    public double std(List<Integer> nums)
    {
        //create temp list
        //call avg func on nums
        //loop through length of list
        //add ((nums.get(i) - avg) * (nums.get(i) - avg))
        //call avg on temp list
        //return square root of temp avg
    }

    public void printValues(List<Integer> nums, double avg, double max, double min, double std)
    {
        //System.out.print("Numbers: ");
        //loop through length of list
        //System.out.printf("%d", nums.get(i));
        //System.out.printf("The average is %f", avg);
        //The minimum is 100
        //The maximum is 1000
        //The standard deviation is 353.55
    }

    public static void main(String[] args)
    {
        //

        //create list
        //List<Integer> nums = calc.makeList();

        //calculate values
        //double avg
        //double max
        //double min
        //double std

        //print values
        //calc.print(nums, avg, max, min, std);
    }
}
