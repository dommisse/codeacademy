package com.allangray.PointOfSales;

import java.io.IOException;

public class Runner {

	/*
	 * Pre - need your invoice file in following directory
	 * private String fileName = "c:\\wip\\invoiceItems.txt";
	 * 
	 */
	public static void main(String[] args) {
		RecordReader recordReader = new RecordReader();
		try {
			recordReader.readRecords();
			Printer.printList(RollupList.getRollupList());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
