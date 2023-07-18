// Java TreeSet Example With Comparator
package packages.java.util.setinterface;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Product {
	private int id;
	private String name;
	private double price;

	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}

// ProductComparator Class

class ProductComparator implements Comparator<Product> {
	public int compare(Product p1, Product p2) {
		if (p1.getId() == p2.getId()) {
			return 0;
		} else {
			return (int) (p1.getPrice() - p2.getPrice());
		}
	}
}

public class TreeSet2 {
	public static void main(String[] args) {
		// Instantiating ProductComparator

		ProductComparator comparator = new ProductComparator();

		// Creating TreeSet with 'ProductComparator' as Comparator.

		TreeSet<Product> set = new TreeSet<Product>(comparator);

		// Adding elements to TreeSet

		set.add(new Product(120, "Samsung Mobile", 8500));
		set.add(new Product(130, "Kyboard", 500));
		set.add(new Product(140, "Apple Mobile", 60000));
		set.add(new Product(150, "Mouse", 200));
		set.add(new Product(160, "LG TV", 15000));
		set.add(new Product(120, "Bike", 8500)); // Duplicate element
		set.add(new Product(160, "AC", 8500)); // Duplicate element

		// Iterating though TreeSet

		System.out.println("All products list is:");
		Iterator<Product> it = set.iterator();

		while (it.hasNext()) {
			Product p = it.next();
			System.out.println("Product Id   is: " + p.getId());
			System.out.println("Product Name is: " + p.getName());
			System.out.println("Product Cost is: " + p.getPrice());
			System.out.println();
		}
	}
}