package org.chinaarchitect.testproject.fileio;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set = new TreeSet<String>();
		set.add("defend");
		set.add("defensible");
		set.add("civilize");
		set.add("civil");
		set.add("deceivable");
		set.add("deceive");
		set.add("communist");
		set.add("communism");
		set.add("mathematician");
		set.add("mathematics");
		set.add("mathematicians");
		set = StringEditor.cleanDerivative(set);
		for (String str : set) {
			System.out.println(str);

		}
	}

}
