//Java program to implement Explicit or User defined default constructor
package oops.constructors;

import java.util.Date;

class SIM {

	private String network;
	private long number;
	private float balance;
	private Date activatedDate;

	public SIM() {
		network = "Idea";
		activatedDate = new Date();
		balance = 50.0f;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = this.balance + balance;
	}

	public Date getActivatedDate() {
		return activatedDate;
	}

	public static void main(String args[])
	{
		SIM sim = new SIM();

		sim.setNumber(9573638397L);

		System.out.println("Network: " + sim.getNetwork());
		System.out.println("Number: " + sim.getNumber());
		System.out.println("Balance: " + sim.getBalance());
		System.out.println("Activated Date: " + sim.getActivatedDate());
	}
}
