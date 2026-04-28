package length_of_longest_substring_without_repeating_chars;

public class Solution {
    // Sliding Window
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxLength = 0;
        boolean[] visited = new boolean[128]; // Assuming ASCII character set

        while (right < s.length()) {
            char currentChar = s.charAt(right);
            if (!visited[currentChar]) {
                visited[currentChar] = true;
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                visited[s.charAt(left)] = false;
                left++;
            }
        }

        return maxLength;
    }
}
