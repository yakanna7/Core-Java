/*Java program to implement a function to read single character 
from keyboard using with no arguments and with return type*/

package basic.functions;

import java.util.Scanner;

class Function4
{
	static char getChar()
	{
		Scanner s = new Scanner(System.in);
		char ch = s.next().charAt(0);
		return ch;
	}

	public static void main(String[] args)
	{
		System.out.println("Enter section of a student");
		char section = getChar();
		
		System.out.println("Enter grade of a student");
		char grade = getChar();
		
		System.out.println("Student section is "+section);
		System.out.println("Student garde is "+grade);
	}
}
