//15.Java program to convert temperature from Fahrenheit to Celsius
package basic;

import java.util.Scanner;

class TemperatureConverter 
{
	public static void main(String[] args)
	{
		float fahrenheit, celsius;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter temperature in Fahrenheit");
		fahrenheit = s.nextFloat();

		celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println(fahrenheit + " fahrenheit is equal to " + celsius + " celsius");
	}
}
