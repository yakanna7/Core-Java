/*
  Convert Boolean Object to boolean primitive example.
  This example show how a Boolean object can be converted to a boolean primitive
  type.
*/
package  packages.java.lang;

public class Boolean2 {
	 public static void main(String[] args) {
		    //Construct a Boolean object.
		    Boolean blnObj = new Boolean("true");
		   
		    //use booleanValue of Boolean class to convert it into boolean primitive
		    boolean b = blnObj.booleanValue();
		    System.out.println(b);

   }
}
