package App;

import java.util.Scanner;
import App.Service;

public class Driver {

	public static void main(String[] args) {
		int noOfTransactions = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		
		noOfTransactions = sc.nextInt();
		int transactionsAmounts[] = new int[noOfTransactions];
		
		System.out.println("Enter the values of array");
		for(int i = 0; i < transactionsAmounts.length; i++) {
			transactionsAmounts[i] = sc.nextInt();
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved");			
		Service Service = new Service();
		Service.targetAmount(transactionsAmounts);
	}

}
