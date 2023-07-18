//Java program to find student total marks, avg marks, result and grade
package basic.control_statements;

import java.util.Scanner;

class ElseIfLadder4
{
	public static void main(String[] args)
	{
		int sub1, sub2, sub3, sub4, totalMarks, minPass;
		float avgMarks;
		char result, grade;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter four subjects marks");
		sub1 = s.nextInt();
		sub2 = s.nextInt();
		sub3 = s.nextInt();
		sub4 = s.nextInt();

		System.out.println("Enter minimum pass marks");
		minPass = s.nextInt();

		totalMarks = sub1 + sub2 + sub3 + sub4;
		avgMarks = (float) totalMarks / 4.0f;

		if (sub1 >= minPass && sub2 >= minPass && sub3 >= minPass && sub4 >= minPass)
		{
			result = 'P';
		} 
		else 
		{
			result = 'F';
		}

		// Calculating grade for only passed students
		if (result == 'P')
		{
			if (avgMarks >= 70)
				grade = 'A';
			else if (avgMarks >= 60)
				grade = 'B';
			else if (avgMarks >= 50)
				grade = 'C';
			else
				grade = 'D';
		}
		else 
		{
			grade = 'N';
		}

		System.out.println("Total Marks " + totalMarks);
		System.out.println("Average Marks " + avgMarks);

		if (result == 'P')
		{
			System.out.println("Result is Pass");
		}
		else
		{
			System.out.println("Result is Fail");
		}

		System.out.println("Grade is " + grade);
	}
}
