/* #5:
Description:
Write a program to calculate the Simple Interest.
Formula: SI = (P * R * T) / 100
Example:
Input: P=1000, R=5, T=2
Output: 100.0 */

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter the rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter the time: ");
        double time = sc.nextDouble();

        double interest = (principal * time * rate) / 100;

        System.out.println("Interest is: " + interest);
    }
}

// Output:
// Enter the principal: 1000
// Enter the rate: 5
// Enter the time: 2
// Interest is: 100.0