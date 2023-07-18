package java5.generics;

class GenericMethod {

	public static <E> void displayArray(E[] elements) {
		for (E element : elements) {
			System.out.println(element);
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Integer intArray[] = { 10, 20, 30, 40, 50 };
		Double doubleArray[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		String strArray[] = { "Hai", "How", "are", "You?" };

		System.out.println("Integer Array Elements are");

		displayArray(intArray);

		System.out.println("Double array elements are");

		displayArray(doubleArray);

		System.out.println("String Array elements are");

		displayArray(strArray);
	}

}
