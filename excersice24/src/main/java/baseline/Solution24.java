package baseline;
import java.util.Scanner;
import java.util.Arrays;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Ricardo Barrios
 */

public class Solution24
{
    // need to take in strings and break them apart into arrays of chars so we can access each individual letter
    // check if strings are anagrams

    private static Scanner input = new Scanner(System.in);

    private boolean anagramCheck(String str1, String str2)
    {
        //base case
        if(str1.length() != str2.length())
            return false;

        //break string into char array
        char[] str1ToChar = str1.toCharArray();
        char[] str2ToChar = str2.toCharArray();

        //use char array to compare letters in each string
        //sorts char arrays into alphabetical order
        Arrays.sort(str1ToChar);
        Arrays.sort(str2ToChar);

        //convert sorted char array back into string and use .equals to compare if equal and return
        str1 = String.valueOf(str1ToChar);
        str2 = String.valueOf(str2ToChar);
        return str1.equals(str2);
    }

    public static void main(String[] args)
    {
        //create object to use non static class
        Solution24 sol = new Solution24();

        //prompt user for strings to check
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.print("Enter the first string: ");
        String word1 = input.nextLine();

        System.out.print("Enter the second string: ");
        String word2 = input.nextLine();

        //pass off to anagram check
        //if returns true print true statement else print false statement
        if(sol.anagramCheck(word1, word2))
            System.out.printf("\"%s\" and \"%s\" are anagrams.%n", word1, word2);
        else
            System.out.printf("\"%s\" and \"%s\" are not anagrams.%n", word1, word2);
    }
}
