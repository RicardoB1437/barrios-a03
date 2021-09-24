/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Ricardo Barrios
 */

package baseline;

/*
 * all current methods/classes will be placed in their proper locations after psuedocode is done
 * they are all here simply for the moment so that i can visualize all code together
 */

//Write a program that prompts for a first name, last name, employee ID, and ZIP code.
// Ensure that the input is valid according to these rules:
//
//The first name must be filled in.
//The last name must be filled in.
//The first and last names must be at least two characters long.
//An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
//The ZIP code must be a number.


public class Solution27
{
    //

    //all validate functions return 1 if true else return 0
    private int validateFirstName(String fName)
    {
        //check if fist name is empty, check if > 2 chars long
    }

    private int validateLastName(String lName)
    {
        //check if last name is empty, check if > 2 chars long
    }

    private int validateID(String ID)
    {
        //check if format is AA-1234
    }

    private int validateZip(String zip)
    {
        //parse in zip as a num if needed
        //check if zip is all nums and 5 digits long
    }

    public void validateInput(String fName, String lName, String ID, String zip)
    {
        //call on all specific validation functions
        //throw exceptions with try catch
        //if no errors print "There were no errors found."
    }

    public static void main(String[] args)
    {
        //prompt user for input, call on user input function
        //call on validateInput(String fName, String lName, String ID, String zip)
    }
}
