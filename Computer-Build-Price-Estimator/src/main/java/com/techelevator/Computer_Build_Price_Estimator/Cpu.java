package com.techelevator.Computer_Build_Price_Estimator;

public class Cpu extends ComputerComponent{
	private String type = "CPU";
	private double basePrice = 150.00;
	
	public Cpu(String tier) {
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
			return basePrice * 2;
		} return basePrice;
	}

}
