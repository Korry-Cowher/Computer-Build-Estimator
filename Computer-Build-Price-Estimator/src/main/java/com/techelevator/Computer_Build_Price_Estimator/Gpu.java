package com.techelevator.Computer_Build_Price_Estimator;

public class Gpu extends ComputerComponent {
	private String type = "GPU";
	private double basePrice = 200.00;
	
	public Gpu(String tier) {
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
