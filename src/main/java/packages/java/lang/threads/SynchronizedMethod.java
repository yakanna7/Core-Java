// Example of synchronized method or Object Level Lock
package packages.java.lang.threads;

class JointAccount implements Runnable 
{
	double balance;

	JointAccount(double balance)
	{
		this.balance = balance;
	}

	public void run() 
	{
		withdraw();
	}

	public synchronized void withdraw() 
	{
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+" withdrawing money\n");
		try
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		balance = balance - 1000;
		System.out.println("After " +t.getName()+"  withdwing\n");
		System.out.println("Available balance is " + balance + "\n");
	}
}

class SynchronizedMethod
{
	public static void main(String args[])
	{
		JointAccount ja = new JointAccount(3000);// only one object
		Thread t1 = new Thread(ja, "person1");
		Thread t2 = new Thread(ja, "person2");
		Thread t3 = new Thread(ja, "person3");
		t1.start();
		t2.start();
		t3.start();
	}
}
