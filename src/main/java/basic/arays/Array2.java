//Java program to display all even elements of an array
package basic.arays;

import java.util.Scanner;

class Array2 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter size of array");
		int size = s.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter array elements");
		int i;
		for (i = 0; i < size; i++)
		{
			arr[i] = s.nextInt();
		}

		System.out.println("All even elements of array are");
		for (i = 0; i < arr.length; i++)
		{
			if (arr[i] % 2 == 0) 
			{
				System.out.println(arr[i]);
			}
		}
	}
}
