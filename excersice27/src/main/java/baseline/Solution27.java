/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Ricardo Barrios
 */

package baseline;
import java.util.Scanner;

/*
 * all methods/classes previously here were placed in their proper locations
 */

public class Solution27
{

    Scanner input = new Scanner(System.in);

    private String takeFName()
    {
        System.out.print("Enter the first name: ");
        return input.nextLine();
    }

    private String takeLName()
    {
        System.out.print("Enter the last name: ");
        return input.nextLine();
    }

    private String takeZip()
    {
        System.out.print("Enter the ZIP code: ");
        return input.nextLine();
    }

    private String takeID()
    {
        System.out.print("Enter the employee ID: ");
        return input.nextLine();
    }

    public static void main(String[] args)
    {
        Solution27 sol = new Solution27();
        Validator val = new Validator();

        //prompt user for input, call on user input functions
        String fName = sol.takeFName();
        String lName = sol.takeLName();
        String zip = sol.takeZip();
        String ID = sol.takeID();

        //call on validateInput(String fName, String lName, String zip, String ID)
        //validate input will then print errors
        val.validateInput(fName, lName, ID, zip);
    }
}
