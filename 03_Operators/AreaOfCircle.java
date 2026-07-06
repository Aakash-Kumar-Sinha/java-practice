/* #1:
Description:
Write a program to calculate the Area of a Circle.
Use double for radius and pi (3.14).
area = pi * radius * radius;
Example:
Input Radius = 5
Output = 78.5 */

import java.util.Scanner;
import java.lang.Math;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        int radius = sc.nextInt();

        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle is: " + area);
    }
}

// Output:
// Enter radius: 5
// Area of Circle is: 78.53981633974483