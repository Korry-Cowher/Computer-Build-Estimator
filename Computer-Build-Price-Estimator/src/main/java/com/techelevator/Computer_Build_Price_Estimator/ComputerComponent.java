package com.techelevator.Computer_Build_Price_Estimator;

public abstract class ComputerComponent {
	private int tier;
	
	public ComputerComponent(String tier) { //Constructor asks for tier of part 
		this.tier = Integer.parseInt(tier);
	}
	
	public int getTier() { //allows user to access set tier
		return this.tier;
	}
	
	public abstract String getType();
	
	public abstract double getPrice();
	
	//public long getPrice(long baseCost , String tier) { 
	//	long multiplier = 1;
	//	long tierNumber = Long.parseLong(tier);
	//	if(tierNumber == 2) {
	//		multiplier = 2;
	//	} else if ( tierNumber == 3) {
	//		multiplier = 3;
	//	}
	//	return baseCost * multiplier;
	//  }	
}
