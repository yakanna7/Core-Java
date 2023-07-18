/*Java program to find array even elements sum, odd elements sum 
 and all elements sum.
 */

package basic.arays;

import java.util.Scanner;

class Array3 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter size of array");
		int size = s.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter array elements");
		int i;
		for (i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}

		int evenSum = 0, oddSum = 0;

		for (i = 0; i < arr.length; i++)
		{
			if (arr[i] % 2 == 0) 
			{
				evenSum = evenSum + arr[i];
			} 
			else 
			{
				oddSum = oddSum + arr[i];
			}
		}

		System.out.println("Sum of all even elements is " + evenSum);
		System.out.println("Sum of all odd elements is " + oddSum);
		System.out.println("Sum of all array elements is " + (evenSum + oddSum));
	}
}
