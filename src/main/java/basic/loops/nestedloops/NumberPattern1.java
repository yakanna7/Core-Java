/*Java program to display following pattern

      1
      1 2
      1 2 3
      1 2 3 4
      1 2 3 4 5
 */
package basic.loops.nestedloops;

import java.util.Scanner;

class NumberPattern1
{
	public static void main(String[] args)
	{
		int num, i, j;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter number of rows");
		num = s.nextInt();

		for (i = 1; i <= num; i++)
		{
			for (j = 1; j <= i; j++)
			{
				System.out.print(j + " ");
			}

			System.out.println();
		}
	}
}
