package baseline;
import java.util.Comparator;
import java.util.Map;

class ListMapComparator implements Comparator
{
    public int compare(Object obj1, Object obj2)
    {
        Map<String, String> test1 = (Map<String, String>) obj1;
        Map<String, String> test2 = (Map<String, String>) obj2;
        return test1.get("lName").compareTo(test2.get("lName"));
    }
}