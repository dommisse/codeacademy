package com.allangray.PointOfSales;

import java.math.BigDecimal;

//Single Invoice Item -> same concept as a product

public class InvoiceItem {
	
	private int productId;
	private double unitPrice;
	private String description;
	private double vat;
	
	public double getVat() {
		return vat;
	}

	public void setVat(double vat) {
		this.vat = vat;
	}

	public String toString(){
		return productId + " " + unitPrice + description;
	}
	
	public InvoiceItem(int _productId,double _unitPrice,String _description){
		productId = _productId;
		unitPrice = _unitPrice;
		description = _description;
		vat = unitPrice * 0.14;
	}
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

	
}
