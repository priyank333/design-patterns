package structural.chainforresp;

import java.util.Scanner;

public class AtmDispenseChain {
	
	private DispenseChain d1;
	private static Scanner input;
	
	public AtmDispenseChain() {
		this.d1 = new Dollar50Dispenser();
		DispenseChain d2 = new Dollar20Dispenser();
		DispenseChain d3 = new Dollar10Dispenser();
		d1.setNextChain(d2);
		d2.setNextChain(d3);
	}

	
	public static void main(String[] args) {
		AtmDispenseChain atmDispenseChain = new AtmDispenseChain();
		
		while (true) {
			int amount = 0;
			System.out.println("Enter amount to dispense");
			input = new Scanner(System.in);
			amount = input.nextInt();
			if (amount % 10 != 0) {
				System.out.println("Amount should be in multiple of 10s.");
				return;
			}
			// process the request
			atmDispenseChain.d1.dispense(new Currency(amount));
		}
	}
}
