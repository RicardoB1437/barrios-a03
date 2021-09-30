package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {

    @Test
    void pickWinner()
    {
        Lottery test = new Lottery();
        List<String> names = new ArrayList<String>();

        names.add("joe");
        names.add("mary");
        names.add("mark");

        String expected = "mark";
        String actual = test.pickWinner(names, 2);
    }
}