package baseline;
import java.util.Scanner;
import java.lang.ArithmeticException;

public class Exception
{

    Scanner input = new Scanner(System.in);

    //input now being taken outside exception for testing purposes
    public String takeNum()
    {
        System.out.print("What is the rate of return? ");
        return input.nextLine();
    }

    //exception now returns -1 if exception is thrown and loop is handled in main
    //returns years according to formula if no exception is thrown (valid input)
    public int exception(String numString)
    {
        //use try catch for exceptions
        int years = 0;
        int returnRateNum = 0;
        Boolean flag = true;

        try
        {
            returnRateNum = Integer.parseInt(numString);
            years = 72 / returnRateNum;
        }
        //throw exception if string cant be parsed into int
        catch (NumberFormatException e)
        {
            System.out.println("Sorry. That's not a valid input.");
            return -1;
        }
        //throw exception if dividing by 0
        catch (ArithmeticException e)
        {
            System.out.println("Sorry. That's not a valid input.");
            return -1;
        }

        return years;
    }

}
