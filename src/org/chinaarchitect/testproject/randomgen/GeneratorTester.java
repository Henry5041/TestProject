package org.chinaarchitect.testproject.randomgen;

import java.util.Scanner;

import org.chinaarchitect.testproject.util.InvalidLimitException;
import org.chinaarchitect.testproject.util.RandomInt;

public class GeneratorTester {

	public GeneratorTester() throws InvalidLimitException {
		// TODO Auto-generated constructor stub
		Scanner Console = new Scanner(System.in);
		int input = Integer.parseInt(Console.next());
		int[] list = new int[16];
		for (int i = 0; i < 100000; i++) {
			int ranInt = new RandomInt(0, 15).getInteger();
			list[ranInt] = list[ranInt] + 1;
		}
		for (int i = 0; i < 16; i++) {
			System.out.println(i + " * " + list[i]);
		}

	}

}
