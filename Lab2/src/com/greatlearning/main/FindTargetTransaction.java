package com.greatlearning.main;

import java.util.Scanner;

public class FindTargetTransaction {
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the size of transaction array"); // Size is the no of transactions as per the output
																	// in the problem

		int size = sc.nextInt();

		int[] transactionsArray = new int[size];

		System.out.println("Enter the values of array"); // Values is the transactions that we are storing in an array

		for (int index = 0; index < size;) {
			int transaction = sc.nextInt();
			if (transaction > 0) {
				transactionsArray[index] = transaction;
				index++;
			}
		}
		System.out.println("Enter the total number of Targets that needs to be achieved");
		int noOfTargets = sc.nextInt();
		printNoOfTransactions(transactionsArray, noOfTargets);
		sc.close();

	}

	private static void printNoOfTransactions(int[] transactionsArray, int noOfTargets) {
		while (noOfTargets > 0) {
			int transactionsCount = getNumberOfTransactions(transactionsArray, noOfTargets);
			noOfTargets--;
			if (transactionsCount == -1) {
				System.out.println("Given target is not achived");
			} else {
				System.out.println("Target is achieved after :" + transactionsCount + " transactions");
			}

		}
	}

	private static int getNumberOfTransactions(int[] transactionsArray, int noOfTargets) {
		System.out.println("Enter the value of target");
		int target = sc.nextInt();

		int transactionsCount = 0;
		int sum = 0;

		do {
			sum = sum + transactionsArray[transactionsCount];
			transactionsCount++;
		} while (sum <= target && transactionsCount < transactionsArray.length);
		if (transactionsCount >= transactionsArray.length) {
			return -1;
		} else {
			return transactionsCount;
		}
	}

}
