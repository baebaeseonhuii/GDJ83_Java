package com.seonhui.study1;

import java.util.Scanner;

public class Study8 {
	public static void main(String [] args) {
		//이중 for
		//총알(30발, 탄창 3개)
		//점사(3번 연속 쏨), 단발
		
		//1.단발, 2.점사
		//탕*30  탕탕탕*10
		//1 or 2 결정 3번
		
		Scanner sc = new Scanner(System.in);
		
		int tan = 3;
		
		for(int i = 0; i<tan; i++) {
			System.out.println("1번 -> 단발");
			System.out.println("2번 -> 점사");
			System.out.print("모드 설정: ");
			int mode = sc.nextInt();
			int num = 10;
			String tang="탕탕탕";
			if(mode == 1) {
				num = 30;
				tang = "탕";
			} 
			
			for(int j = 0; j < num; j++) {
				System.out.println(tang);
			}
			
			System.out.println();
			
		}
		
		System.out.println("끝");
		
		
	}
}
