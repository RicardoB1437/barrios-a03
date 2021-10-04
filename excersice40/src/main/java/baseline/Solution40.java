/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Ricardo Barrios
 */

package baseline;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Comparator;
import java.util.Scanner;

/*
 * all current methods/classes will be placed in their proper locations after psuedocode is done
 * they are all here simply for the moment so that i can visualize all code together
 */



public class Solution40
{
    //

    //hard coded
    public List<Map<String, String>> makeList()
    {
        List<Map<String, String>> employees = new ArrayList<>();
        Map<String, String> mMap = new HashMap<>();

        mMap.put("fName", "John");
        mMap.put("lName", "Johnson");
        mMap.put("Position", "Manager");
        mMap.put("Separation Date", "2016-12-31");
        employees.add(mMap);

        mMap = new HashMap();
        mMap.put("fName", "Tou");
        mMap.put("lName", "Xiong");
        mMap.put("Position", "Software Engineer");
        mMap.put("Separation Date", "2016-10-05");
        employees.add(mMap);

        mMap = new HashMap();
        mMap.put("fName", "Michaela");
        mMap.put("lName", "Michaelson");
        mMap.put("Position", "District Manager");
        mMap.put("Separation Date", "2015-12-19");
        employees.add(mMap);

        mMap = new HashMap();
        mMap.put("fName", "Jake");
        mMap.put("lName", "Jacobson");
        mMap.put("Position", "Programmer");
        mMap.put("Separation Date", "");
        employees.add(mMap);

        mMap = new HashMap();
        mMap.put("fName", "Jacquelyn");
        mMap.put("lName", "Jackson");
        mMap.put("Position", "DBA");
        mMap.put("Separation Date", "");
        employees.add(mMap);

        mMap = new HashMap();
        mMap.put("fName", "Sally");
        mMap.put("lName", "Weber");
        mMap.put("Position", "Web Developer");
        mMap.put("Separation Date", "2015-12-18");
        employees.add(mMap);

        return employees;
    }

    public String takeSearchString()
    {
        //System.out.print("Enter a search string: ");
        //return input.nextLine();
    }

    public List<Map<String, String>> findEmployee(String searchString, List<Map<String, String>> employees)
    {
        //search for substring in names of employees
        //add employee to new List if contains the substring and return the list
    }

    public void printList(List<Map<String, String>> names)
    {
        //print header
        //print values in list
    }

    public static void main(String[] args)
    {
        //ListMaker list = new ListMaker();

        //make list
        //List<Map<String, String>> employees = list.makeList();

        //prompt user for substring
        //String searchString = list.takeSearchString();

        //find substring
        //List<Map<String, String>> specificEmployees = list.findEmployee(searchString, employees);

        //print output
        //list.printList(specificEmployees);
    }

}
