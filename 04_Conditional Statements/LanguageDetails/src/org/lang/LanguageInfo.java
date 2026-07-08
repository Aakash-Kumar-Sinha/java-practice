package org.lang;

import java.util.Scanner;

public class LanguageInfo {
	
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Tamil");
        System.out.println("2. English");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                tamilLanguage();
                break;
            case 2:
                englishLanguage();
                break;
            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }
    

    public static void tamilLanguage() {
        System.out.println("Tamil Language");
    }

    public static void englishLanguage() {
        System.out.println("English Language");
    }
}