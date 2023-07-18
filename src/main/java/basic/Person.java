//7.Java program to read and display person details
package basic;

import java.util.*;

class Person 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter person name");
		String name = s.next();
		System.out.println("Eneter gender");
		String gender = s.next();
		System.out.println("Enter age");
		int age = s.nextInt();
		System.out.println("Enter height");
		float height = s.nextFloat();
		System.out.println("Is person married?(true/false)");
		boolean isMarried = s.nextBoolean();
		System.out.println("Enter address");
		String address = s.next();

		System.out.println("Person name is " + name);
		System.out.println("Gender is " + gender);
		System.out.println("Age is " + age + " years");
		System.out.println("Hight is " + height + " feet");
		System.out.println("Is married? " + isMarried);
		System.out.println("Address is " + address);
	}
}
