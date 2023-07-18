//Java program to find second maximum element of an array
package basic.arays;

import java.util.Scanner;

class Array5 
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

		int firstMax, secondMax;
		firstMax= secondMax = arr[0];

		for (i = 1; i < arr.length; i++) 
		{
			if (arr[i] > firstMax )
			{
				secondMax = firstMax;
				firstMax = arr[i];	
			}
			else if (arr[i]> secondMax)
			{
				secondMax = arr[i];
			}
		}

		System.out.println("First Maximum element is " + firstMax);
		System.out.println("Second Maximum element is " + secondMax);
	}
}
