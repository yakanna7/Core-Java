/*
  Convert Byte object to String object
  This example shows how a Byte object can be converted into String object.
*/
package  packages.java.lang;

public class Byte2 {
	public static void main(String[] args) {
	    Byte bObj = new Byte("10");
	   
	    //use toString method of Byte class to convert Byte into String.
	    String str = bObj.toString();
	    System.out.println("Byte converted to String as " + str);
	  }

}
