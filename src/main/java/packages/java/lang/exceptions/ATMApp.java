package packages.java.lang.exceptions;

import java.util.*;

public class ATMApp {
	public static void main(String[] args) {
		Customer ct = new Customer(1122334455, "Yakanna", 20000);

		Scanner s = new Scanner(System.in);

		System.out.println("Enter amount to withdraw");
		int amount = s.nextInt();

		try {
			ct.withdraw(amount);
			System.out.println("Collect your money");
			System.out.println("Available balance is " + ct.getBalance()
					+ " rs");
		} catch (InsufficientBalanceException ibe) {
			System.out.println("No sufficient balance in your account");
			System.out.println("Available balance is " + ct.getBalance()
					+ " rs");
		}
	}
}
