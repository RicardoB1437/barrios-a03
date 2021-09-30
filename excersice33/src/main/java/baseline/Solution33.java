/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Ricardo Barrios
 */

package baseline;
import java.util.Random;

/*
 * all previous methods/classes located here were placed in appropriate classes
 */


public class Solution33
{
    //Create a Magic 8 Ball game that prompts for a question
    //and then displays either "Yes," "No," "Maybe," or "Ask again later."
    //create class with a function that holds arrayList


    public static void main(String[] args)
    {
        Random rand = new Random();
        MagicBall ball = new MagicBall();

        String question = ball.getQuestion();

        //create magic num from 0-3
        int randNum = rand.nextInt(4);
        String answer = ball.magicAnswer(randNum);

        //print out answer
        System.out.printf("%n%s", answer);
    }
}
