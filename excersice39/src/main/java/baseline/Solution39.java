/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Ricardo Barrios
 */

package baseline;
import java.util.*;

/*
 * all previous methods/classes located here were placed in their proper locations
 */

public class Solution39
{
    //

    public static void main(String[] args)
    {
        ListMaker list = new ListMaker();

        //make list
        List<Map<String, String>> employees = list.makeList();

        //sort list
        //no longer need for sort list function
        Collections.sort(employees, new ListMapComparator());

        //print output
        list.printList(employees);
    }
}
