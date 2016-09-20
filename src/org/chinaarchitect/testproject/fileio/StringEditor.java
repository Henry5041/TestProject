/**
 * 
 */
package org.chinaarchitect.testproject.fileio;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Henry Hu
 *
 */
public class StringEditor {
	public static TreeSet<String> cleanDerivative(TreeSet<String> inputedSet) {
		TreeSet<String> output = (TreeSet<String>) inputedSet.clone();
		int minLengeth  = 9;
		for (String str : output) {
			int endIndex = (int) (str.toCharArray().length * 0.6);
			for (String currentStr : output) {
				if (str.toCharArray().length >= minLengeth && str.substring(0, endIndex) == currentStr.substring(0, endIndex)) {
					output.remove(str);
				}

			}
		}

		return output;
	}
}
