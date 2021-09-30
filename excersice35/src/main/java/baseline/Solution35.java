/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Ricardo Barrios
 */

package baseline;
import java.util.*;
import java.util.Random;

/*
 * all previous methods/classes located here were placed in their appropriate classes
 */

public class Solution35
{
    //

    public static void main(String[] args)
    {
        Lottery lot = new Lottery();
        Random rand = new Random();

        //create list
        List<String> names = lot.makeList();

        //get list length
        int listLength = names.size();

        //get winner
        int winNum = rand.nextInt(listLength);
        String winner = lot.pickWinner(names, winNum);

        //print winner
        System.out.printf("The winner is... %s", winner);
    }
}
