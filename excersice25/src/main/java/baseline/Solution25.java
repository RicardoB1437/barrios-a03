/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Ricardo Barrios
 */

package baseline;
import java.util.Scanner;

public class Solution25
{
    //all methods previously in solution class in shell code have been moved to appropriate classes

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        password pass = new password();

        //prompt user for a password
        System.out.print("Enter password: ");
        String password = input.nextLine();

        //pass off password to passValidator and print (technically single output line)
        int result = pass.passwordValidator(password);
        pass.printResult(result, password);

    }
}
