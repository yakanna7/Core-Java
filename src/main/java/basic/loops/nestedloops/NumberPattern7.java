/*Java program to display following pattern

      1 
      2 3  
      4 5 6 
      7 8 9 10 
      11 12 13 14 15
 */
package basic.loops.nestedloops;

import java.util.Scanner;

class NumberPattern7 
{
	public static void main(String[] args)
	{
		int num, i, j, k=1;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter number of rows");
		num = s.nextInt();

		for (i = 1; i <= num; i++)
		{
			for (j = 1; j <= i; j++)
			{
				System.out.print(k+ " ");
				k++;
			}

			System.out.println();
		}
	}
}
