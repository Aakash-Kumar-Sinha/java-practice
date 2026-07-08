package org.company;

import java.util.Scanner;

public class CompanyInfo {

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        companyAddress();
    }

    public static void companyAddress() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        if (salary > 50000) {
            System.out.println("High Salary");
        } else if (salary > 20000) {
            System.out.println("Medium Salary");
        } else {
            System.out.println("Low Salary");
        }

        sc.close();
    }
}