// this keyword is used to differentiate between local and instance variables
package oops.thiskeyword;

class Book {

	private String title;
	private String author; // instance variables
	private String publication;
	private float price;

	Book(String title, String author, String publication, float price)// local
																		// variables
	{
		this.title = title;
		this.author = author;
		this.publication = publication;
		this.price = price;
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

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public static void main(String args[]) {
		
		Book book1 = new Book("Java", "Vishnu", "Siri", 350.0f);

		System.out.println("Book title is " + book1.getTitle());
		System.out.println("Author is " + book1.getAuthor());
		System.out.println("Publication is " + book1.getPublication());
		System.out.println("Price is " + book1.getPrice() + "rs");
	}
}
