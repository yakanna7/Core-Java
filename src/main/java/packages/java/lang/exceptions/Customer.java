package packages.java.lang.exceptions;

class Customer {
	private long accountNumber;
	private String name;
	private float balance;

	public Customer(long accountNumber, String name, float balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public void withdraw(int amount) {
		if (amount > balance) {
			throw new InsufficientBalanceException("No sufficient balance");
		} else {
			balance = balance - amount;
		}
	}
}
