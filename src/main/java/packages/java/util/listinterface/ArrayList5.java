// ArrayList remove(Object obj), remove(int index), removeAll(Collection c)

package packages.java.util.listinterface;

import java.util.ArrayList;

public class ArrayList5
{
	  public static void main(String a[])
	  {
	        ArrayList<Integer> empIdList = new ArrayList<Integer>();
	        
	        empIdList .add(101);
	        empIdList .add(102);
	        empIdList .add(103);
	        empIdList .add(104);
	        empIdList .add(105);
	        empIdList .add(106);
	        empIdList .add(107);
	        
	        empIdList.remove(new Integer(101));
	        System.out.println("After removing 101 empIdList is: "+empIdList);
	    
	        empIdList.remove(0);
	        System.out.println("After removing id at 0 empIdList is: "+empIdList);
	        
	        ArrayList<Integer> ids = new ArrayList<Integer>();
	        ids.add(104);
	        ids.add(107);    
	        
	        empIdList.removeAll(ids);
	        System.out.println("After removing sublist empIdList is: "+empIdList);     
	    }
}
