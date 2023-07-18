//Java interface example
package oops.interfaces;

interface Shape 
{
	public abstract void area();
    void perimeter();// Here public abstract is optional
}

class Rectangle implements Shape 
{
	private double length;
	private double breadth;

	public Rectangle(double length, double breadth) 
	{
		this.length = length;
		this.breadth = breadth;
	}

	public void area() 
	{
		System.out.println("Area of Rectanle is "+(length+breadth));
	}

	public void perimeter() 
	{
		 System.out.println("Perimeter of Rectangle is "+(2 * (length + breadth)));
	}
}

class Square implements Shape
{
	private double side;

	public Square(double side)
	{
		this.side = side;
	}

	public void area() 
	{
		System.out.println("Area of Square is "+(side * side));
	}

	public void perimeter() 
	{
	   System.out.println("Perimeter of Square is "+( 4 * side));
	}
}

class ShapeTester
{
	public static void main(String[] args)
	{
		Shape s = new Rectangle(3.5,4.6);
		s.area();
		s.perimeter();
		
		s= new Square(7.5);
		s.area();
		s.perimeter();
	}
}
