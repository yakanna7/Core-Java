//Java program to read and display double dimensional array elements
package basic.arays;

import java.util.Scanner;

class DDArray1 
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter row and column size of array");

		int rows = s.nextInt();
		int cols = s.nextInt();
		int arr[][] = new int[rows][cols];
		int i, j;

		System.out.println("Enter elements of Array");

		for (i = 0; i < rows; i++)
		{
			for (j = 0; j < cols; j++)
			{
				arr[i][j] = s.nextInt();
			}
		}

		System.out.println("Array elements are");

		for (i = 0; i < rows; i++)
		{
			for (j = 0; j < cols; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
