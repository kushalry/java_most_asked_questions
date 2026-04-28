package armstrong_number;

public class Solution {
    public boolean isArmstrong(int n) {
        int originalNumber = n;
        int sum = 0;
        int numDigits = String.valueOf(n).length();
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, numDigits);
            n /= 10;
        }
        return sum == originalNumber;
    }
}
