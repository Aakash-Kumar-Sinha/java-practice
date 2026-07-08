package org.condition;

public class GradeChecker {
	public static void gradeStudent(int score) {

        if (score >= 90) {
            System.out.println("Grade: A");

        } else if (score >= 80) {
            System.out.println("Grade: B");

        } else if (score >= 70) {
            System.out.println("Grade: C");

        } else {
            System.out.println("Grade: F");
        }
    }
}
