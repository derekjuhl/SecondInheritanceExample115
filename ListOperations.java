package com.spconger.GroceryStore;

public interface ListOperations {
	/**
	 * this is an interface
	 * it contains three abstract methods
	 * for managing lists
	 * Any class that implements this
	 * interface must give a body to these
	 * methods
	 * @param i
	 */
	void add(Item i);
	void edit(Item i);
	void remove(Item i);
}
