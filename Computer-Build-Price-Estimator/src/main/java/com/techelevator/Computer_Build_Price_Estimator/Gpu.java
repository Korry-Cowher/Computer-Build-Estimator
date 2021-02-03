package com.techelevator.Computer_Build_Price_Estimator;

public class Gpu extends ComputerComponent {
	private String type = "GPU";
	private double basePrice = 200.00;
	
	public Gpu(String tier) {
		super(tier);
	}
	
	public double getBasePrice() {
		return this.basePrice;
	}

	@Override
	public String getType() {
		return type;
	}

	
	@Override
	public double getPrice(int tierInput) {
		if(tierInput == 2) {
			return basePrice * 2;
		} else if(tierInput == 3) {
			return basePrice * 4;
		} return basePrice;
	}

	@Override
	public String getOptions() {
		return "\nGPU\n\n[1]Tier 1: " + getBasePrice() + "\n[2]Tier 2: " + getPrice(2) + "\n[3]Tier 3: " + getPrice(3); 
	}
}
