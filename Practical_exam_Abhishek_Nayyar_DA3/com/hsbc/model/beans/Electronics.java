package com.hsbc.model.beans;

public class Electronics {
	private int itemCode;
	private String itemName;
	private double unitPrice;
	private int warranty;
	private long quantity;
	
	public Electronics() {
		super();
	}
	
	public int getItemCode() {
		return itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public int getWarranty() {
		return warranty;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Electronics [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice
				+ ", warranty=" + warranty + ", quantity=" + quantity + "]";
	}
	
	
}
