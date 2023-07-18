//Accessing ArrayList elements using ListIterator
package packages.java.util.listinterface;

import java.util.*;

class Product
{
	private int id;
	private String name;
	private double price;
	
	public Product(int id, String name, double price)
	{
		this.id    = id;
		this.name  = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

class ArrayList13
{
	public static void main(String args[])
	{
		List <Product> productsList = new ArrayList<Product>();
		
		productsList.add(new Product(1122,"Mobile",70000));
		productsList.add(new Product(1133,"Pendrive",300));
		productsList.add(new Product(1144,"Memory Card",200));
		productsList.add(new Product(1155,"Headset",300));
		
	    ListIterator<Product> productsIterator = productsList.listIterator();
	    
	    System.out.println("Accessing products in forward direction");
	    
	    while(productsIterator.hasNext())
	    {
	    	System.out.println("Product "+(productsIterator.nextIndex()+1)+" details are");
	    	Product p = productsIterator.next();
	    	System.out.println("Id is "+p.getId());
	    	System.out.println("Name is "+p.getName());
	    	System.out.println("Price is "+p.getPrice()+" rs");
	    	System.out.println();	
	    }
	    
        System.out.println("Accessing products in backward direction");
	    
	    while(productsIterator.hasPrevious())
	    {
	    	System.out.println("Product "+(productsIterator.previousIndex()+1)+" details are");
	    	Product p = productsIterator.previous();
	    	System.out.println("Id is "+p.getId());
	    	System.out.println("Name is "+p.getName());
	    	System.out.println("Price is "+p.getPrice()+" rs");
	    	System.out.println();	
	    }
	}
}
