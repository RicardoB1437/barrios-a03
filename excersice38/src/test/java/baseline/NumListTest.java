package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumListTest {

    @Test
    void filterSpaces() {
        NumList test = new NumList();
        List<Integer> nums = new ArrayList<>();

        String testInput = "1 2 3 4 5 6 7 8";
        nums = test.filterSpaces(testInput);

        int expected = 0;
        int actual = 0;
        for(int i=0;i<nums.size();i++)
        {
            if(nums.get(i) != i+1)
                actual++;
        }

        assertEquals(expected, actual);
    }

    @Test
    void filterEvenNumbers() {
        NumList test = new NumList();
        List<Integer> evenNums = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();

        String testInput = "1 2 3 4 5 6 7 8";
        nums = test.filterSpaces(testInput);
        evenNums = test.filterEvenNumbers(nums);

        int expected = 0;
        int actual = 0;
        for(int i=0;i<evenNums.size();i++)
        {
            if(evenNums.get(i) % 2 != 0)
                actual++;
        }

        assertEquals(expected, actual);
    }
}