/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Ricardo Barrios
 */

package baseline;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.List;


/*
 * all current methods/classes will be placed in their proper locations after psuedocode is done
 * they are all here simply for the moment so that i can visualize all code together
 */



public class Solution40
{
    //

    public static void main(String[] args)
    {
        ListMaker list = new ListMaker();

        //make list
        List<Map<String, String>> employees = list.makeList();

        //sort list
        Collections.sort(employees, new ListMapComparator());

        //prompt user for substring
        String searchString = list.takeSearchString();

        //find substring
        List<Map<String, String>> specificEmployees = list.findEmployee(searchString, employees);

        //print output
        System.out.println("\nResults: ");
        list.printList(specificEmployees);
    }

}
