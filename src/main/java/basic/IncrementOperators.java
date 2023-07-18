//5.Java program to implement all increment operators
package basic;

class IncrementOperators
{
	public static void main(String[] args)
	{
		int a = 10, b = 10;

		System.out.println("Pre Increment");
		System.out.println("a = " + a); // 10
		System.out.println("++a = " + (++a)); // 11
		System.out.println("a = " + a); // 11

		System.out.println("Post Increment");
		System.out.println("b = " + b); // 10
		System.out.println("b++ = " + (b++)); // 10
		System.out.println("b = " + b); // 11
	}
}
