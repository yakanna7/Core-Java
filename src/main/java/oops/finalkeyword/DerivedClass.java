// Java final method example
package oops.finalkeyword;

class BaseClass
{
    final public void display()
	{
	   System.out.println("Base class final method can't be overridden");
	}
}

class DerivedClass extends BaseClass {

	/*public void display()
	{
	   System.out.println("Child class can't override final method");
	} */
	
	public static void main(String[] args) {
		DerivedClass dc = new DerivedClass();
		dc.display();
	}
}
