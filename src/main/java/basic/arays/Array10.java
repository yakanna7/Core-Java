//Java program to copy all elements of an array to another array
package basic.arays;

import java.util.Scanner;

class Array10
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter size of array");
		int size = s.nextInt();
		int originalArray[] = new int[size];
		
		System.out.println("Enter array elements");
		int i;
		for (i = 0; i < size; i++)
		{
			originalArray[i] = s.nextInt();
		}
		
		//Creating array with same size as original array
		int copiedArray[] = new int[originalArray.length];
		
		//coping elements from original to copied array
		for (i = 0; i < originalArray.length; i++)
		{
			copiedArray[i] = originalArray[i];
		}
		
		System.out.println("Original array elements are");
		for (i = 0; i < originalArray.length; i++)
		{
			System.out.print(originalArray[i]+" ");
		}
		
		System.out.println("\nCopied array elements are");
		for (i = 0; i < copiedArray.length; i++)
		{
			System.out.print(copiedArray[i]+" ");
		}
	}
}
