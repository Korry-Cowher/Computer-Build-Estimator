package com.techelevator.Computer_Build_Price_Estimator;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner keyboardInput = new Scanner(System.in);

		System.out.println("Welcome to DK's Computer Build Price Estimator!"
				+ "\n************************************************\n\n" + "You will be given a choice of tier 1 "
				+ "to tier 3\n");

		Cpu cpu = new Cpu("1");
		System.out.println("\nPlease select a CPU tier [input 1, 2, or 3]\n" + cpu.getOptions());
		String cpuTierInput = keyboardInput.nextLine();

		cpu.setTier(cpuTierInput);
		ShoppingCart cart = new ShoppingCart();
		cart.getList().add(cpu);

		Gpu gpu = new Gpu("1");
		System.out.println("\nPlease select a GPU tier [input 1, 2, or 3]\n" + gpu.getOptions());
		String gpuTierInput = keyboardInput.nextLine();

		gpu.setTier(gpuTierInput);
		cart.getList().add(gpu);

		MotherBoard motherboard = new MotherBoard("1");
		System.out.println("\nPlease select a motherboard tier [input 1, 2, or 3]\n" + motherboard.getOptions());
		String motherboardTierInput = keyboardInput.nextLine();

		motherboard.setTier(motherboardTierInput);
		cart.getList().add(motherboard);

		System.out.println(
				"\n************************************************\nReceipt\n************************************************\n");
		System.out.println(cart.getReceipt(cart.getList()));

	}

}