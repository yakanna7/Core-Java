package oops.thiskeyword;

import java.util.Date;

class SIM {

	private String network;
	private long number;
	private float balance;
	private Date activatedDate;

	private SIM() {
		activatedDate = new Date();
		balance = 50.0f;
	}

	public SIM(String network, long number) {
		this();// calls default constructor
		this.network = network;
		this.number = number;
	}

	public SIM(String network, long number, float balance) {
		this(network, number); // calls two arguments constructor
		this.balance = balance;
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

	public static void main(String args[]) {
		SIM sim1 = new SIM("Aritel", 9573638397L);
		SIM sim2 = new SIM("Idea", 9573638377L, 10);

		System.out.println("sim1 details are");
		System.out.println("Network: " + sim1.getNetwork());
		System.out.println("Number: " + sim1.getNumber());
		System.out.println("Balance: " + sim1.getBalance());
		System.out.println("Activated Date: " + sim1.getActivatedDate());

		System.out.println("\nsim2 details are");
		System.out.println("Network: " + sim2.getNetwork());
		System.out.println("Number: " + sim2.getNumber());
		System.out.println("Balance: " + sim2.getBalance());
		System.out.println("Activated Date: " + sim2.getActivatedDate());
	}
}
