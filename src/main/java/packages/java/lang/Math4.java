/*
  Find floor value of a number using Math.floor
  This java example shows how to find a floor value of a number using floor method
  of Java Math class. floor method returns the largest interger which is not grater
  than the value.
*/
package  packages.java.lang;

public class Math4 {
	 public static void main(String[] args) {
		   
		    /*
		     * To find a floor value, use
		     * static double floor(double d) method of Math class.
		     *
		     * It returns a largest integer which is not grater than the argument value.
		     */
		   
		    //Returns the same value
		    System.out.println(Math.floor(10));
		   
		    //returns largest integer which is not less than 30.1, i.e. 30
		    System.out.println(Math.floor(10.1));
		   
		    //returns largest integer which is not less than 15.5, i.e. 15
		    System.out.println(Math.floor(5.5));
		   
		    //in this case it would be -40
		    System.out.println(Math.floor(-20));
		   
		    //it returns -43.
		    System.out.println(Math.floor(-42.4));
		   
		    //returns 0
		    System.out.println(Math.floor(0));
		   
		  }

}
