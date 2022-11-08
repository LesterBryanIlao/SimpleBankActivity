package domain;

import java.util.*;

import processors.DepositProcessor;
import processors.WithdrawProcessor;
import util.LedgerCsvWriter;
import util.MenuOptions;
import util.Validators;

public class SimpleBankTester extends MenuOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		BankAccount bankAccount = new BankAccount("John", "Doe");

		LedgerCsvWriter ledgerCsvWriter = new LedgerCsvWriter();
		Statement statement = new Statement();
		BalanceChecker balanceChecker = new BalanceChecker(statement);
		WithdrawProcessor withdrawProcessor;
		DepositProcessor depositProcessor;

		int choice;

		do {
			MenuOptions.print();
			choice = scan.nextInt();

			if (choice == 1 || choice == 2) {
				
				if (choice == 1) {
					Deposit deposit = new Deposit();
					depositProcessor = new DepositProcessor(deposit, bankAccount, ledgerCsvWriter);
					depositProcessor.process();
					
				} else {
					Withdraw withdraw = new Withdraw();
					withdrawProcessor = new WithdrawProcessor(withdraw, bankAccount, ledgerCsvWriter);
					withdrawProcessor.process();
				}
				
			} else if (choice == 3) {
				System.out.println("Balance Statement:");
				
				if (statement.getLedgerList().getList().isEmpty()) {
					System.out.println("No recorded transaction.");
				} else
					statement.print();
				
			} else if (choice == 4) {
				System.out.println(String.format("Your balance is: %.6f", balanceChecker.getBalance()));
				
			} else if (choice == 5) {
				System.out.println("Thank you for using SimpleBank.");
				break;
				
			} else
				System.out.println("Invalid option.");

			bankAccount.setBalance(balanceChecker.getBalance());
		} while (Validators.isValidMenu(choice));

	}

}
