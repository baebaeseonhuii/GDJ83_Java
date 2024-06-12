package com.seonhui.s4.io;

import java.io.File;

public class FileMain2 {

	public static void main(String[] args) {
		// study2 폴더를 삭제
		File file = new File("C:\\study2");

		File[] fileList = file.listFiles();
		for (File f : fileList) {
			f.delete();

		}

		System.out.println(file.delete());

	}

}
