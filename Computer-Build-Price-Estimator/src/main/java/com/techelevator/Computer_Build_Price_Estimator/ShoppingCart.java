package com.techelevator.Computer_Build_Price_Estimator;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<ComputerComponent> finalList = new ArrayList<>();
	
	public List<ComputerComponent> getList(){
		return this.finalList;
	}
	
	public double getFinalPrice() {
		double total = 0;
		for(ComputerComponent component : finalList) {
			total += component.getPrice(component.getTier());
		}
		return total;
	}
	
	public String getReceipt(List<ComputerComponent> receiptList) {
		String printReceipt = "";
		for(ComputerComponent item : receiptList) {
			printReceipt+= item.getType() + " : $" + item.getPrice(item.getTier()) + "\n";	
		} printReceipt = printReceipt + "Total : $" + getFinalPrice();
		return printReceipt;
	}

}
