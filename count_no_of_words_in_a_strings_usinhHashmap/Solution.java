package count_no_of_words_in_a_strings_usinhHashmap;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public Map<String, Integer> countWords(String str) {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = str.split("\\s+");

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        return wordCount;
    }
}
