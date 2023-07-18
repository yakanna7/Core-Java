//8.Java program to ready and display employee details using Scanner class
package basic;

import java.util.Scanner;

class Employee
{
	public static void main(String[] args)
	{
		int id;
		String name;
		String gender;
		String designation;
		float salary;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter Employee Id");
		id = s.nextInt();
		System.out.println("Enter name");
		name = s.next();
		System.out.println("Enter gender");
		gender = s.next();
		System.out.println("Enter designation");
		designation = s.next();
		System.out.println("Enter salary");
		salary = s.nextFloat();

		System.out.println("Employee id is " + id);
		System.out.println("Name is " + name);
		System.out.println("Gender is " + gender);
		System.out.println("Designation is " + designation);
		System.out.println("Salary is " + salary);
	}
}
