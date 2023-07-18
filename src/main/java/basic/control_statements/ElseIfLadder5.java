/*Java program to find electricity bill based on the following data

    Units       Cost PerUnit
    1-50          1.25
    51-200        2.20
    201-350       3.15
    351-500       5.20
    501-650       6.30
    651-800       7.40
    801-1000      8.50
    above 1000    10.00
 */
package basic.control_statements;

import java.util.Scanner;

class ElseIfLadder5 
{
	public static void main(String[] args)
	{
		double billAmount, costPerUnit;
		long previousMonthReading, presentMonthReading, totalUnits;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter previous month reading");
		previousMonthReading = s.nextLong();

		System.out.println("Enter present month reading");
		presentMonthReading = s.nextLong();

		if (presentMonthReading >= previousMonthReading)
		{
			totalUnits = presentMonthReading - previousMonthReading;

			if (totalUnits > 1000)
				costPerUnit = 10;
			else if (totalUnits > 800 && totalUnits <= 1000)
				costPerUnit = 8.50;
			else if (totalUnits > 650 && totalUnits <= 800)
				costPerUnit = 7.40;
			else if (totalUnits > 500 && totalUnits <= 650)
				costPerUnit = 6.30;
			else if (totalUnits > 350 && totalUnits <= 500)
				costPerUnit = 5.20;
			else if (totalUnits > 200 && totalUnits <= 350)
				costPerUnit = 3.15;
			else if (totalUnits > 50 && totalUnits <= 200)
				costPerUnit = 2.20;
			else
				costPerUnit = 1.25;

			billAmount = totalUnits * costPerUnit;

			if (billAmount < 50)
				billAmount = 50; // Minimum bill

			System.out.println("Previous Month Reading: "+ previousMonthReading);
			System.out.println("Present Month Reading:  " + presentMonthReading);
			System.out.println("Total Consumed Units:   " + totalUnits);
			System.out.println("Cost Per Unit: " + costPerUnit);
			System.out.println("Total Bill Amount: " + billAmount + " rs");
		} 
		else 
		{
			System.out.println("Present month reading must be greater than previous month reading");
		}
	}
}
