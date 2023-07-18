/*Java program to implement simple ATM transactions for balance enquiry,
 withdraw money and deposit money*/

package basic.control_statements;

import java.util.Scanner;

class Switch4 
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
			System.out.println("1.Balance  Enquiry");
			System.out.println("2.Withdraw Money");
			System.out.println("3.Deposit  Money");

			System.out.println("Enter your choice");
			int choice = s.nextInt();

			switch (choice)
			{
				case 1:
					System.out.println("Available balance is " + balance + " rs");
					break;
				case 2:
					System.out.println("Enter amount to withdraw money");
					amount = s.nextInt();
	
					if (amount <= balance) {
						balance = balance - amount;
						System.out.println("Collect your money");
					} 
					else
					{
						System.out.println("Insufficient balance in your account");
					}
					break;
	
				case 3:
					System.out.println("Enter amount to deposit money");
					amount = s.nextInt();
					balance = balance + amount;
					break;
				default:
					System.out.println("Invalid choice enterd");
					break;
			}
		} 
		else 
		{
			System.out.println("Invalid PIN entered");
		}
	}
}
