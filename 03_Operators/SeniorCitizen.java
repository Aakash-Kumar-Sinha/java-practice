/* #6:
Description:
Write a program to check if a person is a "Senior Citizen" (Age 60 or above).
Print true or false using boolean logic.
Example:
Input: 65
Output: true */

import java.util.Scanner;

public class SeniorCitizen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if(age >= 60) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

// Output:
// Enter your age: 65
// true