package org.condition;

public class ATMChecker {
	public static void atmWithdrawal(int amount, int balance) {

        if (amount <= balance) {
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + (balance - amount));

        } else {
            System.out.println("Insufficient Balance");
        }
    }
}
