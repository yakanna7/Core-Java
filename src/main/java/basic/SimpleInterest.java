//12.Java program to find simple interest
package basic;

import java.util.Scanner;

class SimpleInterest
{
	public static void main(String[] args)
	{
		double principleAmount, time, intrestRate, simpleInterest;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter Principle Amount");
		principleAmount = s.nextDouble();
		System.out.println("Enter Time");
		time = s.nextDouble();
		System.out.println("Enter Rate Of Intrest");
		intrestRate = s.nextDouble();

		simpleInterest = (principleAmount * time * intrestRate) / 100;
		System.out.println("Simple Intrest is " + simpleInterest + " rupees");
	}
}
