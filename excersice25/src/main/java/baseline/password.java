package baseline;

public class password
{
    public int passwordValidator(String pass)
    {
        //break up pass into array of char
        char[] passToChar = pass.toCharArray();

        //determine what types of characters are in password
        //flag for each type of character (letter, number, special)
        int numCount = 0;
        int letterCount = 0;
        int specialCount = 0;
        int length = pass.length();
        for(int i=0;i<pass.length();i++)
        {
            if(Character.isDigit(passToChar[i]) && numCount < 1)
                numCount = 1;
            if(Character.isLetter(passToChar[i]) && letterCount < 1)
                letterCount = 1;
            if(!Character.isLetter(passToChar[i]) && !Character.isDigit(passToChar[i]) && specialCount < 1)
                specialCount = 1;
        }

        //return value 0-4 depending on pass strength
        return strengthOfPassword(numCount, letterCount, specialCount, length);
    }

    //created helper function to reduce clutter in passValidator function
    //return value 0-4 depending on pass strength
    private int strengthOfPassword(int num, int letter, int special, int length)
    {
        //base case
        if(num+letter+special == 0)
            return 0;
        //very weak password contains only numbers and is fewer than eight characters.
        else if(num == 1 && letter == 0 && special == 0 && length < 8)
            return 1;
        //weak password contains only letters and is fewer than eight characters.
        else if(num == 0 && letter == 1 && special == 0 && length < 8)
            return 2;
        //strong password contains letters and at least one number and is at least eight characters.
        else if(num+letter == 2 && special == 0 && length > 8)
            return 3;
        //very strong password contains letters, numbers, and special characters and is at least eight characters.
        else if(num+letter+special == 3 && length > 8)
            return 4;
        //needed return statement
        else
            return 0;
    }

    public void printResult(int result, String pass)
    {
        //takes value of passwordValidator and prints appropriate message
            if(result == 0)
                System.out.println("Unknown strength.");
            if(result == 1)
                System.out.printf("The password '%s' is a very weak password.", pass);
            if(result == 2)
                System.out.printf("The password '%s' is a weak password.", pass);
            if(result == 3)
                System.out.printf("The password '%s' is a strong password.", pass);
            if(result == 4) System.out.printf("The password '%s' is a very strong password.", pass);
    }
}
