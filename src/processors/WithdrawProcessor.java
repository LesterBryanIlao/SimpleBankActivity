package processors;

import domain.BankAccount;
import domain.Withdraw;
import util.LedgerCsvWriter;
import util.Validators;

public class WithdrawProcessor {
	private Withdraw withdraw;
	private BankAccount bankAccount;
	private LedgerCsvWriter ledgerCsvWriter;

	public WithdrawProcessor() {

	}

	public WithdrawProcessor(Withdraw withdraw, BankAccount bankAccount, LedgerCsvWriter ledgerCsvWriter) {
		this.withdraw = withdraw;
		this.bankAccount = bankAccount;
		this.ledgerCsvWriter = ledgerCsvWriter;
	}

	public void process() {
		if (Validators.isValidDeposit(bankAccount.getBalance(), withdraw.getAmount())) {
			ledgerCsvWriter.write(withdraw.stringRecord());
			bankAccount.setBalance(bankAccount.getBalance() - withdraw.getAmount());
			System.out.println("Transaction Successful!!!\n");
		} else {
			System.out.println("Transaction Failure!!!\n");
		}
	}
}
