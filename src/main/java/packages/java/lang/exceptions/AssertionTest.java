
//Java program to implement assertion 

package packages.java.lang.exceptions;

import java.util.Scanner;

class AssertionTest 
{
	public static void main(String args[]) 
	{
		int num, rem, reverseNum = 0;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number");
		num = s.nextInt();

		while (num > 0) 
		{
			rem = num % 10;
			reverseNum = reverseNum * 10 + rem;
			num = num / 10;
		}
		
        assert (num==reverseNum):"Original is "+num+" Reverse is: "+reverseNum;
        
		if (num == reverseNum) 
		{
			System.out.println("Given Number is pallindrome");

		} 
		else 
		{
			System.out.println("Given number is not pallindrome");
		}
	}
}


