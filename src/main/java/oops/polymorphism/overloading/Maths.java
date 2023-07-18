//Method Overloading Example
package oops.polymorphism.overloading;

class Maths {
	public int min(int x, int y) {
		return (x < y) ? x : y;
	}

	public float min(float x, float y) {
		return (x < y) ? x : y;
	}

	public int max(int x, int y) {
		return (x > y) ? x : y;
	}

	public int max(int x, int y, int z) {
		return (x > y && x > z) ? x : (y > z) ? y : z;
	}

	public float max(float x, float y) {
		return (x > y) ? x : y;
	}

	public static void main(String... args)// alternative way to args[]
	{
		Maths m = new Maths();

		System.out.println("Minimum  of 100, 200 is " + m.min(100, 200));
		System.out.println("Minimum of 7.7, 6.6 is " + m.min(7.7f, 6.6f));
		System.out.println("Maximum of 5, 3 is  " + m.max(5, 3));
		System.out.println("Maximum of 10, 15, 13 is  " + m.max(10, 15, 13));
		System.out.println("Maximum of 10.5, 7.2 is " + m.max(10.5f, 7.2f));
	}
}
