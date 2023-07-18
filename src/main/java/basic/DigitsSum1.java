/*18.Java program to find sum of individual digits of a given four number
 Access digits from left to right Example: 2795-> 2+7+9+5 = 23
 */
package basic;

import java.util.Scanner;

class DigitsSum1 
{
	public static void main(String[] args)
	{
		int num, digit, sum;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter any four digit number");
		num = s.nextInt(); // 2795

		digit = num / 1000; // 2795/1000 =2
		sum = digit; // 2;
		num = num % 1000; // 2795%1000 = 795

		digit = num / 100; // 795/100 = 7
		sum = sum + digit; // 2+7 = 9
		num = num % 100; // 795%100 = 95

		digit = num / 10; // 95/10 = 9
		sum = sum + digit; // 9+9 = 18
		num = num % 10; // 95%10 = 5
		sum = sum + num; // 18+5 = 23

		System.out.println("Sum of all digits is " + sum);
	}
}
