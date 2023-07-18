//Java program to find maximum and minimum elements of an array
package basic.arays;

import java.util.Scanner;

class Array4 
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

		int min, max;
		min = max = arr[0];

		for (i = 1; i < arr.length; i++)
		{
			if (arr[i] > max) 
			{
				max = arr[i];
			}

			if (arr[i] < min)
			{
				min = arr[i];
			}
		}

		System.out.println("Maximum element is " + max);
		System.out.println("Minimum element is " + min);
	}
}
