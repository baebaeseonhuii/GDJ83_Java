package com.seonhui.s4.io;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		// bit(byte) -> 문자 -> 문자열
		// 파일 정보를 담고 있는 객체: File Class

		File file = new File("C:\\study");

		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.getName());
		System.out.println(file.length());// 용량

		System.out.println("=========================");
		// file = new File("C:\\study", "test.txt");
		// 폴더 하위폴더or파일
		file = new File(file, "sub");
		// 앞에서 만든 객체의 폴더경로
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());

		if (!file.exists()) {
			file.mkdir(); // sub 폴더가 있으면 안만듦
		}

		file = new File("C:\\study\\sub2\\student");// 최종적으로 만들 student위에 sub2가 없어서 못만듦
		file.mkdirs();
		file = new File("C:\\study\\test.txt");
		file.delete();
		file = new File("C:\\study\\sub2");
		file.delete();

		file = new File("C:\\study");
		String[] list = file.list();
		for (String s : list) {
			System.out.println(s);
		}

		File[] ar = file.listFiles();
		for (File f : ar) {
			if (f.isDirectory()) {
				System.out.println("folder");
			} else {
				System.out.println("file");
			}
		}

	}

}
