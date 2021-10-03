package baseline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class ListMaker
{
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

    public void printHeader(int longestName, int longestPosition)
    {
        //prints name, position, and separation date on top of table
        System.out.print("Name");
        for(int i=3;i<=longestName;i++)
        {
            System.out.print(" ");
        }
        System.out.print("| ");
        System.out.print("Position");
        for(int i=8;i<=longestPosition;i++)
        {
            System.out.print(" ");
        }
        System.out.print("| ");
        System.out.println("Separation Date");

        System.out.print("--------------------|");
        System.out.print("-------------------|");
        System.out.println("----------------");
    }

    public void printList(List<Map<String, String>> sorted)
    {
        //figure out how many spaces are needed
        int longestName = 0;
        int longestPosition = 0;
        for(int i=0;i<sorted.size();i++)
        {
            //find num spaces for name tab
            if(sorted.get(i).get("fName").length()+sorted.get(i).get("lName").length() > longestName)
                longestName = sorted.get(i).get("fName").length()+sorted.get(i).get("lName").length();
            //find num spaces for position tab
            if(sorted.get(i).get("Position").length() > longestPosition)
                longestPosition = sorted.get(i).get("Position").length();
        }
        //print out header
        printHeader(longestName, longestPosition);

        //print out sorted values
        for(int i=0;i<sorted.size();i++)
        {
            //first name tab
            System.out.print(sorted.get(i).get("fName") +" ");
            System.out.print(sorted.get(i).get("lName") +" ");
            for(int j=sorted.get(i).get("fName").length()+sorted.get(i).get("lName").length();j<longestName;j++)
            {
                System.out.print(" ");
            }
            System.out.print("| ");

            //position tab
            System.out.print(sorted.get(i).get("Position"));
            for(int j=sorted.get(i).get("Position").length();j<=longestPosition;j++)
            {
                System.out.print(" ");
            }
            System.out.print("| ");

            //separation date tab
            System.out.println(sorted.get(i).get("Separation Date"));
        }
    }
}
