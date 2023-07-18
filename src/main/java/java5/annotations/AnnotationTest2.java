//The @SuppressWarnings annotation example
package java5.annotations;

import java.util.ArrayList;

public class AnnotationTest2 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String args[]) {
		ArrayList courses = new ArrayList();
		courses.add("Java");
		courses.add(".Net");
		courses.add("Android");

		for (Object course : courses)
		{
			System.out.println(course);
		}
	}
}











