package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {


    @Test
    void anagramCheck()
    {
        anagram name = new anagram();
        Boolean test = false;
        String word1 = "bails";
        String word2 = "sail";
        assertEquals(test, name.isAnagram(word1, word2));
    }

}