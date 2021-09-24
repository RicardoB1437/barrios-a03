package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class passwordTest {

    @Test
    void passwordValidator()
    {
        password passW = new password();
        String pass = "!!!!";
        int expected = 0;
        assertEquals(expected, passW.passwordValidator(pass));
    }
}