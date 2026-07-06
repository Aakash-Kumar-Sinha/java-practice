/* #3:
Description:
Write a program to convert Temperature from Celsius to Fahrenheit.
Formula: F = (C * 9/5) + 32
Example:
Input: 0
Output: 32.0 */

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double cel  = sc.nextInt();
        double fah = (cel * 9/5) + 32;

        System.out.println("Fahrenheit: " + fah);
    }
}

// Output:
// Enter temperature in Celsius: 0
// Fahrenheit: 32.0