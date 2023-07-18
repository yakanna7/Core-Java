/*Java program to apply arithmetic operation on two numbers based on 
user selection*/

package basic.control_statements;

import java.util.Scanner;

class Switch2
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter two numbers");
		int a = s.nextInt();
		int b = s.nextInt();

		System.out.println("Select + for addition");
		System.out.println("Select - for substraction");
		System.out.println("Select * for multiplication");
		System.out.println("Select / for division");
		System.out.println("Select % for remainder");
		System.out.println("Enter your choice");
		char ch = s.next().charAt(0);

		switch (ch)
		{
			case '+':
				System.out.println(a + "+" + b + " = " + (a + b));
				break;
	
			case '-':
				System.out.println(a + "-" + b + " = " + (a - b));
				break;
	
			case '*':
				System.out.println(a + "*" + b + " = " + (a * b));
				break;
	
			case '/':
				System.out.println(a + "/" + b + " = " + (a / b));
				break;
			case '%':
				System.out.println(a + "%" + b + " = " + (a % b));
				break;
			default:
				System.out.println("Invalid choice selected");
				break;
		}
	}
}
