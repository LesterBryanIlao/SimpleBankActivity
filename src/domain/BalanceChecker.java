package domain;

import java.util.List;

public class BalanceChecker {
    private Statement statement;

    public BalanceChecker(Statement statement) {
        this.statement = statement;
    }

    public double getBalance() {
        double balance = 0;
        List<Double> tempList = statement.getLedgerList().getList();

        if (tempList.isEmpty() || tempList == null)
            return 0;
        for (double amount : tempList) {
            balance += amount;
        }
        return balance;
    }
}
