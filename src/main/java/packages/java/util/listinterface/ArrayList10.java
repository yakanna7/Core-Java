
//Accessing ArrayList elements using for each loop

package packages.java.util.listinterface;

import java.util.ArrayList;

class ArrayList10
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(new Integer(10));
		list.add(new Integer(20));
		list.add(30); // auto boxing
		list.add(40);
		list.add(50);

		System.out.println("Array List elements are");
		for (int val : list) 
                   {
			System.out.println(val);
		}
	}
}



/*
//How to shuffle elements in ArrayList?
public class ArrayList10 
{
	  public static void main(String a[])
	  {
	        ArrayList<String> list = new ArrayList<String>();
	        list.add("Java");
	        list.add("Cric");
	        list.add("Play");
	        list.add("Watch");
	        list.add("Glass");
	        list.add("Movie");
	        list.add("Girl");
	         
	        Collections.shuffle(list);
	        System.out.println("Results after shuffle operation:");
	        for(String str: list){
	            System.out.println(str);
	        }
	    }
}*/
