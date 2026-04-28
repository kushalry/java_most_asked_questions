package string_with_same_count_of_characters;

public class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        int freq = count[s.charAt(0) - 'a'];
        for (int i = 1; i < count.length; i++) {
            if (count[i] != 0 && count[i] != freq) {
                return false;
            }
        }
        return true;
    }
}
