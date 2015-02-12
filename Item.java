package com.spconger.GroceryStore;

public abstract class Item {
	/**
	 * This is an abstract class that stores the
	 * content of all items
	 * it contains fields and gets and sets
	 * as an abstract class it can't be 
	 * instantiated, only its children can
	 */
	private int sku;
	private String name;
	private double price;
	private String pricingUnit;
	private String category;
	
	public int getSku() {
		return sku;
	}
	public void setSku(int sku) {
		this.sku = sku;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPricingUnit() {
		return pricingUnit;
	}
	public void setPricingUnit(String pricingUnit) {
		this.pricingUnit = pricingUnit;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

}
