//Java program to display all even numbers between 1 to given number
package basic.loops;

import java.util.Scanner;

class WhileLoop3
{
	public static void main(String args[]) 
	{
		int num, i = 2;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter any number");
		num = s.nextInt();

		System.out.println("All even numbers between 1 and " + num + " are");
		while (i <= num)
		{
			System.out.println(i);
			i = i + 2;
		}
	}
}

// Another way but takes more time
/*
 * import java.util.Scanner;
 * 
 * class WhileLoop3 { public static void main(String args[]) { int num, i = 1;
 * 
 * Scanner s = new Scanner(System.in);
 * 
 * System.out.println("Enter any number"); num = s.nextInt();
 * 
 * System.out.println("All even numbers between 1 and "+num+" are"); while (i <=
 * num) { if(i%2==0) { System.out.println(i); } i++; } } }
 */
