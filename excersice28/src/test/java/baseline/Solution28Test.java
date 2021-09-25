package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;

class Solution28Test {

    @Test
    void main()
    {
        Solution28 sol = new Solution28();

        //adding a scanner does not work in attempting to make junit ask for input
        Scanner input = new Scanner(System.in);
        int expected = 25;

        //chaged addNums from private to public for test
        //test does not work since junit doesnt prompt for input using scanner
        //testing would practically be useless in this aspect, would just be testing simple addition
        //no logic involved
        int actual = sol.addNums();
        assertEquals(expected, actual);
    }
}