//Java example program to implement Comparator interface
package packages.java.util;

import java.util.*;

class Product {
	private int id;
	private String name;
	private double cost;

	
	public Product(int id, String name, double cost) {
		this.id = id;
		this.name = name;
		this.cost = cost;
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

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id != other.id)
			return false;
		return true;
	}
}

class SortByName implements Comparator<Product> {
	@Override
	public int compare(Product o1, Product o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

class SortByCost implements Comparator<Product> {
	@Override
	public int compare(Product o1, Product o2) {
		return Double.compare(o1.getCost(), o2.getCost());
	}
}

public class ComparatorTest {
	public static void main(String args[]) {
		List<Product> products = new ArrayList<Product>();

		products.add(new Product(1122, "Apple A7 mobile", 60000));
		products.add(new Product(1100, "Lenovo Laptop", 30000));
		products.add(new Product(2123, "Hero Bike", 70000));
		products.add(new Product(1000, "Voltas AC", 25000));

		Collections.sort(products, new SortByName());
		Iterator<Product> sortByNameItr = products.iterator();

		System.out.println("List of all products after sort by name\n");
		displayProducts(sortByNameItr);

		Collections.sort(products, new SortByCost());
		Iterator<Product> sortByCostItr = products.iterator();

		System.out.println("List of all products after sort by cost\n");
		displayProducts(sortByCostItr);
	}

	private static void displayProducts(Iterator<Product> productsList) {
		while (productsList.hasNext()) {
			Product p = productsList.next();
			System.out.println("Id is " + p.getId());
			System.out.println("Name is " + p.getName());
			System.out.println("Cost is " + p.getCost());
			System.out.println();
		}
	}
}




