package swap_two_numbers_without_using_third_variable;

public class Solution {
    public void swap(int a, int b) {
        // Swap using addition and subtraction
        a = a + b; // a now holds the sum of a and b
        b = a - b; // b now holds the original value of a
        a = a - b; // a now holds the original value of b

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
