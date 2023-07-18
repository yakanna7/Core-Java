//Java program to implement a function to find factorial value of given number
package basic.functions;
import java.util.Scanner;

class Function7
{
	static long findFact(int num)
	{
		 
		long fact =1;
		
		for(int i=1;i<=num;i++)
		{
			fact = fact *i;
		}
		
		return fact;
	}
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number");
		int val = s.nextInt();
		
		System.out.println("Factorial value of "+val+" is "+findFact(val));	
	}
}
