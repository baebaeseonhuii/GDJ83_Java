package com.seonhui.s4.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileReadMain {

	public static void main(String[] args) {
		File file = new File("C:\\study", "hey.java");

		FileReader fr = null;
		BufferedReader br = null;// 문자들을 모아서 문자열로 만드는 클래스

		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			while (true) {
				String s = br.readLine();
				if (s == null) {
					break;
				}
				System.out.println(s);
			}

		} catch (Exception e) { // 파일을 못찾을 수도 있다
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("exit");

	}

}
