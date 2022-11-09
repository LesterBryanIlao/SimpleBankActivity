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
		ledgerCsvWriter = new LedgerCsvWriter();
	}
	

	public WithdrawProcessor(Withdraw withdraw, BankAccount bankAccount) {
		this.withdraw = withdraw;
		this.bankAccount = bankAccount;
	}

	public void process() {
		if (Validators.isValidWithdraw(bankAccount.getBalance(), withdraw.getAmount())) {
			
			ledgerCsvWriter.write(withdraw.stringRecord());
			bankAccount.setBalance(bankAccount.getBalance() - withdraw.getAmount());
			System.out.println("Transaction Successful!!!\n");
		} else {
			System.out.println("Transaction Failure!!!\n");
		}
	}
}
