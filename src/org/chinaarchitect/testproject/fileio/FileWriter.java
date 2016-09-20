package org.chinaarchitect.testproject.fileio;

import java.io.*;
import java.util.Scanner;

import org.chinaarchitect.testproject.util.InvalidLimitException;

public class FileWriter {

	public static void main(String[] args) throws InvalidLimitException {

		// TODO Auto-generated method stub
		Scanner Console = new Scanner(System.in);
		int length = Integer.parseInt(Console.next());

		File outputFile = null;// 首先定义文件类
		OutputStream outputStream = null;// 定义字节流
		OutputStreamWriter outputWriter = null;// OutputStreamWriter是字节流通向字符流的桥梁。
		BufferedWriter outputBufferedWriter = null;// 定义缓冲区

		try {
			outputFile = new File("d:\\output.txt"); // 新建文件对象
			// 从文件系统中的某个文件中获取字节
			outputStream = new FileOutputStream(outputFile, true); // true是append设为允许，即可以在原文件末端追加。
			// 将字节流转换成字符流
			outputWriter = new OutputStreamWriter(outputStream);
			// 把接收到的字符流放入缓冲区，提高读写速度。
			outputBufferedWriter = new BufferedWriter(outputWriter);

			// 将字符串以流的形式写入文件
			outputBufferedWriter.write("");

		} catch (FileNotFoundException e) {
			System.out.println("找不到指定文件");
		} catch (IOException e) {
			System.out.println("写入文件错误");
		} finally {
			try {
				// 关闭文件放到finally里，无论读取是否成功，都要把流关闭。
				// 关闭的顺序：最后开的先关闭，栈的先进后出原理。
				outputBufferedWriter.close();
				outputWriter.close();
				outputStream.close();

			} catch (IOException e) {
				System.out.println("文件流无法关闭");
			}
		}
	}

	public static void write(String fileName, String line) {
		File outputFile = null;// 首先定义文件类
		OutputStream outputStream = null;// 定义字节流
		OutputStreamWriter outputWriter = null;// OutputStreamWriter是字节流通向字符流的桥梁。
		BufferedWriter outputBufferedWriter = null;// 定义缓冲区

		try {
			outputFile = new File(fileName); // 新建文件对象
			// 从文件系统中的某个文件中获取字节
			outputStream = new FileOutputStream(outputFile, true); // true是append设为允许，即可以在原文件末端追加。
			// 将字节流转换成字符流
			outputWriter = new OutputStreamWriter(outputStream);
			// 把接收到的字符流放入缓冲区，提高读写速度。
			outputBufferedWriter = new BufferedWriter(outputWriter);

			// 将字符串以流的形式写入文件
			outputBufferedWriter.write(line);

		} catch (FileNotFoundException e) {
			System.out.println("找不到指定文件");
		} catch (IOException e) {
			System.out.println("写入文件错误");
		} finally {
			try {
				// 关闭文件放到finally里，无论读取是否成功，都要把流关闭。
				// 关闭的顺序：最后开的先关闭，栈的先进后出原理。
				outputBufferedWriter.close();
				outputWriter.close();
				outputStream.close();

			} catch (IOException e) {
				System.out.println("文件流无法关闭");
			}
		}
	}

}
