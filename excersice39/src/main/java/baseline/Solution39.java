/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Ricardo Barrios
 */

package baseline;
import java.util.*;
import java.util.HashMap;
import java.util.Comparator;

/*
 * all current methods/classes will be placed in their proper locations after psuedocode is done
 * they are all here simply for the moment so that i can visualize all code together
 */

public class Solution39
{
    //

    //hard coded
    public ArrayList<Map<String, String>> makeList()
    {
        ArrayList<Map<String, String>> employees = new ArrayList<>();
        HashMap<String, String> mMap = new HashMap();

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
        mMap.put("lName", "Webber");
        mMap.put("Position", "Web Developer");
        mMap.put("Separation Date", "2015-12-18");
        employees.add(mMap);

        return employees;
    }



    public ArrayList<Map<String, String>> sortList(ArrayList<Map<String, String>> emp)
    {
        ArrayList<Map<String, String>> sorted = new ArrayList<>();
        //sort
        //create comparator
    }

    public void printHeader()
    {
        //prints name, position, and separation date on top of table
    }

    public void printList(ArrayList<Map<String, String>> sorted)
    {
        //print out sorted values
    }

    public static void main(String[] args)
    {
        //ListMaker list = new ListMaker();

        //make list
        //ArrayList<Map<String, String>> employees = list.makeList();

        //sort list
        //ArrayList<Map<String, String>> sortedEmployees = list.sortList(employees);

        //print output
    }
}
