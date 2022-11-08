package domain;

public class BankAccount {
	private double balance;
	private String firstName;
	private String lastname;

	public BankAccount(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastname = lastName;
		balance=0;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
