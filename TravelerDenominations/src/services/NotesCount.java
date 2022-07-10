package com.currency.services;

public class NotesCount {
	public void denominationCount(int denominations[], int amountPayable) {
		int[] noteCounter = new int[denominations.length];
		try {
			for (int i = 0; i < denominations.length; i++) {
				if (amountPayable >= denominations[i]) {
					noteCounter[i] = amountPayable / denominations[i];
					amountPayable = amountPayable - noteCounter[i] * denominations[i];
				}
			}
			if (amountPayable > 0) {
				System.out.println("exact amount can not be given wih the heighest denominations");
			} else {
				System.out.println("Your payment approach in order to give min number of notes will be");
				for (int i = 0; i < denominations.length; i++) {
					if (noteCounter[i] != 0) {
						System.out.println(denominations[i] + ":" + noteCounter[i]);
					}
				}
			}

		} catch (ArithmeticException e) {
			System.out.println("Please recheck your inputs");
		}
	}
}
