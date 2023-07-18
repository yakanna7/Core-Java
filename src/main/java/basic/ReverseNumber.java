//20.Java program to find reverse number of given five digit number

package basic;

import java.util.Scanner;

class ReverseNumber 
{
	public static void main(String[] args)
	{
		int num, rem, revNum;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter any five digit number");
		num = s.nextInt(); // 23549

		rem = num % 10; // 23549%10 = 9
		revNum = rem * 10000; // 9*10000 = 90000
		num = num / 10; // 23549/10 = 2354

		rem = num % 10; // 2354%10 = 4
		revNum = revNum + rem * 1000; // 90000+4*1000 = 94000
		num = num / 10; // 2354/10 = 235

		rem = num % 10; // 235%10 = 5
		revNum = revNum + rem * 100; // 94000+5*100 = 94500
		num = num / 10; // 235/10 = 23

		rem = num % 10; // 23%10 = 3
		revNum = revNum + rem * 10; // 94500+3*10 = 94530
		num = num / 10; // 23/10 = 2
		revNum = revNum + num; // 94530+2 = 94532

		System.out.println("Reverse Number is " + revNum);
	}
}
