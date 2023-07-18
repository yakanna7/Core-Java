package oops.statickeyword;

import java.util.Scanner;

public class TemperatureConverter {

	public static float toFahrenheit(float celsius) {
		float fahrenheit = 9 * (celsius / 5) + 32;
		return fahrenheit;
	}

	public static float toCelsius(float fahrenheit) {
		float celsius = (fahrenheit - 32) * 5 / 9;
		return celsius;
	}

	public static void main(String args[]) {

		Scanner cmd = new Scanner(System.in);
		
		System.out.println("Enter temperature in Fahrenheit :");
		float temperatue = cmd.nextFloat();
		float celsius = toCelsius(temperatue);
		System.out.println(temperatue+" fahrenheit is equal to " + celsius+ " celsius");
		
		System.out.println("Enter temperature in celsius :");
		temperatue = cmd.nextFloat();
		float fahrenheit = toFahrenheit(temperatue);
		System.out.println(temperatue + " celsius is equal to "+ fahrenheit + " fahrenheit");
	}
}
