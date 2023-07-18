/*ArrayList indexOf(Object o), lastIndexOf(Object o),ensureCapacity(int minCapacity),
 * trimToSize(),  and clone() methods */

package packages.java.util.listinterface;

import java.lang.reflect.Field;
import java.util.*;

public class ArrayList7 
{
	 @SuppressWarnings("unchecked")
	public static void main(String a[]) throws Exception
	 {
	        ArrayList<String> courseList = new ArrayList<String>();
	       
	        courseList.add("Java");
	        courseList.add(".Net");
	        courseList.add("Php");
	        courseList.add("Oracle");
	        courseList.add(".Net");
	        courseList.add("Testing");
	        courseList.add("Java");
	        
	        System.out.println("Index of Java is "+courseList.indexOf("Java"));
	        System.out.println("Last Index of .Net is "+courseList.lastIndexOf(".Net"));
	        
	        System.out.println("List size is "+courseList.size());
	        System.out.println("List capacity is "+getCapacity(courseList));
	        
	        courseList.ensureCapacity(20);
	        System.out.println("After ensure capacity list size is "+courseList.size());
	        System.out.println("After ensure capacity List capacity is "+getCapacity(courseList));
	        
	        courseList.trimToSize();
	        System.out.println("After trim size List size is "+courseList.size());
	        System.out.println("After trim size List capacity is "+getCapacity(courseList));
	        
	        //Creating duplicate list
	        List<String> clonedList = ((ArrayList<String>)courseList.clone());
	        System.out.println("Cloned List elements are "+clonedList);
	    }

	    static int getCapacity(ArrayList<?> list) throws Exception
	    {
	    	Field dataField = ArrayList.class.getDeclaredField("elementData");
	        dataField.setAccessible(true);
	        return ((Object[]) dataField.get(list)).length;
	    }
}
