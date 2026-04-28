package add_digits;

public class Solution {
    public int addDigits(int nums) {
        while (nums >= 10) {
            int sum = 0;
            while (nums > 0) {
                sum += nums % 10;
                nums /= 10;
            }
            nums = sum;
        }
        return nums;
    }
}
