package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    void validateInput()
    {
        Validator val = new Validator();
        String fName = "John";
        String lName = "Johnson";
        String zip = "55555";
        String ID = "AK-4321";

        Boolean expected = true;
        Boolean actual = val.validateInput(fName,lName,ID,zip);
        assertEquals(expected, actual);
    }
}