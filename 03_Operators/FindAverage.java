/* #4:
Description:
Write a program to find the Average of five subjects marks.
Example:
Input: 80, 75, 90, 85, 70
Output: 80.0 */

import java.util.Scanner;

public class FindAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of five subjects:");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();

        double avg = (m1 + m2 + m3 + m4 + m5) / 5;

        System.out.println("Average is: " + avg);
    }
}