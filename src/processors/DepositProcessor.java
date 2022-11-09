package processors;

import domain.BankAccount;
import domain.Deposit;
import util.LedgerCsvWriter;
import util.Validators;

public class DepositProcessor {
	private Deposit deposit;
	private BankAccount bankAccount;
	private LedgerCsvWriter ledgerCsvWriter;

	public DepositProcessor() {

	}

	public DepositProcessor(Deposit deposit, BankAccount bankAccount) {
		this.deposit = deposit;
		this.bankAccount = bankAccount;
	}

	public void process() {
		if (Validators.isValidDeposit(bankAccount.getBalance(), deposit.getAmount())) {
			ledgerCsvWriter = new LedgerCsvWriter();
			ledgerCsvWriter.write(deposit.stringRecord());
			bankAccount.setBalance(bankAccount.getBalance() + deposit.getAmount());
			System.out.println("Transaction Successful!!!\n");
		} else {
			System.out.println("Transaction Failure!!!\n");
		}
	}
}
