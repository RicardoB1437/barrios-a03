package baseline;
import java.util.Scanner;

public class AddNums
{

    Scanner input = new Scanner(System.in);

    public int takeInput()
    {
        System.out.print("Enter a number: ");
        return input.nextInt();
    }

    //needed to change parameter to take in array for testing purposes
    public int addNums(int arr[])
    {
        int total = 0;
        for(int i=0;i<5;i++)
        {
            total += arr[i];
        }
        return total;
    }
}
