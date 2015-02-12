package com.spconger.GroceryStore;

import java.util.ArrayList;

public class Progam {

	/** 
	 * this class tests the sales class
	 * by passing in three different items
	 * two bulk and one packaged
	 * then it returns the list, 
	 * the totals and the tax
	 * @param args
	 */
	public static void main(String[] args) {
		Sale s = new Sale();
		Bulk b = new Bulk();
		b.setBin(12345);
		b.setName("almonds");
		b.setWeight(2);
		b.setPrice(12.20);
		b.setPricingUnit("Pounds");
		s.add(b);
		Bulk b2 = new Bulk();
		b2.setBin(67890);
		b2.setName("Granola");
		b2.setPrice(4.50);
		b2.setPricingUnit("Pounds");
		s.add(b2);
		PrePackaged p = new PrePackaged();
		p.setPrice(45.90);
		p.setName("Wild Turkey");
		p.setSku(345324);
		p.setRestricted("Age");
		s.add(p);
		
		ArrayList<Item> lineItems=s.getItems();
		for(Item i : lineItems){
			System.out.println(i.getName() + " " + i.getPrice());
		}
		
		/*for (Item i: lineItems){
			if(i.getSku()==345324){
				s.remove(i);
			}
				
		}
		
		for(Item i : lineItems){
			System.out.println(i.getName() + " " + i.getPrice());
		}*/
		
		System.out.println("the Total before tax is " + s.GetTotalPrice());
		System.out.println("the  tax is " + s.calculateTax());
	}

}
