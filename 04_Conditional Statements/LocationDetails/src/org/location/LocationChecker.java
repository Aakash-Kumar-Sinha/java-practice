package org.location;

import java.util.Scanner;

public class LocationChecker {

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Country: ");
        String country = sc.nextLine();

        if (country == "India") {

            System.out.print("Enter State: ");
            String state = sc.nextLine();

            if (state == "Tamilnadu") {

                System.out.print("Enter City: ");
                String city = sc.nextLine();

                if (city == "Chennai") {
                    System.out.println("Location Matched: Besant Chennai");
                } else {
                    System.out.println("City Not Matched");
                }

            } else {
                System.out.println("State Not Matched");
            }

        } else {
            System.out.println("Country Not Matched");
        }

        sc.close();
    }
}