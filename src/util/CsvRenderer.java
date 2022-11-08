package util;

import domain.LedgerList;

public class CsvRenderer {
    public LedgerList ledgerList;
    
    public CsvRenderer(LedgerList ledgerList) {
        this.ledgerList = ledgerList;
    }
    
    public void renderLedgerList() {
        for (double amount : ledgerList.getList()) {
            if (amount > 0)
                System.out.println("+" + amount);
            else
                System.out.println(amount);
        }
    }

}
