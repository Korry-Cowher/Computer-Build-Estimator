package com.techelevator.Computer_Build_Price_Estimator;

public class MotherBoard extends ComputerComponent{
	
	private String type = "MotherBoard";
	private double basePrice = 100.00;
	
	public MotherBoard(String tier) {
		super(tier);
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public double getPrice() {
		if(getTier() == 2) {
			return basePrice * 1.5;
		} else if(getTier() == 3) {
			return basePrice * 2.5;
		} return basePrice;
	}

}
