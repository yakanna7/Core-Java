// Java TreeSet Example With No Comparator
package packages.java.util.setinterface;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 
{
	public static void main(String a[]) 
	{
		// Creating a TreeSet without supplying any Comparator

		TreeSet<Integer> set = new TreeSet<Integer>();

		// Adding elements to TreeSet

		set.add(23);

		set.add(11);

		set.add(41);

		set.add(7);

		set.add(69);

		set.add(18);

		set.add(38);

		// printing elements of TreeSet

		Iterator<Integer> itr = set.iterator();
		
		while(itr.hasNext())
		{
		   System.out.println(itr.next());
		}
	}
}
