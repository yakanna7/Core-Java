/*Java program to implement different ways of initializing single
dimensional array*/

package basic.arays;

import java.util.Scanner;

class Array1 
{
	public static void main(String[] args)
	{
		int scores[] = { 10, 5, 7, 33, 9 };
		String courses[] = { "Java", ".Net", "PHP" };

		Scanner s = new Scanner(System.in);

		System.out.println("Enter size of array");
		int size = s.nextInt();
		int array[] = new int[size];

		System.out.println("Enter array elements");
		int i;
		for (i = 0; i < size; i++)
		{
			array[i] = s.nextInt();
		}

		System.out.println("Array elements are");

		for (i = 0; i < size; i++) 
		{
			System.out.println(array[i]);
		}
	}
}
