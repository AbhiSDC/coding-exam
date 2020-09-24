package com.hsbc.model.beans;

public class Apparel {
	private int itemCode;
	private String itemName;
	private double unitPrice;
	private String size;
	private String material;
	private long quantity;
	
	
	public Apparel() {
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
	public String getSize() {
		return size;
	}
	public String getMaterial() {
		return material;
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
	public void setSize(String size) {
		this.size = size;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Apparel [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice + ", size="
				+ size + ", material=" + material + ", quantity=" + quantity + "]";
	}
	
}
