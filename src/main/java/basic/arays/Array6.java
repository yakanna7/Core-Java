//Java program to display array element at a given index
package basic.arays;

import java.util.Scanner;

class Array6
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter size of array");
		int size = input.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter array elements");
		int i;
		for (i = 0; i < size; i++)
		{
			arr[i] = input.nextInt();
		}

		System.out.println("Enter index number to display element");
		int index = input.nextInt();

		if (index >= 0 && index < size)
		{
			System.out.println("Element at index " + index + " is "+ arr[index]);
		} 
		else
		{
			System.out.println("Invalid index number entered");
		}
	}
}
