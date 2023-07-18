//Java program to implement simple ATM transaction for withdrawing money
package basic.control_statements;

import java.util.Scanner;

class NestedIfElse3 
{
	public static void main(String[] args) 
	{
		double balance = 5000;
		int issuedPin = 1987, enteredPin, amount;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter your PIN number");
		enteredPin = s.nextInt();

		if (enteredPin == issuedPin)
		{
			System.out.println("Enter amount to withdraw money");
			amount = s.nextInt();

			if (amount <= balance)
			{
				balance = balance - amount;
				System.out.println("Collect your money");
			} 
			else
			{
				System.out.println("Insufficient balance in your account");
			}

			System.out.println("Available balance is " + balance + " rs");
		} 
		else
		{
			System.out.println("Invalid pin entered");
		}
	}
}
