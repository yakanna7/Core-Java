//Java program to display multiplication table of a given number
package basic.loops;

import java.util.Scanner;

class ForLoop6
{
	public static void main(String[] args)
	{
		int num, i;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter multiplication table number");
		num = s.nextInt();
		
		System.out.println("Multiplication table of "+num+" is");
		
		for(i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+" = "+(num*i));
		}
	}
}
