/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Ricardo Barrios
 */

package baseline;
import java.util.Scanner;
import java.util.Arrays;

public class Solution24
{
    // need to take in strings and break them apart into arrays of chars so we can access each individual letter
    // check if strings are anagrams

    private static Scanner input = new Scanner(System.in);


    public static void main(String[] args)
    {
        //create object to use non static class
        anagram name = new anagram();

        //prompt user for strings to check
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.print("Enter the first string: ");
        String word1 = input.nextLine();

        System.out.print("Enter the second string: ");
        String word2 = input.nextLine();

        //pass off to anagram check
        //if returns true print true statement else print false statement
        if(name.isAnagram(word1, word2))
            System.out.printf("\"%s\" and \"%s\" are anagrams.%n", word1, word2);
        else
            System.out.printf("\"%s\" and \"%s\" are not anagrams.%n", word1, word2);
    }
}
