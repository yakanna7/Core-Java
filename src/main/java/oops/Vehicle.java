//Java program to implement class reference variable as Array

package oops;

import java.util.Scanner;

public class Vehicle
{
	String regNumber;
	String name;
	String company;
	float price;

	void setDetails(Scanner s)
	{
		System.out.println("Enter vehicle registration number");
		regNumber = s.next();
		System.out.println("Enter vehicle name");
		name = s.next();
		System.out.println("Enter company");
		company = s.next();
		System.out.println("Enter Price");
		price = s.nextFloat();
	}

	void getDetails()
	{
		System.out.println("Vehile Registration Number is " + regNumber);
		System.out.println("Vehicle Name is " + name);
		System.out.println("Company is " + company);
		System.out.println("Cost is " + price);
	}

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter number of vehicles");
		int size = s.nextInt();

		Vehicle v[] = new Vehicle[size];// object reference as array

		int i;
		for (i = 0; i < v.length; i++) {
			v[i] = new Vehicle(); // creating object
			System.out.println("Enter vehicle " + (i + 1) + " details\n");
			v[i].setDetails(s);
		}

		for (i = 0; i < v.length; i++) {
			System.out.println("\nVehicle " + (i + 1) + " details are\n");
			v[i].getDetails();
		}
	}
}
