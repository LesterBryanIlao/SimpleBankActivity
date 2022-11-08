package domain;

import java.util.Scanner;
import interfaces.Transact;
import util.LedgerCsvWriter;

public class Withdraw implements Transact {
	Scanner scan = new Scanner(System.in);

	private double amount;

	public Withdraw() {
		System.out.print("Enter amount to withdraw: ");
		amount = scan.nextDouble();
	}

	@Override
	public void setAmount(double amount) {
		this.amount = amount;

	}

	@Override
	public double getAmount() {
		// TODO Auto-generated method stub
		return amount;
	}

	@Override
	public String stringRecord() {
		// TODO Auto-generated method stub
		return String.format("-%s\n", getAmount());
	}

}