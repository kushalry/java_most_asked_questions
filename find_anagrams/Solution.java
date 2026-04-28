package find_anagrams;

import java.util.*;

public class Solution {
    // Time complexity: O(n), where n is the length of string s
    // Space complexity: O(1), since the count arrays have a fixed size of 26
    public List<Integer> findAnagrams(String s, String p) {
        // Edge case: if s or p is null, or if s is shorter than p, return an empty list
        List<Integer> result = new ArrayList<>();
        if (s == null || p == null || s.length() < p.length()) {
            return result;
        }

        // Count the frequency of each character in p
        int[] pCount = new int[26];
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }
        // Use a sliding window to count the frequency of characters in the current window of s
        int[] sCount = new int[26];
        // Iterate through the string s, updating the counts and checking for anagrams
        for (int i = 0; i < s.length(); i++) {
            // Add the current character to the count
            sCount[s.charAt(i) - 'a']++;
            // Remove the character that is sliding out of the window
            if (i >= p.length()) {
                sCount[s.charAt(i - p.length()) - 'a']--;
            }
            // Check if the current window is an anagram of p
            if (Arrays.equals(sCount, pCount)) {
                // If it is, add the starting index of the anagram to the result list
                result.add(i - p.length() + 1);
            }
        }
        // Return the list of starting indices of anagrams
        return result;
    }
}
