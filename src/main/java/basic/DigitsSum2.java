/*19.Java program to find sum of individual digits of a given four number
 Access digits from right to left Example: 2795-> 5+9+7+2 = 23
 */
package basic;

import java.util.Scanner;

class DigitsSum2
{
	public static void main(String[] args)
	{
		int num, rem, sum;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter any four digit number");
		num = s.nextInt(); // 2795

		rem = num % 10; // 2795%10 = 5
		sum = rem; // 5
		num = num / 10; // 2795/10 = 279

		rem = num % 10; // 279%10 = 9
		sum = sum + rem; // 5+9 = 14
		num = num / 10; // 279/10 = 27

		rem = num % 10; // 27%10 = 7
		sum = sum + rem; // 14+7 = 21
		num = num / 10; // 27/10 = 2
		sum = sum + num; // 21+2

		System.out.println("Sum of all digits is " + sum);
	}
}
