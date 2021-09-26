package baseline;
import java.util.Scanner;

public class Table
{
    Scanner input = new Scanner(System.in);

    private String takeRestingHR()
    {
        System.out.print("Resting Pulse: ");
        return input.nextLine();
    }

    private String takeAge()
    {
        System.out.print("Age: ");
        return input.nextLine();
    }

    public int exceptionCheck(String input)
    {
        //use try catch inside while loop to continuously ask for input if string cant be parsed
        //while loop is contained in separate function
        int inputNum;
        try
        {
            inputNum = Integer.parseInt(input);
            return inputNum;
        }
        //throw exception if string cant be parsed into int
        catch (NumberFormatException e)
        {
            System.out.println("Sorry. That's not a valid input.");
            return -1;
        }
    }

    //loops through until valid input is reached
    public int takeValidAge()
    {
        Table table1 = new Table();
        int age = 0;
        do
        {
            String input = table1.takeAge();
            age = table1.exceptionCheck(input);
        }
        while(age == -1);

        return age;
    }

    //loops through until valid input is reached
    public int takeValidHR()
    {
        Table table1 = new Table();
        int HR = 0;
        do
        {
            String input = table1.takeRestingHR();
            HR = table1.exceptionCheck(input);
        }
        while(HR == -1);
        return HR;
    }

    private void makeHeader()
    {
        System.out.println("Intensity    | Rate   ");
        System.out.println("-------------|--------");
    }

    public void makeTable(int restingHR, int age)
    {
        //TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
        //generate table of targetHeartRates using formula
        Table table1 = new Table();

        double intensity = 55.0;
        double targetHeartRate;
        String percentSign = "%";

        table1.makeHeader();
        while(intensity <= 95)
        {
            targetHeartRate = (((220 - age) - restingHR) * (intensity/100)) + restingHR;
            System.out.printf("%.0f%s          | %.0f bpm%n", intensity, percentSign, targetHeartRate);
            intensity += 5;
        }
    }
}
