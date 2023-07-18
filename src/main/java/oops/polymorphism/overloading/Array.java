//Java program to implement arrays class overloaded methods
package oops.polymorphism.overloading;
import java.util.Arrays;

class Array {
	
	public static void display(int a[])
	{
		System.out.println("Array elements are");
		for(int i :a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void main(String args[])
	{
		int a[]={5,2,6,3,1};
		int b[]={5,4,3,2,1};
		
		System.out.println("Befor sorting");
		display(a);
		Arrays.sort(a);
		System.out.println("After sorting");
		display(a);
		
		System.out.println("Befor applying range sort");
		display(b);
		Arrays.sort(b,0,2);
		System.out.println("After applying range sort");
	    display(b);	
	}
}
