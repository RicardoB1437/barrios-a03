package baseline;
import java.util.Scanner;



public class PaymentCalculator
{
    Scanner input = new Scanner(System.in);

    //change the value of n
    public double calculateMonthsUntilPaidOff()
    {
        //create variables and round up fractions of cents
        double bal = inputBalance();
        double APR = inputAPR() / 100.0;
        double pay = inputMonthlyPayment();
        double dailyRate = APR / 365.0;
        return -((1.0/30) * Math.log(1 + (Math.round(bal/pay*100)/100.0) * (1 - Math.pow((1 + dailyRate), 30))) / Math.log(1 + dailyRate));
    }

    //changed getInformation to specific input functions
    private int inputBalance()
    {
        int balance;
        System.out.print("What is your balance? ");
        balance = input.nextInt();
        return balance;
    }
    private double inputAPR()
    {
        int APR;
        System.out.print("What is the APR on the card (as a percent)? ");
        APR = input.nextInt();
        return APR;
    }
    private double inputMonthlyPayment()
    {
        int monthlyPay;
        System.out.print("What is the monthly payment you can make? ");
        monthlyPay = input.nextInt();
        return monthlyPay;
    }
}
