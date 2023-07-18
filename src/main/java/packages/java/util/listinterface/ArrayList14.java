/*ArrayList forEach(Consumer<? super E> action), removeIf (Predicate<? super E> filter), 
 * and replaceAll(UnaryOperator<E> operator)methods
*/
package packages.java.util.listinterface;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

class Book
{
	private String title;
	private String author;
	private double price;
	private int publishedYear;

	public Book(String title, String author, double price, int publishedYear)
	{
		this.title  = title;
		this.author = author;
		this.price  = price;
		this.publishedYear = publishedYear;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}

}

class ArrayList14
{
	public static void main(String[] args)
	{
	  List<Book> booksList = new ArrayList<Book>();
	  
	  booksList.add(new Book("Java","Yakanna",400, 2005));
	  booksList.add(new Book(".Net","Ravi", 400, 2008));
	  booksList.add(new Book("PHP","Sateesh",450,2010));
	  booksList.add(new Book("HTML","Sahitya",400, 2015));
	  
	  Consumer<Book> action = (Book b) -> System.out.println("Title:"+b.getTitle() +", Author: "+b.getAuthor()+", Price: "+b.getPrice());
	  
	  System.out.println("All books details:");
	  booksList.forEach(action);
	  
	  UnaryOperator<Book> unaryOpt = b -> modifyPrice(b); 
	  booksList.replaceAll(unaryOpt);
	  
	  System.out.println("\nAfter increasing each book price 10%");
	  System.out.println("All books details:");
	  booksList.forEach(action);
	  
	  Predicate<Book> bookPredicate = bk-> bk.getPublishedYear()<2010;
	  booksList.removeIf(bookPredicate);
	  
	  System.out.println("\nAfter removing books published before 2010");
	  System.out.println("All books details:");
	  booksList.forEach(action); 
	}
	
	private static Book modifyPrice(Book b)
	{
        double currentPrice = b.getPrice();
        // increasing  10% on all books
        double increasePrice = currentPrice+(currentPrice*10)/100; 
		b.setPrice(increasePrice);
        return b;
     }
}
