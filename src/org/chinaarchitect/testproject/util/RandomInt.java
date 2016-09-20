package org.chinaarchitect.testproject.util;

public class RandomInt {
	private int integer;

	public RandomInt(int lowerLimit, int upperLimit) throws InvalidLimitException {
		// TODO Auto-generated constructor stub
		if (upperLimit < lowerLimit) {
			throw new InvalidLimitException("You inputted a higher lowerLimit than upperLimit!");
		}
		integer = (int) (Math.random() * (upperLimit + 1 - lowerLimit)) + lowerLimit;
	}

	public int getInteger() {
		return integer;
	}

	public void setInteger(int integer) {
		this.integer = integer;
	}

}
