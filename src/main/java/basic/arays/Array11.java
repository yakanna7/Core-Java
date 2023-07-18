//Java program to find reverse array of a given array
package basic.arays;

import java.util.Scanner;

class Array11 
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
		int reverseArray[] = new int[originalArray.length];
		
		int k=0;
		//coping elements from original to reverse array
		for (int j= originalArray.length-1;  j>=0; j--)
		{
			reverseArray[k] = originalArray[j];
			k++;
		}
		
		System.out.println("Original array elements are");
		for (i = 0; i < originalArray.length; i++)
		{
			System.out.print(originalArray[i]+" ");
		}
		
		System.out.println("\nReverse array elements are");
		for (i = 0; i < reverseArray.length; i++)
		{
			System.out.print(reverseArray[i]+" ");
		}
	}
}

