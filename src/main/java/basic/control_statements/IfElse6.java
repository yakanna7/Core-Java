//Java program to check whether given alphabet is vowel or consonant
package basic.control_statements;

import java.util.Scanner;

class IfElse6
{
	public static void main(String[] args)
	{
		char ch;
		Scanner s = new Scanner(System.in);

		System.out.println("Enter any alphabet");
		ch = s.next().charAt(0);

		if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I'
				|| ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U'
				|| ch == 'u') 
		{
			System.out.println(ch + " is an vowel");
		} 
		else 
		{
			System.out.println(ch + " is a consonant");
		}
	}
}
