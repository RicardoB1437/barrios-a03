package baseline;

import java.util.Arrays;

public class anagram
{
    public boolean isAnagram(String str1, String str2)
    {
        //base case
        if(str1.length() != str2.length())
            return false;

        //break string into char array
        char[] str1ToChar = str1.toCharArray();
        char[] str2ToChar = str2.toCharArray();

        //use char array to compare letters in each string
        //sorts char arrays into alphabetical order
        Arrays.sort(str1ToChar);
        Arrays.sort(str2ToChar);

        //convert sorted char array back into string and use .equals to compare if equal and return
        str1 = String.valueOf(str1ToChar);
        str2 = String.valueOf(str2ToChar);
        return str1.equals(str2);
    }
}
