package org.chinaarchitect.testproject.base;

public class Base {
	private int baseNumber;

	public Base(int baseNumber) {
		this.baseNumber = baseNumber; // Give value to baseNumber

	}

	public String baseConvert(int initialNumber) { // 封装
		int quotient = 0;
		int remainder = 0;
		String result = "";

		quotient = initialNumber;

		while (quotient != 0) {
			remainder = quotient % baseNumber;
			quotient = (quotient - remainder) / baseNumber;
			result = remainder + result;

		}

		return result;
	}
}
