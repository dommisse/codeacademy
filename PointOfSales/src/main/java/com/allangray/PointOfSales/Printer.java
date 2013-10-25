package com.allangray.PointOfSales;

import java.util.List;
import java.util.Map;

public class Printer {
	
	public static void printList(Map<Integer, InvoiceRollup> l){
		InvoiceRollup invoiceRollup;
		System.out.println("Product Id\tUnit Price\tQuantity\tVat\t\tTotal\t\tDescription");
		double invoiceTotal = 0.0;
		for(Integer i : l.keySet()){
			invoiceRollup = l.get(i);
			double totalVat = invoiceRollup.getInvoiceItem().getVat() * invoiceRollup.getQuantity();
			double total = (double) (invoiceRollup.getInvoiceItem().getUnitPrice() * invoiceRollup.getQuantity()) +totalVat ;
			
			invoiceTotal = invoiceTotal + total;
			System.out.print(invoiceRollup.getInvoiceItem().getProductId() + "\t\t");
			System.out.print(invoiceRollup.getInvoiceItem().getUnitPrice() + "\t\t");
			System.out.print(invoiceRollup.getQuantity() + "\t\t");
			System.out.printf("%.2f", totalVat);System.out.print("\t\t");
			System.out.printf("%.2f" ,total); System.out.print("\t\t");
			System.out.print(invoiceRollup.getInvoiceItem().getDescription() +"\n");
		}
		System.out.println("-----------------------------------------------------------------------------------------------");
		System.out.print("TOTAL\t\t\t\t\t\t\t\t"); System.out.printf("%.2f",invoiceTotal);
	}
	
}
