package org.chinaarchitect.testproject;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "";
		
		for (char letter : str.toCharArray()) {
			
			System.out.println(letter);

		}
		System.out.println(args.length); // Show the length of array args
		System.out.println(args[0]); // Throw exception
	}

}
