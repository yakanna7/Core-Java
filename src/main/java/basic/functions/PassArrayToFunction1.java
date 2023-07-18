//Java program to implement a function to pass array as argument to a function
package basic.functions;

import java.util.Scanner;

class PassArrayToFunction1 
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
		
		displayArray(array);
	}

	public static void displayArray(int arr[])
	{
		System.out.println("Array elements are");
		for (int val : arr)
		{
			System.out.println(val);
		}
	}
}
