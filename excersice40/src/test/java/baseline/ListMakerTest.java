package baseline;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ListMakerTest {

    @Test
    void findEmployee()
    {
        //sort function was already tested in excersice39
        ListMaker test = new ListMaker();
        List<Map<String, String>> employees = test.makeList();
        Collections.sort(employees, new ListMapComparator());

        String searchString = "Jac";
        List<Map<String, String>> specificEmployees = test.findEmployee(searchString, employees);

        int expected = 2;
        int actual = 0;
        for(int i=0;i<specificEmployees.size();i++)
        {
            if(employees.get(i).get("fName").contains(searchString) || employees.get(i).get("lName").contains(searchString))
            {
                actual++;
            }
        }

        assertEquals(expected, actual);
    }
}