package baseline;

import java.util.Objects;

public class Validator
{

    //all validate functions return 1 if valid else return 0
    private int validateFirstName(String fName)
    {
        //check if fist name is empty, check if > 2 chars long
        char[] fNameToChar = fName.toCharArray();
        if(fName.isEmpty())
            return 0;
        else if(fName.length() < 2)
            return 1;
        else
        {
            int flag = 0;
            for(int i=0;i<fName.length();i++)
            {
                if(Character.isLetter(fNameToChar[i]))
                    flag++;
            }
            if(flag == fName.length())
                return 2;
            else
                return 3; // instructions did not explain if string isnt only chars yet meets other conditions
        }
    }

    private int validateLastName(String lName)
    {
        //check if last name is empty, check if > 2 chars long
        char[] lNameToChar = lName.toCharArray();
        if(lName.isEmpty())
            return 0;
        else if(lName.length() < 2)
            return 1;
        else
        {
            int flag = 0;
            for(int i=0;i<lName.length();i++)
            {
                if(Character.isLetter(lNameToChar[i]))
                    flag++;
            }
            if(flag == lName.length())
                return 2;
            else
                return 3; // instructions did not explain if string isnt only chars yet meets other conditions
        }
    }

    private int validateID(String ID)
    {
        //check if format is AA-1234
        char[] IDToChar = ID.toCharArray();

        //check if zip is all nums and 5 digits long
        int flag = 0;
        int hyphenFlag = 0;
        char hyphen = '-';
        for(int i=0;i<ID.length();i++)
        {
            if(i<2 && Character.isLetter(IDToChar[i]))
                flag++;
            if(i==2 && Objects.equals(IDToChar[i], hyphen))
                hyphenFlag++;
            if(i>2 && Character.isDigit(IDToChar[i]))
                flag++;
        }
        if(flag+hyphenFlag == ID.length())
            return 1;
        else
            return 0;
    }

    private int validateZip(String zip)
    {
        //convert string into array of chars
        char[] zipToChar = zip.toCharArray();

        //check if zip is all nums and 5 digits long
        int flag = 0;
        for(int i=0;i<zip.length();i++)
        {
            if(Character.isDigit(zipToChar[i]))
                flag++;
        }
        if(flag == zip.length() && zip.length() == 5)
            return 1;
        else
            return 0;
    }

    public boolean validateInput(String fName, String lName, String ID, String zip)
    {
        //call on all specific validation functions
        //no longer throwing exceptions, will just print values based on return of validation functions
        if(validateFirstName(fName) == 0)
            System.out.println("The first name must be filled in.");
        if(validateFirstName(fName) == 1)
            System.out.println("The first name must be at least 2 characters long.");
        if(validateLastName(lName) == 0)
            System.out.println("The last name must be filled in.");
        if(validateLastName(fName) == 1)
            System.out.println("The last name must be at least 2 characters long.");
        if(validateID(ID) == 0)
            System.out.println("The employee ID must be in the format of AA-1234.");
        if(validateZip(zip) == 0)
            System.out.println("The zipcode must be a 5 digit number.");

        //if no errors print "There were no errors found." return true else return false
        else
        {
            System.out.println("There were no errors found.");
            return true;
        }
        return false;
    }
}
