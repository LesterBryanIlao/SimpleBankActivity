package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import domain.LedgerList;

public class LedgerCsvReader {
	private File csvFile;
	public LedgerList ledgerList;

	public LedgerCsvReader() {
	}

	public LedgerCsvReader(String fileName) {
		csvFile = new File(fileName);
	}

	public LedgerList read() {
		FileReader fileReader = null;
		BufferedReader reader = null;
		ledgerList = new LedgerList();
		try {
			fileReader = new FileReader(csvFile);
			reader = new BufferedReader(fileReader);

			String line = null;
			while ((line = reader.readLine()) != null) {
				ledgerList.add(Double.parseDouble(line));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return ledgerList;
	}
}
