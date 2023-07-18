//ArrayList hashCode( ), toArray( ), and toArray(T[] a) methods
package packages.java.util.listinterface;

import java.util.ArrayList;

public class ArrayList8
{
	 public static void main(String a[])
	 {
	        ArrayList<String> cricketersList = new ArrayList<String>();
	  
	        cricketersList.add("Dhoni");
	        cricketersList.add("Sachin");
	        cricketersList.add("Kohli");
	        cricketersList.add("Sehwag");
	        cricketersList.add("Raina");
	        cricketersList.add("Rohith");
	        
	        System.out.println("Hash Code of list is "+cricketersList.hashCode());
	        
	        // Converting list to array
	        Object players[] =cricketersList.toArray();
	        
	        System.out.println("Players list is");
	        
	        for(Object player : players)
	        {
	           System.out.println((String)player);
	        }
	       
	        String team[] = new String[cricketersList.size()];
	        
	        //copy list elements to array
	        cricketersList.toArray(team);
	        
	        System.out.println("Team list is ");
	        for(String name : team)
	        {
	            System.out.println(name);
	        }
	    }
}
















