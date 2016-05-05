package org.chinaarchitect.testproject.point24;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] num = new int[4];
		do {
			System.out.println("Please enter the correct 4 numbers:");
			for (int i = 0; i < num.length; i++) {
				num[i] = in.nextInt();

			}
		} while (!judge(num)); // Judge if the numbers are in the correct range.

		for (int[] pattern : patternIterator(num)) {
			System.out.println(getFormula(pattern));
		}

	}

	public static boolean judge(int[] num) {
		if (num != null) {

			for (int i = 0; i < num.length; i++) {

				if (num[i] < 1 || num[i] > 13) // Make sure they're acceptable
												// numbers
					return false;
			}

		}

		return true;

	}

	public static HashSet<int[]> patternIterator(int[] num) {
		HashSet<int[]> patterns = new HashSet<int[]>();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					for (int l = 0; l < 4; l++) {
						if (i != j && i != k && i != l && j != k && j != l && k != l) { // Make
																						// sure
																						// no
																						// two
																						// elements
																						// are
																						// the
																						// same
							int[] pattern = { num[i], num[j], num[k], num[l] };
							patterns.add(pattern);

						}
					}
				}
			}
		}

		return patterns;
	}

	public static String getFormula(int[] pattern) {
		// TODO finish this part

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				for (int k = 0; k < 6; k++) {

					if (calculator(calculator(calculator(pattern[0], pattern[1], i), pattern[2], j), pattern[3],
							k) == 24) {
						String formula = formulaWriter(
								formulaWriter(formulaWriter(Integer.toString(pattern[0]), pattern[1], i), pattern[2],
										j),
								pattern[3], k);
						return formula;
					}

				}
			}
		}
		return "";
	}

	public static double calculator(double firstNum, double secondNum, int operationCase) {
		double finalNum = firstNum;
		switch (operationCase) {
		case 0:
			finalNum = firstNum + secondNum;
			break;
		case 1:
			finalNum = firstNum - secondNum;
			break;
		case 2:
			finalNum = secondNum - firstNum;
			break;
		case 3:
			finalNum = firstNum * secondNum;
			break;
		case 4:
			finalNum = ((double) firstNum / (double) secondNum);
			break;
		case 5:
			try {
				finalNum = ((double) secondNum / (double) firstNum);
			} catch (java.lang.ArithmeticException e) {

			}
			break;
		}
		return finalNum;

	}

	public static String formulaWriter(String formula, int num, int operationCase) {
		switch (operationCase) {
		case 0:
			formula = formula + " + " + num;
			break;
		case 1:
			formula = formula + " - " + num;
			break;
		case 2:
			formula = num + " - (" + formula + ")";
			break;
		case 3:
			formula = "(" + formula + ") * " + num;
			break;
		case 4:
			formula = "(" + formula + ") / " + num;
			break;
		case 5:
			formula = num + " / (" + formula + ")";
			break;
		}
		return formula;

	}

	public static void output(int[] array) {

		if (array != null) {

			for (int i = 0; i < array.length; i++) {

				System.out.print(array[i] + " ");

			}

		}

		System.out.println();

	}

}
