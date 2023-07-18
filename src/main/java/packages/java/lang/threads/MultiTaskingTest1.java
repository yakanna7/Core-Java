//Performing single task by multiple threads by extending Thread class
package packages.java.lang.threads;

class MultiTaskingTest1 extends Thread
{
	public void run()
	{
		System.out.println("task one");
	}

	public static void main(String args[])
	{
		MultiTaskingTest1 t1 = new MultiTaskingTest1();
		MultiTaskingTest1 t2 = new MultiTaskingTest1();
		MultiTaskingTest1 t3 = new MultiTaskingTest1();

		t1.start();
		t2.start();
		t3.start();
	}
}
