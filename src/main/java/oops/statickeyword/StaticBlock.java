//Java program to implement static block
package oops.statickeyword;

class StaticBlock {
	
	static int x;
	
	static {
		System.out.println("Initializing Statc variable x in static block1");
		x = 10;
	}

	static void display() {
		System.out.println("Display static method accessed");
		System.out.println("x = " + x);
	}

	public static void main(String args[]) {
		System.out.println("Main Method executed");
	}

	static {
		System.out.println("Invoking display method in static block2");
		display();
	}
}