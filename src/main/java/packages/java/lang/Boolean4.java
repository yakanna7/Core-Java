/*
   Convert boolean to Boolean object example.
   This example shows how a java boolean primitive can be converted
   to a Boolean object.
*/
package  packages.java.lang;

public class Boolean4 {
	
	  public static void main(String[] args) {
		    boolean b = true;
		   
		    //1. using constructor
		    Boolean blnObj1 = new Boolean(b);
		   
		    //2. using valueOf method of Boolean class. This is a static method.
		    Boolean blnObj2 = Boolean.valueOf(b);
		    
		    System.out.println(blnObj1);
		    System.out.println(blnObj2);
		  }

}
