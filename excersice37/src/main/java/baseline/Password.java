package baseline;

import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Password
{

    Scanner input = new Scanner(System.in);

    public int takePassLength()
    {
        System.out.print("What's the minimum length? ");
        return input.nextInt();
    }

    public int takeNumSpecial()
    {
        System.out.print("How many special characters? ");
        return input.nextInt();
    }

    public int takeNumNumbers()
    {
        System.out.print("How many numbers? ");
        return input.nextInt();
    }

    public List<Character> makeNumList()
    {
        List<Character> nums = new ArrayList<>();
        nums.add('0');
        nums.add('1');
        nums.add('2');
        nums.add('3');
        nums.add('4');
        nums.add('5');
        nums.add('6');
        nums.add('7');
        nums.add('8');
        nums.add('9');
        return nums;
    }

    public List<Character> makeCharList()
    {
        List<Character> chars = new ArrayList<>();
        for(int i=0;i<26;i++)
        {
            //take 'a' and convert to ascii, then add i and convert back to char and add
            //mostly because i dont feel like adding in all individual letters lol
            char a = 'a';
            int value = (int) a + i;
            char addChar = (char) value;
            chars.add(addChar);
        }
        return chars;
    }

    public List<Character> makeSpecialList()
    {
        List<Character> special = new ArrayList<>();
        special.add('!');
        special.add('@');
        special.add('#');
        special.add('$');
        special.add('%');
        special.add('^');
        special.add('&');
        special.add('*');
        return special;
    }

    public List<Character> makePassword(List<Character> nums, List<Character> chars, List<Character> spec, int passLength, int numNumbers, int numSpecial)
    {
        Random rand = new Random();
        List<Character> password = new ArrayList<>();

        int totalLetters = passLength-numNumbers-numSpecial;
        int special = 0;
        int num = 0;
        int letter = 0;
        int newPasswordLength = 0;

        while(newPasswordLength < passLength)
        {
            int selectorNum = rand.nextInt(3) + 1;

            //special case
            if(special == numSpecial && num == numNumbers)
            {
                int randChar = rand.nextInt(chars.size());
                password.add(chars.get(randChar));
                newPasswordLength++;
                continue;
            }
            switch(selectorNum)
            {
                case 1:
                    //reached max letters
                    if(letter == totalLetters)
                        break;
                    else
                    {
                        int randChar = rand.nextInt(chars.size());
                        password.add(chars.get(randChar));
                        letter++;
                        newPasswordLength++;
                        break;
                    }
                case 2:
                    //reached max special characters specified
                    if(special == numSpecial)
                        break;
                    else
                    {
                        int randSpecial = rand.nextInt(spec.size());
                        password.add(spec.get(randSpecial));
                        special++;
                        newPasswordLength++;
                        break;
                    }
                case 3:
                    //reached max numbers specified
                    if(num == numNumbers)
                        break;
                    else
                    {
                        int randNum = rand.nextInt(nums.size());
                        password.add(nums.get(randNum));
                        num++;
                        newPasswordLength++;
                        break;
                    }
            }
        }
        return password;
    }

    public void printPass(List<Character> pass)
    {
        System.out.print("Your password is ");
        for(int i=0;i<pass.size();i++)
        {
            System.out.printf("%c", pass.get(i));
        }
    }
}
