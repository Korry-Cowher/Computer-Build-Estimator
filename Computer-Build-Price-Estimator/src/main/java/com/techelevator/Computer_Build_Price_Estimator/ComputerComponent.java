package com.techelevator.Computer_Build_Price_Estimator;

public class ComputerComponent {
	private String  type;
	private String  tier;
	
	public ComputerComponent(String type, String tier) {
		this.type = type; 
		this.tier = tier;
	}
	
	public String getType() {
		return this.type;
	}
	
	public String getTier() {
		return this.tier;
	}
	
	public long getPrice(long baseCost , String tier) {
		long multiplier = 1;
		long tierNumber = Long.parseLong(tier);
		if(tierNumber == 2) {
			multiplier = 2;
		} else if ( tierNumber == 3) {
			multiplier = 3;
		}
		return baseCost * multiplier;
	}
	
	
	
	
}
