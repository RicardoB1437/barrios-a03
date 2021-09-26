package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableTest {

    @Test
    void exceptionCheck()
    {
        Table test = new Table();
        String stringTest = "150";
        int expected = 150;
        int actual = test.exceptionCheck(stringTest);
        assertEquals(expected, actual);
    }
}