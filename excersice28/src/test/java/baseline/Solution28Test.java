package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {

    @Test
    void main()
    {
        AddNums calc = new AddNums();

        int[] arr = {5,5,5,5,5};
        int expected = 25;
        int actual = calc.addNums(arr);
        assertEquals(expected, actual);
    }
}