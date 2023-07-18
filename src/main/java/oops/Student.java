//Java program to implement Student class to read and display two student details
package oops;

import java.util.*;

class Student 
{
	int id;
	String name;
	String gender;
	String course;

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		Student s1 = new Student();
		Student s2 = new Student();

		System.out.println("Enter first student details");

		System.out.println("Enter Id");
		s1.id = s.nextInt();
		System.out.println("Enter Name");
		s1.name = s.next();
		System.out.println("Enter Gender");
		s1.gender = s.next();
		System.out.println("Enter Course");
		s1.course = s.next();

		System.out.println("Enter second student details");

		System.out.println("Enter Id");
		s2.id = s.nextInt();
		System.out.println("Enter Name");
		s2.name = s.next();
		System.out.println("Enter Gender");
		s2.gender = s.next();
		System.out.println("Enter Course");
		s2.course = s.next();

		System.out.println("First Student details are\n");
		System.out.println("Student Id is " + s1.id);
		System.out.println("Student Name is " + s1.name);
		System.out.println("Gender is " + s1.gender);
		System.out.println("Course is " + s1.course);

		System.out.println("\nSecond Student details are\n");
		System.out.println("Student Id is " + s2.id);
		System.out.println("Student Name is " + s2.name);
		System.out.println("Gender is " + s2.gender);
		System.out.println("Course is " + s2.course);
	}
}
