package com.spconger.GroceryStore;

public class Bulk extends Item {

	/** 
	 * this is a class that inherits
	 * from ITem it adds weight and bin
	 */
			
	private double weight;
	private int bin;

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getBin() {
		return bin;
	}

	public void setBin(int bin) {
		this.bin = bin;
	}
	
}
