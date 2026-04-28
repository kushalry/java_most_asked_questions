package second_highest_no_in_an_array;

public class Solution {
    public static int secondHighest(int[] nums) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num < highest) {
                secondHighest = num;
            }
        }

        return secondHighest == Integer.MIN_VALUE ? -1 : secondHighest;
    }
}
