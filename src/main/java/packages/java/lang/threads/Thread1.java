// Java example program to create thread by extending Thread class
package packages.java.lang.threads;

class Thread1 extends Thread
{
	public void run() 
	{
		for (int i = 1; i <= 10; i++)
		{
			System.out.println(i);
		}
	}

	public static void main(String args[])
	{
		Thread1 t = new Thread1();
		t.start();
	}
}
