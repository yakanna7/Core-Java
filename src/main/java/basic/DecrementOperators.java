//6.Java program to implement all decrement operators
package basic;

class DecrementOperators 
{
	public static void main(String[] args)
	{
		int a = 10, b = 10;

		System.out.println("Pre Decrement");
		System.out.println("a = " + a); // 10
		System.out.println("--a = " + (--a)); // 9
		System.out.println("a = " + a); // 9

		System.out.println("Post Decrement");
		System.out.println("b = " + b); // 10
		System.out.println("b-- = " + (b--)); // 10
		System.out.println("b = " + b); // 9
	}
}
