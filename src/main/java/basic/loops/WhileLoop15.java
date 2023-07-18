//Java program to display all ASCII values and their character symbols

package basic.loops;

class WhileLoop15 
{
	public static void main(String args[])
	{
		int i=0;
		while(i<=255)
		{
			System.out.println(i+"   "+((char)i));
			i++;
		}
	}
}
