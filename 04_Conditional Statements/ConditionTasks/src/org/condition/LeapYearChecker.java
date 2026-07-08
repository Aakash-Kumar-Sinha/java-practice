package org.condition;

public class LeapYearChecker {
	public static void checkLeapYear(int year) {

        if (year % 4 == 0) {

            if (year % 100 == 0) {

                if (year % 400 == 0) {
                    System.out.println("Leap Year");
                } else {
                    System.out.println("Not a Leap Year");
                }

            } else {
                System.out.println("Leap Year");
            }

        } else {
            System.out.println("Not a Leap Year");
        }
    }

}
