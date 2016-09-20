package org.chinaarchitect.testproject.fileio;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HighlightEditor.readHighlight("d:\\input.txt", "d:\\list.txt");
		HighlightEditor.cleanRepeat("d:\\list.txt", "d:\\cleanrepeat.txt");
	}

}
