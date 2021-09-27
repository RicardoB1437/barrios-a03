/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Ricardo Barrios
 */

package baseline;
import java.util.Scanner;

/*
 * all current methods/classes will be placed in their proper locations after psuedocode is done
 * they are all here simply for the moment so that i can visualize all code together
 */
public class Solution32
{
    //Prompt for the difficulty level, and then start the game.
    // The computer picks a random number in that range and prompts the player to guess that number.
    // Each time the player guesses,
    // the computer should give the player a hint as to whether the number is too high or too low.
    // The computer should also keep track of the number of guesses.
    // Once the player guesses the correct number,
    // the computer should present the number of guesses and ask if the player would like to play again.
    // level 1 = 1-10 // level 2 = 1-100 // level 3 = 1-1000

    Scanner input = new Scanner(System.in);

    private String takeDifficultyLevel()
    {
        //System.out.print("Enter the difficulty level (1, 2, or 3): ");
        //return input.nextLine();
    }

    public int exceptionCheck(String input)
    {
        //use try catch to filter bad input
    }

    public int takeValidNum()
    {
        //loop until valid input is reached
        //call exception check
    }

    public boolean playGame(int difficultyLevel)
    {
        //call all necessary functions
        //Do you wish to play again (Y/N)? y
        //return true if y else return false
    }

    public static void main(String[] args)
    {
        //call playGame(difficultyLevel);
    }
}
