package com.currency.driver;

import java.util.Scanner;

import com.currency.services.MergeSort;
import com.currency.services.NotesCount;

public class CurrencyDenomination {
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		int sizeOfCurrency = sc.nextInt();
		int denominations[] = new int[sizeOfCurrency];
		System.out.println("Enter the currency denominations value");
		for (int i = 0; i < sizeOfCurrency; i++) {
			denominations[i] = sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		int amountPayable = sc.nextInt();
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(denominations, 0, denominations.length - 1);
		NotesCount notesCount = new NotesCount();
		notesCount.denominationCount(denominations, amountPayable);
		sc.close();
	}

}
