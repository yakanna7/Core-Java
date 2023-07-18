//Java program to implement variable arguments
package basic.functions;

class VariableArguments
{
	static int getMaxValue(int... values)
	{
		int max = values[0];
		
		for (int i = 1; i < values.length; i++) 
		{
			if (max < values[i])
			{
				max = values[i];
			}
		}
		
		return max;
	}

	public static void main(String[] args)
	{

		System.out.println("Maximum of two numbers " + getMaxValue(4, 3));
		System.out.println("Maximum  of three numbers " + getMaxValue(10, 50, 40));
		System.out.println("Maximum  of five numbers "
				+ getMaxValue(100, 40, 300, 301, 50));
		
		
 
	}
}



   