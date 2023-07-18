//Java example program to implement method reference
package java8.lambda;

import java.util.List;
import java.util.ArrayList;

public class MethodReferenceTest {
	public static void main(String args[]) {
		List<String> names = new ArrayList<String>();

		names.add("Yakanna");
		names.add("Sateesh");
		names.add("Eshwar");
		names.add("Sujith");
		names.add("Vinod");

		// using method reference
		names.forEach(System.out::println);

		// using lambda
		names.forEach((t) -> System.out.println(t));
	}
}
