// Java program to implement for each loop
package basic.arays;

import java.util.Scanner;

class ForEachLoop 
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

		System.out.println("Array elements are");
		for (int value : arr) 
		{
			System.out.println(value);
		}
	}
}