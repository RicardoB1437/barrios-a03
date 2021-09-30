package baseline;

import java.util.*;
import java.util.Scanner;

public class MagicBall
{

    Scanner input = new Scanner(System.in);

    public String getQuestion()
    {
        //prompt user for question
        System.out.println("What's your question?");
        System.out.print("> ");
        return input.nextLine();
    }

    public String magicAnswer(int randNum)
    {
        List<String> list1 = new ArrayList<String>();
        list1.add("Yes.");
        list1.add("No.");
        list1.add("Maybe.");
        list1.add("Ask again later.");
        return list1.get(randNum);
    }
}
