package sort_and_concatenate_strings;

import java.util.Arrays;

public class Solution {
    public String sortAndConcatenate(String string) {
        // Split the input string into an array of strings
        String[] strings = string.split(" ");

        // Sort the array of strings
        Arrays.sort(strings);

        // Concatenate the sorted strings
        StringBuilder result = new StringBuilder();
        for (String str : strings) {
            result.append(str);
        }

        return result.toString();
    }
}
