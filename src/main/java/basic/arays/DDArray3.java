//Java program to find transpose matrix of a given matrix
package basic.arays;

import java.util.*;

class DDArray3 
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int rows, cols;
		
		System.out.println("Enter row and column size of Matrix A");
		rows = s.nextInt();
		cols = s.nextInt();
		int A[][] = new int[rows][cols];
		
		System.out.println("Enter Matrix A elements");
		int i, j;
		for (i = 0; i < rows; i++)
		{
			for (j = 0; j < cols; j++)
			{
				A[i][j] = s.nextInt();
			}
		}

		int T[][] = new int[cols][rows];
		for (i = 0; i < cols; i++)
		{
			for (j = 0; j < rows; j++)
			{
				T[i][j] = A[j][i];
			}
		}

		System.out.println("Matrix A elements are");

		for (i = 0; i < rows; i++)
		{
			for (j = 0; j < cols; j++)
			{
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Transpose Matrix T elements are");

		for (i = 0; i < cols; i++)
		{
			for (j = 0; j < rows; j++)
			{
				System.out.print(T[i][j] + " ");
			}
			System.out.println();
		}
	}
}
