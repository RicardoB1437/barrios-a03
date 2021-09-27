package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessNumGameTest {

    @Test
    void exceptionCheck()
    {
        GuessNumGame test = new GuessNumGame();
        String stringTest = "asdfs";
        int expected = -1;
        int actual = test.exceptionCheck(stringTest);
        assertEquals(expected, actual);
    }

    @Test
    void isHighOrLow()
    {
        GuessNumGame test = new GuessNumGame();
        int expected = 0;
        int actual = test.isHighOrLow(5, 5);
        assertEquals(expected, actual);
    }


}