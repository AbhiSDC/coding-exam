//Author: Abhishek Nayyar
//Purpose: This is the Food Items Class

package com.hsbc.model.beans;

import java.time.LocalDate;

public class FoodItems {
	private int itemCode;
	private String itemName;
	private double unitPrice;
	private LocalDate dateOfManufacture;
	private LocalDate dateOfExpiry;
	private String veg;
	private long quantity;
	
	public FoodItems() {
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
	
	public LocalDate getDateOfManufacture() {
		return dateOfManufacture;
	}
	
	public LocalDate getDateOfExpiry() {
		return dateOfExpiry;
	}
	
	public String getVeg() {
		return veg;
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
	
	public void setDateOfManufacture(LocalDate dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}
	
	public void setDateOfExpiry(LocalDate dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
	
	public void setVeg(String veg) {
		this.veg = veg;
	}
	
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "FoodItems [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice
				+ ", dateOfManufacture=" + dateOfManufacture + ", dateOfExpiry=" + dateOfExpiry + ", veg=" + veg
				+ ", quantity=" + quantity + "]";
	}
	
	
}
