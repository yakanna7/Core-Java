//14.Java program to convert rupees to dollars
package basic;

import java.util.Scanner;

class CurrencyConverter
{
	public static void main(String[] args)
	{
		float rupees, dollars, dollarRate;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter amount in rupees");
		rupees = s.nextFloat();
		System.out.println("Enter dollar rate");
		dollarRate = s.nextFloat();

		dollars = rupees / dollarRate;
		System.out.println(rupees + " rupees is equal to " + dollars + " dollars");
	}
}
