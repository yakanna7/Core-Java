/*
        Generate Random Int Within Given Range Example
        This Java example shows how to generate an int randomly within given range
        using Math class.
*/
package  packages.java.lang;

public class Math10 {
	 public static void main(String args[]){
         
         /*
         The "(int)" parses the double to an int value replace 10 with
         your range of number.
        
         If you want a number between 5 and 15 the range is 10 [15-5]
         replace the 5 with the staring number.
        
         If you want the lowest number in the range to be 5 then add 5.
        
         Example :
         int ran = (int)(Math.random()*100)-50;
         will return a value in the range [-50;50]
         */
         for(int i=1;i<=10;i++)
        	   System.out.println(Math.random());
         int random = (int)(Math.random()* 100 );
         System.out.println(random);
 }

}
