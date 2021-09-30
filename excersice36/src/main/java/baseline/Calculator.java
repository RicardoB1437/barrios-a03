package baseline;

import java.util.*;
import java.util.Scanner;


public class Calculator
{

    Scanner input = new Scanner(System.in);

    private String takeNum()
    {
        System.out.print("Enter a number: ");
        return input.nextLine();
    }

    public List<Integer> makeList() throws NumberFormatException
    {
        Calculator calc = new Calculator();
        List<Integer> nums = new ArrayList<Integer>();

        String input;
        boolean flag = true;
        //take input until user enters "done"
        while(flag)
        {
            int inputNum;
            try
            {
                input = calc.takeNum();
                //check if string equals done
                if(input.equals("done"))
                    break;
                //check if valid input
                inputNum = Integer.parseInt(input);
                nums.add(inputNum);
            }
            //throw exception if string cant be parsed into int
            catch (NumberFormatException e)
            {
                System.out.println("Invalid input. ");
            }
        }
        return nums;
    }

    //does average of integer list
    public double averageInts(List<Integer> nums)
    {
        double sum = 0;
        for(int i=0;i<nums.size();i++)
        {
            sum += nums.get(i);
        }
        return sum / nums.size();
    }

    //does average of double list
    public double averageDoubles(List<Double> nums)
    {
        double sum = 0;
        for(int i=0;i<nums.size();i++)
        {
            sum += nums.get(i);
        }
        return sum / nums.size();
    }

    public double max(List<Integer> nums)
    {
        double max = nums.get(0);
        for(int i=1;i<nums.size();i++)
        {
            if (nums.get(i) > max)
                max = nums.get(i);
        }
        return max;
    }

    public double min(List<Integer> nums)
    {
        double min = nums.get(0);
        for(int i=1;i<nums.size();i++)
        {
            if (nums.get(i) < min)
                min = nums.get(i);
        }
        return min;
    }

    public double std(List<Integer> nums)
    {
        //create temp list
        List<Double> temp = new ArrayList<Double>();

        //call avg func on nums
        double numsAvg = averageInts(nums);
        for(int i=0;i<nums.size();i++)
        {
            temp.add((nums.get(i) - numsAvg) * (nums.get(i) - numsAvg));
        }

        //call avg on temp list
        double tempAvg = averageDoubles(temp);
        return Math.sqrt(tempAvg);
    }

    public void printValues(List<Integer> nums, double avg, double max, double min, double std)
    {
        System.out.print("Numbers: ");
        //print out numbers
        for(int i=0;i<nums.size();i++)
        {
            if(i == nums.size() - 1)
                System.out.printf("%d ", nums.get(i));
            else
                System.out.printf("%d, ", nums.get(i));
        }
        System.out.println("");
        System.out.printf("The average is %.1f%n", avg);
        System.out.printf("The minimum is %.0f%n", min);
        System.out.printf("The maximum is %.0f%n", max);
        System.out.printf("The standard deviation is %.2f%n", std);
    }

}
