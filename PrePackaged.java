package com.spconger.GroceryStore;

public class PrePackaged extends Item{
	/**
	 * This class also inherits from Item
	 * and adds restricted and expiration date
	 */
	private String restricted;
	private String expirationDate;
	
	public String getRestricted() {
		return restricted;
	}
	public void setRestricted(String restricted) {
		this.restricted = restricted;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	
	
}
