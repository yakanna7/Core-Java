/*
  Find absolute value of float, int, double and long using Math.abs
  This java example shows how to find absolute value of any double,
  float, long or java int value using abs method of Math class.
*/
 
package  packages.java.lang;
public class Math1 {

	  public static void main(String[] args) {
		   
		    int i = 8;
		    int j = -5;
		   
		   
		   
		     System.out.println("Absolute value of " + i + " is :" + Math.abs(i));
		     System.out.println("Absolute value of " + j + " is :" + Math.abs(j));
		   
		     float f1 = 10.40f;
		     float f2 = -50.28f;
		 
		    System.out.println("Absolute value of " + f1 + " is :" + Math.abs(f1));
		    System.out.println("Absolute value of " + f2 + " is :" + Math.abs(f2));
		   
		    double d1 = 43.324;
		    double d2 = -349.324;
		    
		    System.out.println("Absolute value of " + d1 + " is :" + Math.abs(d1));
		    System.out.println("Absolute value of " + d2 + " is :" + Math.abs(d2));
		   
		    long l1 = 34;
		    long l2 = -439;
		    
		    System.out.println("Absolute value of " + l1 + " is :" + Math.abs(l1));
		    System.out.println("Absolute value of " + l2 + " is :" + Math.abs(l2));
		   
		  }
}
