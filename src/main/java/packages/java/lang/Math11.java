/*
  Generate random numbers using Math.random
  This java example shows how to generate random numbers using random method of
  Java Math class.
*/
 
package  packages.java.lang;

public class Math11 {
	 public static void main(String[] args) {
		   
		    /*
		     * To generate random numbers, use
		     * static double random() method of Java Math class.
		     *
		     * This method returns a positive double value grater than 0.0
		     * and less than 1.0
		    */
		   
		    System.out.println("Random numbers between 0.0 and 1.0 are,");
		    for(int i=0; i < 5 ; i++)
		      System.out.println("Random Number ["+ (i+1) + "] : " + Math.random());
		     
		    /*
		     * To generate random number between 1 to 100 use following code
		     */
		 
		    System.out.println("Random numbers between 1 and 100 are,");
		    for(int i=0; i < 5 ; i++)
		      System.out.println("Random Number ["+ (i+1) + "] : " + (int)(Math.random()*100));
		   
		  }

}
