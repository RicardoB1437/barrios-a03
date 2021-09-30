package baseline;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeListTest {

    @Test
    void removeName()
    {
        EmployeeList test = new EmployeeList();

        String searchName = "Jackie Jackson";
        List<String> employees = test.makeList();

        String expected = "Jackie Jackson";
        String actual = test.removeName(employees, searchName);
    }
}