package com.techelevator.Computer_Build_Price_Estimator;
import org.junit.Assert; 
import org.junit.Test;

public class CpuTest {
	
	@Test
	public void getPrice_returns_basePrice_for_tier1() {
		//Arrange
		Cpu cpu = new Cpu("1");
		
		//Act
		double price = cpu.getPrice();
		
		//Assert
		Assert.assertEquals(150, price, .2);
	}
	
	@Test
	public void getPrice_returns_correctPrice_for_tier2() {
		//Arrange
		Cpu cpu = new Cpu("2");
		
		//Act
		double price = cpu.getPrice();
		
		//Assert
		Assert.assertEquals(225, price, .2);
	}
	
	@Test
	public void getPrice_returns_correctPrice_for_tier3() {
		//Arrange
		Cpu cpu = new Cpu("3");
		
		//Act
		double price = cpu.getPrice();
		
		//Assert
		Assert.assertEquals(300, price, .2);
	}

}
