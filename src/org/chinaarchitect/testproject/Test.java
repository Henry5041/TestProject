/**
 * 
 */
package org.chinaarchitect.testproject;

import java.util.Scanner;

/**
 * @author Henry Hu
 *
 */
public class Test {

	/**
	 * 
	 */
	public Test() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int num = 4, ans = 0;
		int input = in.nextInt();
		if (input >= 4)
			num = input;


		int i = 1, j = 2, k = 3, l = num;
		for (i = 1; i <= num - 3; i++) {
			for (j = 2; j <= num - 2; j++) {
				for (k = 3; k <= num - 1; k++) {
					if (i < j && i < k && i < l && j < k && j < l && k < l)
						ans++;
				}
			}
		}
		System.out.print(ans);

	}

}
