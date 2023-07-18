//Java program to find trace of a given matrix
package basic.arays;

import java.util.*;

class DDArray2 
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int rows, cols;

		System.out.println("Enter row and column size of Matrix A");
		rows = s.nextInt();
		cols = s.nextInt();
		
		if (rows == cols) 
		{
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

			int trace = 0;

			for (i = 0; i < rows; i++)
			{
				trace = trace + A[i][i];
			}
			
			System.out.println("Trace of matrix is " + trace);
		}
		else 
		{
			System.out.println("Trace can not be determined for rectangular matrices");
		}
	}
}
