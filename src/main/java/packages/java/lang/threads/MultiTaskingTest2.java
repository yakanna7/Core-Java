// Performing single task by multiple threads by using Runnable interface
package packages.java.lang.threads;

class MultiTaskingTest2 implements Runnable
{
	public void run() 
	{
		System.out.println("task one");
	}

	public static void main(String args[]) 
	{
		Thread t1 = new Thread(new MultiTaskingTest2());// passing anonymous object												 
		Thread t2 = new Thread(new MultiTaskingTest2());

		t1.start();
		t2.start();
	}
}
