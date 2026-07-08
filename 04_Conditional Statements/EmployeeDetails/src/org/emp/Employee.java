package org.emp;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        empId();

	}
	
	public static void empId() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        if (id == 123) {
            System.out.println("Access Granted: Admin");
        } else {
            System.out.println("Access Denied: Standard User");
        }
    }

}
