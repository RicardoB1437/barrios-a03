package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class CalculatorTest {

    @Test
    void averageInts() {
        Calculator test = new Calculator();
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(20);
        nums.add(30);

        double expected = 20.0;
        double actual = test.averageInts(nums);
    }

    @Test
    void averageDoubles() {
        Calculator test = new Calculator();
        List<Double> nums = new ArrayList<Double>();
        nums.add(10.0);
        nums.add(20.0);
        nums.add(30.0);

        double expected = 20.0;
        double actual = test.averageDoubles(nums);
    }

    @Test
    void max() {
        Calculator test = new Calculator();
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(20);
        nums.add(30);

        double expected = 30;
        double actual = test.averageInts(nums);
    }

    @Test
    void min() {
        Calculator test = new Calculator();
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(20);
        nums.add(30);

        double expected = 10;
        double actual = test.averageInts(nums);
    }

    @Test
    void std() {
        Calculator test = new Calculator();
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(20);
        nums.add(30);

        double expected = 66.66;
        double actual = test.averageInts(nums);
    }
}