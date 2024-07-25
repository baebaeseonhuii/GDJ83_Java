package com.seonhui.s4.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteMain {

	public static void main(String[] args) {

		// 문자열 -> 문자로 분해 -> 0,1
		Scanner sc = new Scanner(System.in);
		System.out.print("Input file name: ");
		String fileName = sc.next();

		File file = new File("C:\\study", fileName); // t1.txt가 없으면 만들어서 file에 경로&파일 저장
		FileWriter fw = null;
		try {
			fw = new FileWriter(file, true);
			boolean flag = true;
			while (flag) {
				System.out.print("Write something: ");
				String s = sc.next();
				if (s.toUpperCase().equals("E")) {
					flag = false;
				}
				fw.write(s + "\r\n");

			}

			// e, E 입력되면 종료
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Exit");

	}

}
