/* #2:
Description:
Write a program to swap two numbers using a third variable.
Example:
Input: a = 10, b = 20
Output: a = 20, b = 10 */

public class SwapTwoNums {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before Swap a = " + a + ", b = " + b);

        int c = a;
        a = b;
        b = c;

        System.out.println("After Swap a = " + a + ", b = " + b);
    }
}

// Output:
// Before Swap a = 10, b = 20
// After Swap a = 20, b = 10