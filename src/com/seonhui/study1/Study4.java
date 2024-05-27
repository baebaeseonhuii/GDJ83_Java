package com.seonhui.study1;

import java.util.Scanner;

public class Study4 {
	public static void main(String [] args) {
		//키보드와 연결 준비
		//한번만 작성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Number:"); //bigger than 0
		
		int num = sc.nextInt();
		
		
		System.out.println(num);
		System.out.println("Exit");
		
		
		int result = num/4+num%4;
		System.out.println();
		System.out.println();
		//1을 넣으면 1
		//2 -> 2
		//5를 넣으면 11
		//7 넣으면 13
		//3 -> 3
		//4 -> 10
		
		
	}
	
}
