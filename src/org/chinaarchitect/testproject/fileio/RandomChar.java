package org.chinaarchitect.testproject.fileio;

import org.chinaarchitect.testproject.util.InvalidLimitException;
import org.chinaarchitect.testproject.util.RandomInt;

public class RandomChar {

	public static void main(String[] args) throws InvalidLimitException {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100000; i++) {
			int ranInt = new RandomInt(0, 255).getInteger();
			char c = (char) ranInt;
			System.out.print(c);
		}
	}

}
