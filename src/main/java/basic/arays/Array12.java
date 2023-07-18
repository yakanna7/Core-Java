//Java program to find frequency of each element in an array
package basic.arays;

import java.util.Scanner;

class Array12 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter size of array");
		int size = s.nextInt();
		int arr[] = new int[size];
		int freqArr[] = new int[size];

		System.out.println("Enter array elements");
		int i;
		for (i = 0; i < size; i++)
		{
			arr[i] = s.nextInt();
			freqArr[i] = -1;
		}

		int j, count;
		for (i = 0; i < size; i++)
		{
			count = 1;
			for (j = i + 1; j < size; j++)
			{
				if (arr[i] == arr[j])
				{
					count++;
					freqArr[j] = 0;
				}
			}

			if (freqArr[i] != 0)
			{
				freqArr[i] = count;
			}
		}

		System.out.println("Frequency of all elements of array");

		for (i = 0; i < size; i++)
		{
			if (freqArr[i] != 0)
			{
				System.out.println(arr[i] + " occurs " + freqArr[i] + " times");
			}
		}
	}
}
