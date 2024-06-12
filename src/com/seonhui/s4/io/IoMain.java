package com.seonhui.s4.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IoMain {

	public static void main(String[] args) {
		// bit를 처리함
		InputStream is = System.in;
		// char를 처리함
		InputStreamReader ir = new InputStreamReader(is);
		// String을 처리함
		BufferedReader br = new BufferedReader(ir);
		// 입력받을 준비가 끝(빨대를 서로 연결)
		System.out.println("입력하세요");
		String s = "";
		try {
			s = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 한줄 읽어와라
		System.out.println(s);

	}

}
