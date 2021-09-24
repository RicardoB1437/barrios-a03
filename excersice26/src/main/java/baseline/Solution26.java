/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Ricardo Barrios
 */

package baseline;

/*
 * all methods previously in this code were moved to their appropriate classes
 */

public class Solution26
{
    public static void main(String[] args)
    {
        PaymentCalculator calc = new PaymentCalculator();

        //call on calculateMonthsUntilPaidOff function and use to print result
        double months = calc.calculateMonthsUntilPaidOff();
        System.out.printf("It will take you %.0f months to pay off this card.", months);
    }
}
