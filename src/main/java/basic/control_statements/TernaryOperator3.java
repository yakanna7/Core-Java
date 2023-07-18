/*Java program to check whether given number is even or odd using 
ternary operator*/

package basic.control_statements;

import java.util.Scanner;

class TernaryOperator3
{
	public static void main(String[] args)
	{
		int num;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter any number");
		num = s.nextInt();
		
		System.out.println("Is "+num+" even? "+((num%2== 0)?"Yes":"No"));
	}
}
