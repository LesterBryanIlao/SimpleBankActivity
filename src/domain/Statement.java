package domain;

import util.CsvRenderer;
import util.LedgerCsvReader;

public class Statement {
	private String LEDGER_FILE = "C:\\Users\\ilale\\eclipse-workspace\\SimpleBank\\src\\files\\ledgerfile.csv";

    private static LedgerCsvReader ledgerCsvReader;
    private CsvRenderer csvRenderer;

    public Statement() {
        ledgerCsvReader = new LedgerCsvReader(LEDGER_FILE);
        csvRenderer = new CsvRenderer(ledgerCsvReader.read());
    }

    public void print() {
        csvRenderer.renderLedgerList();
    }

    public LedgerList getLedgerList() {
        return ledgerCsvReader.read();
    }

}
