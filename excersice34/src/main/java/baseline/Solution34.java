/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Ricardo Barrios
 */

package baseline;
import java.util.*;

/*
 * all current methods/classes will be placed in their proper locations after psuedocode is done
 * they are all here simply for the moment so that i can visualize all code together
 */

public class Solution34
{
    //

    public static void main(String[] args)
    {
        EmployeeList emp = new EmployeeList();

        //create list
        List<String> employees = emp.makeList();

        //print list
        emp.printList(employees);

        //ask user for name to look for
        String searchName = emp.takeName();

        //remove employee
        emp.removeName(employees, searchName);
    }
}
