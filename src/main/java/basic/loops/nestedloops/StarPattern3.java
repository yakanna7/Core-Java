/*Java program to display following pattern       

    *
   * *
  *   *
 *     *
*********        
 */
package basic.loops.nestedloops;

import java.util.Scanner;

class StarPattern3
{
	public static void main(String[] args)
	{
		int i, j, num;

		Scanner s = new Scanner(System.in);
	
	    System.out.println("Enter number of rows");
	    num = s.nextInt();
	    
	    for(i=1; i<=num; i++)
	    {
	        //Prints trailing spaces
	        for(j=i; j<num; j++)
	        {
	            System.out.print(" ");
	        }
	 
	        //Prints hollow pyramid
	        for(j=1; j<=(2*i-1); j++)
	        {
	            if(i==num || j==1 || j==(2*i-1))
	            {
	            	System.out.print("*");
	            }
	            else
	            {
	            	System.out.print(" ");
	            }
	        }
	 
	        System.out.println();
	    }
	}
}
