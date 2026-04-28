package duplicate_characers_in_a_string;

import java.util.HashMap;

public class Solution {
    public void findDuplicateCharacters(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        System.out.println("Duplicate characters in the string:");
        for (Character key : charCountMap.keySet()) {
            if (charCountMap.get(key) > 1) {
                System.out.println(key + ": " + charCountMap.get(key) + " times");  
            }
        }
    }
}
