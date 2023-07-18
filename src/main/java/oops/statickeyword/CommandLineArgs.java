//Java program to implement command line arguments
package oops.statickeyword;

class CommandLineArgs {

	public static void main(String args[])
	{
		if (args.length != 0) 
		{
			System.out.println("Command line argiments are");
			for (int i = 0; i < args.length; i++) 
			{
				System.out.println(args[i]);
			}
		} 
		else 
		{
			System.out.println("No commandline arguments passed");
		}
	}
}
