package domain;

import java.util.ArrayList;
import java.util.List;

public class LedgerList {
	private final List<Double> ledgerList;

	public LedgerList() {
		ledgerList = new ArrayList<>();
	}

	public void add(double transaction) {
		ledgerList.add(transaction);
	}

	public List<Double> getList() {
		return ledgerList;
	}
}
