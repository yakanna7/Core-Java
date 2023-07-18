/*Java program to display following pattern

      5 
      4 5 
      3 4 5 
      2 3 4 5
      1 2 3 4 5
 */
package basic.loops.nestedloops;

import java.util.Scanner;

class NumberPattern6 
{
	public static void main(String[] args)
	{
		int num, i, j;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter number of rows");
		num = s.nextInt();

		for (i = num; i >= 1; i--)
		{
			for (j = i; j <= num; j++)
			{
				System.out.print(j + " ");
			}

			System.out.println();
		}
	}
}
