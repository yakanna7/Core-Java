//@override annotation example
package java5.annotations;

class Parent {
	public void display() {
		System.out.println("This is Parent class method");
	}
}

class Child extends Parent {
	@Override
	public void display() {
		System.out.println("This is Child class method");
	}
}

public class AnnotationTest1 {
	public static void main(String args[]) {
		Parent p = new Parent();
		p.display();
		p = new Child();
		p.display();
	}
}
