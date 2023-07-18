//Java program to implement a function to sort elements of an array
package basic.functions;

import java.util.Scanner;

class PassArrayToFunction2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter size of array");
		int size = input.nextInt();
		int array[] = new int[size];

		System.out.println("Enter array elements");
		int i;
		for (i = 0; i < array.length; i++) 
		{
			array[i] = input.nextInt();
		}
		
		System.out.println("Before sorting array elements are");
		displayArray(array);
		
		sort(array);
		
		System.out.println("After sorting array elements are");
		displayArray(array);
	}

	static void sort(int arr[])
	{
		int i, j, t;

		for (i = 0; i < arr.length - 1; i++)
		{
			for (j = i + 1; j < arr.length; j++)
			{
				if (arr[i] > arr[j])
				{
					t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
	}

	static void displayArray(int arr[]) 
	{
		for (int val : arr) 
		{
			System.out.print(val + " ");	
		}
		System.out.println();
	}
}
