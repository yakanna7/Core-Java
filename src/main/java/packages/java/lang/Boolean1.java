/*
  Java Boolean Example
  This example shows how object of Boolean can be declared and used.
  Boolean is a wrapper class provided to wrap boolean primitive value.
  It has a single field of type boolean.
*/
package  packages.java.lang;

public class Boolean1 {

	  public static void main(String[] args) {
		    //Create an Boolean object using one the below given ways
		    //1. Create an Boolean object from boolean value
		    Boolean blnObj1 = new Boolean(true);
		    Boolean blnObj2=true;
		    /*
		    2. Create an Boolean object from String. It creates a Boolean object
		    representing true if the string is not null and equals to true. Otherwise
		    it creates Boolean object representing false.
		    */
		    Boolean blnObj3 = new Boolean("false");
		   
		    //print value of Boolean objects
		    System.out.println(blnObj1);
		    System.out.println(blnObj2);
		    System.out.println(blnObj3);
		  }
}

