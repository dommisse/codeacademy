package com.allangray.PointOfSales;

//This class is a collection of InvoiceItems
//Currently it only has quantity as extra property

public class InvoiceRollup {
	private final InvoiceItem invoiceItem;
	private int quantity;
	
	public InvoiceRollup(int q,InvoiceItem i){
		invoiceItem = i;
		quantity = q;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public InvoiceItem getInvoiceItem() {
		return invoiceItem;
	}

		
	
	
	
}
