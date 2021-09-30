package baseline;

import java.util.*;
import java.util.Scanner;

public class EmployeeList
{

    Scanner input = new Scanner(System.in);

    public String takeName()
    {
        System.out.print("\nEnter an employee name to remove: ");
        return input.nextLine();
    }

    public List<String> makeList()
    {
        List<String> employees = new ArrayList<String>();

        //add all employees to list
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");

        return employees;
    }

    public void printList(List<String> employees)
    {
        System.out.printf("%nThere are %d employees:%n", employees.size());

        //loop through 5 times and print names of employees in list
        for(int i=0;i<employees.size();i++)
        {
            System.out.println(employees.get(i));
        }
    }

    //return string removed for testing purposes
    public String removeName(List<String> employees, String input)
    {
        EmployeeList emp = new EmployeeList();


        //loop through list and find name and remove it
        String removed = "";
        for(int i=0;i<employees.size();i++)
        {
            if(employees.get(i).equals(input))
            {
                //if found remove it
                removed = employees.get(i);
                employees.remove(i);
                break;
            }
        }
        emp.printList(employees);
        return removed;
    }
}
