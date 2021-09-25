package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableTest {

    @Test
    void makeRow()
    {
        Table table = new Table();
        int arrExpected[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int arrActual[] = table.makeRow(1);

        boolean expected = true;
        boolean actual = checkRow(arrExpected, arrActual);
    }

    @Test
    boolean checkRow(int arrExpected[], int arrActual[])
    {
        for(int i=0;i<12;i++)
        {
            if(arrActual[i] != arrExpected[i])
                return false;
        }
        return true;
    }
}