/*
  Convert java Boolean object to String object Example
  This example shows how to convert java Boolean object into String object.
*/
package  packages.java.lang;

public class Boolean5 {
	
	 public static void main(String[] args) {
		    //construct Boolean object
		    Boolean blnObj = new Boolean("true");
		   
		    //use toString method of Boolean class to convert it into String
		    String str = blnObj.toString();
		    System.out.println(str);
		  }
	

}
