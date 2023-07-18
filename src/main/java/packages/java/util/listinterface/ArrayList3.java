/*ArrayList add(E e), add(int index, E element), addAll(Collection c) 
 * and  addAll(int index, Collection c) methods */
package packages.java.util.listinterface;

import java.util.ArrayList;

class ArrayList3 {

	public static void main(String a[]) {

		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Fratello");
		list1.add("KPHB");

		// Adding element at specified index
		list1.add(1, "Innotech");
		System.out.println("Array List elemets are: " + list1);

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Hyderabad");
		list2.add("India");

		// Adding all elements at the end of list
		list1.addAll(list2);
		System.out.println("Add all at end elements are " + list1);

		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("Training");
		list3.add("Institute");

		// Adding all elements from specified index
		list1.addAll(2, list3);
		System.out.println("Add all at index elements are " + list1);

	}
}
