/*Java program to implement super keyword to access parent class 
variable and overridden method in child class*/

package oops.inheritance.superkeyword;

class Parent {
	String message;

	Parent() {
		message = "This Is Parent Class Variable";
	}

	void display() {
		System.out.println("Parent class Method Accessed");
	}
}

class Child extends Parent {

	String message;//Hidden Field Not Recommended To Create

	Child() {
		message = "This Is Child Class Variable";
	}

	void display() //method overriding
	{
		System.out.println(super.message);// accessing parent class variable
		System.out.println(message);

		super.display(); // accessing parent class method
		System.out.println("Child Class Method Accessed");
	}

	public static void main(String args[]) {
		Child c = new Child();
		c.display();
	}
}
