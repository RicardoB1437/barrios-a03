package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagicBallTest {

    @Test
    void magicAnswer()
    {
        MagicBall test = new MagicBall();
        String actual = "No.";
        String expected = test.magicAnswer(1);
        assertEquals(expected, actual);
    }
}