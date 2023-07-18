//13.Java program to find Compound Interest
package basic;

import java.util.Scanner;

public class CompoundInterest 
{
	public static void main(String[] args) 
	{
		double principleAmount, time, intrestRate, compoundInterest;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter Principle Amount");
		principleAmount = s.nextDouble();
		System.out.println("Enter Time");
		time = s.nextDouble();
		System.out.println("Enter Rate Of Intrest");
		intrestRate = s.nextDouble();

		compoundInterest = principleAmount*(Math.pow(1 + intrestRate / 100, time) - 1);
		System.out.println("Compound Intrest is " + compoundInterest + " rupees");
	}
}
