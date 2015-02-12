package com.spconger.GroceryStore;

import java.util.ArrayList;

public class Sale implements ListOperations {
	/**
	 * this class implements ListOperations
	 * and so has add, edit and remove methods
	 * it stores a list of items
	 * you can always substitute a child
	 * for the parent so bulk can substitute 
	 * for Item, etc.
	 */
	private ArrayList<Item> basket = new ArrayList<Item>();
	
	//a constant
	private final double TAXPERCENT=.095;
	
	//loops through the list and adds the prices
	public double GetTotalPrice(){
		double total=0;
		//for each loop
		for(Item i:basket){
			total += i.getPrice();
		}
		return total;
	}
	
	//returns the arrayList
	public ArrayList<Item> getItems(){
		return basket;
	}
	
	//calculates the tax 
	public double calculateTax(){
		return GetTotalPrice() * TAXPERCENT;
	}

	@Override
	public void add(Item i) {
		//adds an item to the basket array list
		basket.add(i);
		
		
	}

	@Override
	public void edit(Item i) {
		//should edit the item by replacing
		//the one in the list with the one
		//passed in as a parameter
		for(Item it : basket){
			if(it.getSku()==i.getSku()){
				it=i;
			}
		}
		
	}

	@Override
	public void remove(Item i) {
		//should remove an item
		//--doesn't work currently--
		for(Item it : basket){
			if(it.getSku()==i.getSku()){
				basket.remove(basket.indexOf(it));
			}
		}
		
	}


}
