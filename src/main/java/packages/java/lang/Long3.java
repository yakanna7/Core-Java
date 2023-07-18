/*
  Convert Long object to String object
  This example shows how a Long object can be converted into String object.
*/
package  packages.java.lang;

public class Long3 {
	 public static void main(String[] args) {
		    Long lObj = new Long(10);
		   
		    //use toString method of Long class to convert Long into String.
		    String str = lObj.toString();
		    System.out.println("Long converted to String as " + str);
		  }

}
