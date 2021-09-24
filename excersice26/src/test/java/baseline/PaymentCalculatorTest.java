package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff()
    {
        PaymentCalculator calc = new PaymentCalculator();
        int expected = 70;
        int actual = (int) calc.calculateMonthsUntilPaidOff();
        assertEquals(expected, actual);
    }
}