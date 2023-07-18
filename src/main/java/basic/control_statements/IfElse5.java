//Java program to check whether a student passed or failed
package basic.control_statements;

import java.util.Scanner;

class IfElse5
{
	public static void main(String[] args) 
	{
		int sub1, sub2, sub3, minPassMarks;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter three subjects marks");
		sub1 = s.nextInt();
		sub2 = s.nextInt();
		sub3 = s.nextInt();

		System.out.println("Enter minimum pass marks");
		minPassMarks = s.nextInt();

		if (sub1 >= minPassMarks && sub2 >= minPassMarks && sub3 >= minPassMarks)
		{
			System.out.println("Student passed");
		} 
		else
		{
			System.out.println("Student failed");
		}
	}
}
