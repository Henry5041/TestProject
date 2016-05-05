package org.chinaarchitect.testproject;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double LuckyPoint = Math.random();
		if (LuckyPoint < 0.5) {
			System.out.print("阁下脸黑");
		} else {
			System.out.print("阁下脸白");
		}
	}

}
