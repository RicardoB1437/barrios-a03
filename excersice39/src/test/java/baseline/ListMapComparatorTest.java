package baseline;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ListMapComparatorTest {

    @Test
    void compare()
    {
        ListMaker list = new ListMaker();
        List<Map<String, String>> employees = list.makeList();
        Collections.sort(employees, new ListMapComparator());

        int expected = 6;
        int actual = 0;

        //check each name and see if its sorted correctly
        if(employees.get(0).get("fName").equals("Jacquelyn") && employees.get(0).get("lName").equals("Jackson"))
            actual++;
        if(employees.get(1).get("fName").equals("Jake") && employees.get(1).get("lName").equals("Jacobson"))
            actual++;
        if(employees.get(2).get("fName").equals("John") && employees.get(2).get("lName").equals("Johnson"))
            actual++;
        if(employees.get(3).get("fName").equals("Michaela") && employees.get(3).get("lName").equals("Michaelson"))
            actual++;
        if(employees.get(4).get("fName").equals("Sally") && employees.get(4).get("lName").equals("Weber"))
            actual++;
        if(employees.get(5).get("fName").equals("Tou") && employees.get(5).get("lName").equals("Xiong"))
            actual++;

        assertEquals(expected, actual);
    }
}