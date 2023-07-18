/*Java program to find maximum of three numbers using ternary or conditional 
operator*/
package basic.control_statements;

import java.util.Scanner;

class TernaryOperator2 
{
	public static void main(String[] args)
	{
        int a,b,c, max;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter three numbers");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		
		max = (a>b && a>c)?a:(b>c)?b:c;
		System.out.println("Maximum value is "+max);
	}
}
