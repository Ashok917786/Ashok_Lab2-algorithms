package com.greatlearning.main;

public class NotesCounter {
	public int[] notesCount(int[] denominationsArray, int target) {
		int notesCounter[] = new int[denominationsArray.length];
		for (int i = 0; i < denominationsArray.length; i++) {
			if (target >= denominationsArray[i]) {
				notesCounter[i] = target / denominationsArray[i];
				target = target - notesCounter[i] * denominationsArray[i];
			}

		}
		if (target > 0) {
			System.out.println("The excat target amount is not reachable with this denominations");
			return new int[denominationsArray.length];
		} else {
			return notesCounter;
		}

	}

}
