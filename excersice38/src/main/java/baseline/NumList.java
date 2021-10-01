package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumList
{

    Scanner input = new Scanner(System.in);

    public String takeInput()
    {
        System.out.print("Enter a list of numbers, separated by spaces: ");
        return input.nextLine();
    }

    public List<Integer> filterSpaces(String input) throws NumberFormatException
    {
        List<Integer> nums = new ArrayList<>();

        //split string and put in array
        String[] arr = input.split(" ");

        //take the array and go to each index
        int listNum;
        for(int i=0;i<arr.length;i++)
        {
            try
            {
                listNum = Integer.parseInt(arr[i]);
                nums.add(listNum);
            }
            catch (NumberFormatException e)
            {
                //if cant be parsed into int then skip index
                continue;
            }
        }
        return nums;
    }

    public List<Integer> filterEvenNumbers(List<Integer> nums)
    {
        List<Integer> evenList = new ArrayList<>();

        for(int i=0;i<nums.size();i++)
        {
            if(nums.get(i) %2 == 0)
                evenList.add(nums.get(i));
        }
        return evenList;
    }

    public void printList(List<Integer> nums)
    {
        System.out.print("The even numbers are ");
        for(int i=0;i<nums.size();i++)
        {
            System.out.printf("%d ", nums.get(i));
        }
    }
}
