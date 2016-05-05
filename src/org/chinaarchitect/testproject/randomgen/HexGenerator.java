package org.chinaarchitect.testproject.randomgen;

import org.chinaarchitect.testproject.util.InvalidLimitException;
import org.chinaarchitect.testproject.util.RandomInt;

public class HexGenerator {

	public static void main(String[] args) throws InvalidLimitException {
		// TODO Auto-generated method stub
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
