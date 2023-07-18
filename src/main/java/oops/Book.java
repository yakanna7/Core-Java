//Java Program to implement class Book
package oops;

import java.util.*;

class Book 
{
	String title;
	String author;
	String publication;
	float price;

	void setDetails() 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Title Of The The Book");
		title = s.next();
		System.out.println("Enter Author name");
		author = s.next();
		System.out.println("Enter Publication");
		publication = s.next();
		System.out.println("Enter Price");
		price = s.nextFloat();
	}

	void getDetails() 
	{
		System.out.println("Book Title Is " + title);
		System.out.println("Author Is " + author);
		System.out.println("Publication Is " + publication);
		System.out.println("Price is " + price);
	}

	public static void main(String[] args) 
	{
		Book b = new Book();
		b.setDetails();
		b.getDetails();
	}
}
