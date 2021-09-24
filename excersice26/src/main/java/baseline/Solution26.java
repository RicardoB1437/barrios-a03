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

public class Solution26
{
    //Round fractions of a cent up to the next cent for internal calculations

    Scanner input = new Scanner(System.in);

    //goes in PaymentCalculator class
    public int calculateMonthsUntilPaidOff()
    {
        //n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        //n is the number of months.
        //i is the daily rate (APR divided by 365).
        //b is the balance.
        //p is the monthly payment.
        //return n
    }

    //goes in PaymentCalculator class
    private void getInformation()
    {
        //What is your balance? 5000
        //What is the APR on the card (as a percent)? 12
        //What is the monthly payment you can make? 100
    }

    public static void main(String[] args)
    {
        //PaymentCalculator calc = new PaymentCalculator();
        //call on getInformation function to get information
        //call on calculateMonthsUntilPaidOff function and use to print result
    }
}
