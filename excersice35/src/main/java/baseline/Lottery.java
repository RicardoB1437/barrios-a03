package baseline;

import java.util.*;
import java.util.Scanner;

public class Lottery
{

    Scanner input = new Scanner(System.in);

    private String takeName()
    {
        System.out.print("Enter a name: ");
        return input.nextLine();
    }

    public List<String> makeList()
    {
        List<String> names = new ArrayList<String>();

        boolean flag = true;
        while(flag)
        {
            String name = takeName();
            if(name.isEmpty())
            {
                flag = false;
                return names;
            }
            else
            {
                names.add(name);
            }
        }
        return names;
    }

    public String pickWinner(List<String> names, int winNum)
    {
        return names.get(winNum);
    }
}
