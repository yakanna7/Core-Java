//Java program to implement continue statement
package basic.loops.jumping;

class ContinueStatement1 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 10; i++)
		{
			if (i == 5 || i==8)
			{
				continue;
			}

			System.out.println(i);
		}
	}
}
