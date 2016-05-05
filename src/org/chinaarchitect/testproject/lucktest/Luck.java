package org.chinaarchitect.testproject.lucktest;

import org.chinaarchitect.testproject.Point;

public class Luck extends Point {
	double point;

	@Override
	public double getPoint() {
		// TODO Auto-generated method stub
		return point;
	}

	public Luck(String name) {
		point = name.hashCode() * Math.random();
	}
}
