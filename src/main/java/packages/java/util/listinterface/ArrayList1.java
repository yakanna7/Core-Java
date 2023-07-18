//Different ways of creating ArrayList object

package packages.java.util.listinterface;

import java.util.ArrayList;

class ArrayList1 {

	public static void main(String[] args) {

	
		ArrayList list1 = new ArrayList(); // Non generic list

		list1.add("Fratello");
		list1.add(10);
		list1.add(3.5);
		list1.add('A');
		list1.add(null);
		list1.add("Fratello");

		System.out.println(list1);

		ArrayList<String> list2 = new ArrayList<String>(20);

		list2.add("Fratello");
		list2.add("Innotech");
		list2.add("Kphb");
		list2.add("Hyderabad");
		// list3.add(10); // not possible

		System.out.println(list2);

		ArrayList list3 = new ArrayList(list2);

		System.out.println(list3);
	}
}


