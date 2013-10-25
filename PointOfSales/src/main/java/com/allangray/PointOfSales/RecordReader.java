package com.allangray.PointOfSales;
//reads list of Invoices from file -> adds them to RollupList
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class RecordReader {

	private String fileName = "c:\\wip\\invoiceItems.txt";
	private static List<InvoiceItem> listOfInvoices = new ArrayList<InvoiceItem>();
	
	public List<InvoiceItem> getListOfInvoices() {
		return listOfInvoices;
	}

	public void setListOfInvoices(List<InvoiceItem> listOfInvoices) {
		this.listOfInvoices = listOfInvoices;
	}
	
	public void readRecords() throws IOException{
		 FileInputStream fstream = new FileInputStream(fileName);
		  // Get the object of DataInputStream
		  DataInputStream in = new DataInputStream(fstream);
		  BufferedReader br = new BufferedReader(new InputStreamReader(in));
		  String strLine;
		  boolean firstLine = true;
		  //Read File Line By Line
		  while ((strLine = br.readLine()) != null)   {
			  
			  if(firstLine){
				  firstLine = false;
				  continue;
			  }
			  
			  String[] lineSplit = strLine.split(",");
			  listOfInvoices.add(new InvoiceItem(Integer.parseInt(lineSplit[0]),
					  Double.parseDouble(lineSplit[1]),lineSplit[2]));
			  RollupList.addInvoiceItem(new InvoiceItem(Integer.parseInt(lineSplit[0]),
					  Double.parseDouble(lineSplit[1]),lineSplit[2]));
		  }
		  //Close the input stream
		  in.close();
	}

	public void printList(){
		for(InvoiceItem i : listOfInvoices){
			System.out.println(i.toString());
		}
		
	}
}
