//Java Program to read and display Employee details using methods
package oops;

import java.util.Scanner;

class Employee
{
	int id;
	String name;
	String gender;
	String designation;
	float salary;

	public void setDetails() 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter employee id");
		id = s.nextInt();
		System.out.println("Enter name");
		name = s.next();
		System.out.println("Enter gender");
		gender = s.next();
		System.out.println("Enter designation");
		designation = s.next();
		System.out.println("Enter salary");
		salary = s.nextFloat();
	}

	public void getDetails()
	{
		System.out.println("Employee Id Is " + id);
		System.out.println("Name is " + name);
		System.out.println("Gender is " + gender);
		System.out.println("Designation is " + designation);
		System.out.println("Salary is " + salary);
	}

	public static void main(String[] args)
	{

		Employee e1 = new Employee();
		Employee e2 = new Employee();
		System.out.println("Enter First Employee Details");
		e1.setDetails();
		System.out.println("Enter Second Employee Details");
		e2.setDetails();
		System.out.println("\nFirst Employee Details Are\n");
		e1.getDetails();
		System.out.println("\nSecond Employee Details Are\n");
		e2.getDetails();
	}
}
