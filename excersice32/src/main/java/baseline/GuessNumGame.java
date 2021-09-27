package baseline;
import java.util.Scanner;
import java.util.Random;

public class GuessNumGame
{
    Scanner input = new Scanner(System.in);

    private String takeDifficultyLevel()
    {
        System.out.print("Enter the difficulty level (1, 2, or 3): ");
        return input.nextLine();
    }

    public int exceptionCheck(String input)
    {
        //use try catch inside while loop to continuously ask for input if string cant be parsed
        //while loop is contained in separate function
        int inputNum;
        try
        {
            inputNum = Integer.parseInt(input);
            return inputNum;
        }
        //throw exception if string cant be parsed into int
        catch (NumberFormatException e)
        {
            return -1;
        }
    }

    public int takeValidDifficultyLevel()
    {
        //loop until valid input is reached
        //call exception check
        GuessNumGame game1 = new GuessNumGame();
        int num = 0;
        do
        {
            String input = game1.takeDifficultyLevel();
            num = game1.exceptionCheck(input);
            if(num > 3 || num < 1)
            {
                System.out.println("Invalid difficulty. Try again.");
                num = -1;
            }
        }
        while(num == -1);

        return num;
    }


    //returns value based on if guessNum > < or = to targetNum
    public int isHighOrLow(int targetNum, int guessNum)
    {
        if(guessNum > targetNum)
        {
            System.out.print("Too high. Guess again: ");
            return 1;
        }
        else if(guessNum < targetNum)
        {
            System.out.print("Too low. Guess again: ");
            return -1;
        }
        else
            return 0; // guessNum = targetNum
    }

    //create magic num

    private int createMagicNum(int difficultyLevel)
    {
        Random rand = new Random();
        if(difficultyLevel == 1)
            return rand.nextInt(10) +1;
        else if(difficultyLevel == 2)
            return rand.nextInt(100) + 1;
        else
            return rand.nextInt(1000) + 1;
    }

    private boolean endGame(int guesses)
    {
        //at this point the correct number should have been guessed
        System.out.printf("You got it in %d guesses!%n%n", guesses + 1); //+1 accounts for correct guess
        System.out.print("Do you wish to play again (Y/N)? ");
        String playAgain = input.nextLine();
        playAgain = playAgain.toLowerCase(); // makes answer unaffected by capitalization
        if(playAgain.equals("y"))
            return true;
        else
            return false;
    }

    public boolean playGame(int difficultyLevel)
    {
        GuessNumGame game1 = new GuessNumGame();
        int magicNum = game1.createMagicNum(difficultyLevel);

        int flag = 0;
        int wrongGuessCount = 0;
        String guess;
        int guessNum;
        //create loop of taking in user guesses until correct number is input
        System.out.print("I have my number. What's your guess? ");
        do
        {
            //take user guess // not in separate function because i need two numbers returned from this process
            guess = input.nextLine();
            guessNum = game1.exceptionCheck(guess);
            if(guessNum == -1) // special case if invalid input
            {
                wrongGuessCount++;
                System.out.print("Invalid input. Guess again: ");
                flag = -1;
            }
            else // input should be valid
            {
                //determine if entered number is too high or low
                flag = isHighOrLow(magicNum, guessNum);
                if(flag != 0)
                    wrongGuessCount++;
            }
        }
        while(flag != 0); // while guessNum != magicNum
        return game1.endGame(wrongGuessCount);
    }
}
