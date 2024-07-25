package com.seonhui.s4.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteTestMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		File file = new File("C:\\study\\weatherTest.txt");
		FileWriter fw = null;
		try {
			fw = new FileWriter(file, true);
			System.out.println("city, temperature, status, humidity");
			String s = sc.next();
			fw.write(s);

			fw.flush();// buffer를 비우려고 \r랑 같이 쓰임

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { // try, catch 상관없이 무조건 실행되는 코드
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
