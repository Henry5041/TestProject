package org.chinaarchitect.testproject.getpi;

import java.util.Scanner;

public class PiCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		int pointNumber = 0;
		int attemptNumber = 0;
		do {
			try {
				attemptNumber = Integer.parseInt(console.next());
			} catch (NumberFormatException e) {
				continue;
			}
		} while (attemptNumber == 0);

		for (int i = 0; i < attemptNumber; i++) {
			double x = Math.random();
			double y = Math.random();
			if (Math.sqrt((x * x + y * y)) < 1) {
				pointNumber++;
			}
		}
		System.out.println((double) pointNumber / (double) attemptNumber);

	}

}
