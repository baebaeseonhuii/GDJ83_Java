package com.seonhui.study1;

import java.util.Scanner;

public class Study7 {
	public static void main(String[] args) {
		//반복문 - fir & while
		//for(초기식;조건식;증감식){}
		//while(조건식){}
		//do{} while(조건식);
		//break, continue
		//3과목의 점수를 입력받아서 합계를 냄
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input score: ");
				
		int sum = 0;
		for(int i = 0; i<3; i++) {
			int num = sc.nextInt();
			sum += num; 
			
		}
		System.out.println(sum);
		
		//'a' ~ 'z' 출력
		int c = 97;
		for(int i = 'a'; i <= 'z'; i++) {
			System.out.println((char)i);
			c++;
		}
		
		
		
	}
}
