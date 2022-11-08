package util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LedgerCsvWriter {
	private String LEDGER_FILE = "C:\\Users\\ilale\\eclipse-workspace\\SimpleBank\\src\\files\\ledgerfile.csv";
	PrintWriter out;
	FileWriter fileWriter;
	String toAppend;

	public LedgerCsvWriter() {
	}

	public LedgerCsvWriter(String toAppend) {
		this.toAppend = toAppend;
	}

	public void write(String toAppend) {
		try {
			fileWriter = new FileWriter(LEDGER_FILE, true);
			out = new PrintWriter(fileWriter);
			out.append(toAppend);
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
