//Java program to implement break statement
package basic.loops.jumping;

class BreakStatement1
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 10; i++) 
		{
			if (i == 5)
			{
				break;
			}
			
			System.out.println(i);
		}
	}
}
