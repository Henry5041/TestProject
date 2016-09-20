package org.chinaarchitect.testproject.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class HighlightEditor {

	public HighlightEditor() {
		// TODO Auto-generated constructor stub
	}

	public static void readHighlight(String inputName, String outputName) {
		BufferedReader reader = null;
		try {
			String encoding = "UTF-8";
			File file = new File(inputName);

			InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding); // Consider
																									// the
																									// encoding
			BufferedReader bufferedReader = new BufferedReader(read);

			System.out.println("Read one line each time");
			reader = bufferedReader;
			String tempString = null;
			int line = 1;
			// Read one line each time, until null
			while ((tempString = reader.readLine()) != null) {
				// print line number
				System.out.println("line " + line + ": " + tempString);

				if (tempString.startsWith("Quote: ")) {
					String subString = tempString.substring(7);
					FileWriter.write(outputName, subString + "\n");
				}

				line++;
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
	}

	public static void cleanRepeat(String inputName, String outputName) {
		BufferedReader reader = null;
		try {
			String encoding = "UTF-8";
			File file = new File(inputName);

			InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding); // Consider
																									// the
																									// encoding
			BufferedReader bufferedReader = new BufferedReader(read);

			System.out.println("Read one line each time");
			reader = bufferedReader;
			String tempString = null;
			TreeSet<String> strSet = new TreeSet<String>();
			int line = 1;
			// Read one line each time, until null
			while ((tempString = reader.readLine()) != null) {
				// print line number
				System.out.println("line " + line + ": " + tempString);

				strSet.add(tempString.toLowerCase());
				line++;
			}
			for (String str : strSet) {
				FileWriter.write(outputName, str + "\n");

			}

			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
	}
}
