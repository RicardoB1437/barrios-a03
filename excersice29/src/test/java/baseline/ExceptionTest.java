package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionTest {

    @Test
    void exception()
    {
        Exception test = new Exception();

        String testString = "ASFFSD";
        int expected = -1;
        int actual = test.exception(testString);
        assertEquals(expected, actual);
    }
}