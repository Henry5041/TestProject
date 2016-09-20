package org.chinaarchitect.testproject.fileio;

import java.io.*;
import java.util.TreeSet;

public class FileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readFileByLines("d:\\input.txt");
		cleanRepeat("d:\\output.txt");
		
	}

	public static void readFileByLines(String inputName) {
		BufferedReader reader = null;
		try {
			String encoding = "UTF-8";
			File file = new File(inputName);

			InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);// 考虑到编码格式
			BufferedReader bufferedReader = new BufferedReader(read);

			System.out.println("Read one line each time");
			reader = bufferedReader;
			String tempString = null;
			int line = 1;
			// 一次读入一行，直到读入null为文件结束
			while ((tempString = reader.readLine()) != null) {
				// 显示行号
				System.out.println("line " + line + ": " + tempString);

				if (tempString.startsWith("Quote: ")) {
					String subString = tempString.substring(7);
					FileWriter.write("d:\\output.txt", subString + "\n");
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
				}
			}
		}
	}

	public static void cleanRepeat(String fileName) {
		BufferedReader reader = null;
		try {
			String encoding = "UTF-8";
			File file = new File(fileName);

			InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);// 考虑到编码格式
			BufferedReader bufferedReader = new BufferedReader(read);

			System.out.println("Read one line each time");
			reader = bufferedReader;
			String tempString = null;
			TreeSet<String> strSet = new TreeSet<String>();
			int line = 1;
			// 一次读入一行，直到读入null为文件结束
			while ((tempString = reader.readLine()) != null) {
				// 显示行号
				System.out.println("line " + line + ": " + tempString);
				
				strSet.add(tempString.toLowerCase());
				line++;
			}
			for (String str:strSet){
				FileWriter.write("d:\\output.txt", str + "\n");
				
			}

			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e1) {
				}
			}
		}
	}
}
