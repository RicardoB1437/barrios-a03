/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Ricardo Barrios
 */

package baseline;

/*
 * all methods/classes previously located here were placed in appropriate classes
 */
public class Solution32
{
    public static void main(String[] args)
    {
        GuessNumGame game1 = new GuessNumGame();

        int difficultyLevel = game1.takeValidDifficultyLevel();

        boolean keepPlaying = true;
        while(keepPlaying)
        {
            keepPlaying = game1.playGame(difficultyLevel);
            if(keepPlaying)// ask for new difficulty if new game
            {
                difficultyLevel = game1.takeValidDifficultyLevel();
            }
        }
    }
}
