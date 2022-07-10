package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.sorting.MergeSort;

public class TravellingProblem {
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the size of currency denominations");
		int noOfDenominations = sc.nextInt();
		System.out.println("Enter the currency denominations value");
		int[] denominationsArray = new int[noOfDenominations];
		for (int index = 0; index < noOfDenominations;) {
			int denomination = sc.nextInt();
			if (denomination != 0) {
				denominationsArray[index] = denomination;
				index++;
			}
		}
		MergeSort mergeSort = new MergeSort();
		mergeSort.mergeSort(denominationsArray, 0, denominationsArray.length - 1);

		System.out.println("Enter the amount you want to pay");
		int target = sc.nextInt();
		NotesCounter notesCounter = new NotesCounter();
		System.out.println("Your payment approach inorder to give min no of notes will be: ");
		int[] notesCounterArray = notesCounter.notesCount(denominationsArray, target);

		for (int index = 0; index < denominationsArray.length; index++) {

			if (notesCounterArray[index] != 0) {

				System.out.println(denominationsArray[index] + ":" + notesCounterArray[index]);

			}

		}
	}

}
