/*Java program to search element of an array using binary search 
 Note: Binary search is possible only when array elements are in sorting order.
 */
package basic.arays;

import java.util.Scanner;

class Array8 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter size of array");
		int size = s.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter array elements in ascending order only");
		int i;
		for (i = 0; i < size; i++)
		{
			arr[i] = s.nextInt();
		}
		
		System.out.println("Enter element to search");
		int element = s.nextInt();
		
		int low=0, mid=0, high=size-1;
		
		while(low<=high)
		{
			mid = (low+high)/2;
			
			if(arr[mid]==element)
			{
				break;
			}
			else if(arr[mid]<element)
			{
				low = mid+1;
			}
			else
			{
				high = mid-1;
			}
		}
		
		if(low<=high)
		{
			System.out.println("Element was found at index "+mid);
		}
		else
		{
			System.out.println("Element was not found");
		}
   }
}
