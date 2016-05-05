package org.chinaarchitect.testproject.base;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base octonary = new Base(8);
		Scanner in = new Scanner(System.in);
		System.out.println(octonary.baseConvert(in.nextInt()));

	}

}
