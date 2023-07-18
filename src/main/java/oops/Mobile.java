//Java program to passing object as argument to a method. Here we are coping one object values in to another object.
package oops;
import java.util.*;

class Mobile {

	String company;
    String model;
    float price;
    String color;
    
    void setDetails()
    {
        Scanner s = new Scanner(System.in);
        
    	System.out.println("Enter Company Name");
        company = s.next();
        System.out.println("Enter Model Name");
        model = s.next();
        System.out.println("Enter Price");
        price = s.nextFloat();
        System.out.println("Enter Color");
        color = s.next();
    }
    
    void getDetails()
    {
        System.out.println("Mobile Company Name is " +company);
        System.out.println("Model is " + model);
        System.out.println("Price is " + price);
        System.out.println("Color is "+color);
    }

    void copyDetails(Mobile m)
    {
        company = m.company;
        model   = m.model;
        price   = m.price;
        color   = m.color;     
    }

	public static void main(String[] args) {
	
		Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        
        m1.setDetails();
        m2.copyDetails(m1);

        System.out.println("\nActual Mobile Details Are\n");
        m1.getDetails();
       
        System.out.println("\nCopied Mobile Details Are\n");
        m2.getDetails();       
	}
}





