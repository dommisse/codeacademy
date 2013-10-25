package com.allangray.PointOfSales;

//manages the list of InvoiceRollup items
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RollupList {
	
	private static Map<Integer, InvoiceRollup> rollupList = new HashMap<Integer,InvoiceRollup>();
	
	public static Map<Integer, InvoiceRollup> getRollupList() {
		return rollupList;
	}

	public static void addInvoiceItem(InvoiceItem i){
		
			if(rollupList.containsKey(i.getProductId())){
				//get it and increase quantity
				InvoiceRollup invoiceRollup = rollupList.get(i.getProductId());
				invoiceRollup.setQuantity(invoiceRollup.getQuantity() +1);
				rollupList.put(i.getProductId(), invoiceRollup);
			}
			else
				rollupList.put(i.getProductId(),new InvoiceRollup(1,i));
		
			
		
	}

}
