//Java program to show result of implicit default constructor

package oops.constructors;

class ImplicitDefaultConstructor {

	int i;
	float f;
	boolean b;
	String s;

	public void getDefaultValues() {
		System.out.println("int     default value is " + i);
		System.out.println("float   default value is " + f);
		System.out.println("String  default  value is " + s);
		System.out.println("boolean default value is " + b);
	}

	public static void main(String args[]) {
		ImplicitDefaultConstructor dc = new ImplicitDefaultConstructor();
		dc.getDefaultValues();
	}
}
