package baseline;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {

    @Test
    void makePassword()
    {
        Password test = new Password();

        List<Character> nums = test.makeNumList();
        List<Character> chars = test.makeCharList();
        List<Character> special = test.makeSpecialList();

        int expectedNum = 2;
        int expectedLetter = 6;
        int expectedSpecial = 2;
        int actualNum = 0;
        int actualLetter = 0;
        int actualSpecial = 0;

        List<Character> password = test.makePassword(nums, chars, special, 10, expectedNum, expectedSpecial);

        for(int i=0;i<password.size();i++)
        {
            for(int j=0;j<nums.size();j++)
            {
                if(password.get(i).equals(nums.get(j)))
                    actualNum++;
            }
            for(int j=0;j<chars.size();j++)
            {
                if(password.get(i).equals(chars.get(j)))
                    actualLetter++;
            }
            for(int j=0;j<special.size();j++)
            {
                if(password.get(i).equals(special.get(j)))
                    actualSpecial++;
            }
        }

        assertEquals(expectedNum, actualNum);
        assertEquals(expectedLetter, actualLetter);
        assertEquals(expectedSpecial, actualSpecial);
    }
}