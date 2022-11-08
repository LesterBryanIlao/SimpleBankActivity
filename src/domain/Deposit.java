package domain;

import java.util.Scanner;

import interfaces.Transact;

public class Deposit implements Transact {
    Scanner scan = new Scanner(System.in);
    private double amount;

    public Deposit() {
        System.out.print("Enter amount to deposit: ");
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
        return String.format("+%s\n", getAmount());
    }
}
