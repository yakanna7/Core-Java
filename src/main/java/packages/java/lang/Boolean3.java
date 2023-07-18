/*
  Convert java String object to Boolean object
  This example shows how to convert java String object to a Java Boolean object.
*/
package  packages.java.lang;

public class Boolean3 {
	
	  public static void main(String[] args) {
		    //construct String object
		    String str = "false";
		   
		    //1. Convert using constructor
		    Boolean blnObj1 = new Boolean(str);
		    System.out.println(blnObj1);
		   
		    //2. Use valueOf method of Boolean class. This is a static method.
		    Boolean blnObj2 = Boolean.valueOf(str);
		    System.out.println(blnObj2);
		  }  

}
