//Java program to search element of an array using linear search 
package basic.arays;

import java.util.Scanner;

class Array7
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

		System.out.println("Enter element to search");
		int element = s.nextInt();

		int index = -1;

		for (i = 0; i < arr.length; i++)
		{
			if (arr[i] == element)
			{
				index = i;
				break;
			}
		}

		if (index != -1)
		{
			System.out.println("Element was found at index " + index);
		} 
		else
		{
			System.out.println("Element was not found");
		}
	}
}
