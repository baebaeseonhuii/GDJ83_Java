package com.seonhui.study1;

public class Study2 {
	
	public static void main(String[] args) {
		
		//Reference type(Object)
		String name = "Hello";
		int age = 30;
		
		age = 1;
		String na = "iu";
		//형변환(Cascading)
		//primitive type 끼리만 가능 (boolean 제외)
		//형태의 변환(type의 변환)
		//작은 타입 -> 큰 타입 : 타입명 안써줘도 됨
		//큰 타입 -> 작은 타입 :  타입명 써줘야 됨
		
		//강제 형변환, 명시적 형변환
		long num1 = 30L; //8byte
		int num2 = (int)num1; //4byte

		//묵시적 형변환
		float f1 = 1.2f; //4byte
		double d1 = f1; //8byte
		
		//자동형변환
		//byte -> short, char -> int -> long -> float -> double
		//수 표현의 개수(비트 조합)
		//1.000001 -> 1 in float. 근사치를 제공함
		
		int total = 100;
		double avg = (double)total/3;
		
		avg = 33.22;
		total = (int)(avg*10);
		System.out.println(total);
		
		
		
		na = "1";
		
		//overflow
		byte b = 127;
		byte b2 = 1;
		b = (byte)(b+b2);
		System.out.println(b);
		//underflow
		
		//연산자는 같은 타입끼리만 연산 가능 
		//산술연산자
		
		
		
		
		
	}
}
