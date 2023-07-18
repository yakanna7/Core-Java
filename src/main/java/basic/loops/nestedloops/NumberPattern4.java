/*Java program to display following pattern

      5 4 3 2 1
      5 4 3 2 
      5 4 3 
      5 4
      5
 */
package basic.loops.nestedloops;

import java.util.Scanner;

class NumberPattern4 
{
	public static void main(String[] args)
	{
		int num, i, j;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter number of rows");
		num = s.nextInt();

		for (i = 1; i <= num; i++)
		{
			for (j = num; j >= i; j--)
			{
				System.out.print(j + " ");
			}

			System.out.println();
		}
	}
}
