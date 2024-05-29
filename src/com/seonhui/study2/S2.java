package com.seonhui.study2;

public class S2 {
	public static void main(String[] args) {
		// 변수의 종류
		// primitive type: byte, short, int, long, float, double, char, boolean
		// reference type: String
		// 메모리 영역 구분
		// 1. 메서드 영역
		// 메서드 영역에 선언된 변수: Class variables
		// 2. 스택 영역: 메서드가 실행되는 영역 (메인 메서드 포함) FILO구조
		// 스택 영역에 선언된 변수: 지역 변수 Local variables
		// 3. 힙 영역
		// 힙 영역에 선언된 변수: Instance variables

		// 배열 - 하나의 변수로 여러 개의 데이터를 다룰 때 쓰는 것
		// 자바는 같은 데이터 타입만 모을 수 있다.
		// 배열을 선언할 때 개수도 정해야 됨.
		// 배열 선언
		// 데이터타입명 [] 변수명 = new 데이터타입명 [개수]
		int[] ar = new int[3];
		int[] ar2 = { 1, 2, 3 };
		String[] names = new String[2];
		// ar의 데이터 타입은 int배열
		// new 연산자는 힙 영역에 뭔가를 만들겠다는 뜻
		// 실제 데이터가 있는 주소를 가리키는 변수: 참조 변수
		// 지역변수
		// - 시작되면 만들어지고 소멸
		// - 초기화 안하면 오류
		int num = 0;
		double n1 = 0.0;
		char ch = ' ';
		boolean flag = false;
		String name = null; // reference type은 초기화 기본값이 null

		System.out.println(ar);
		System.out.println(ar2);
		System.out.println(names);
		System.out.println(ar[0]); // ar에 값을 안넣어놓으면 기본값 0이 나옴
		System.out.println(names[0]); // reference type의 기본값인 null이 나옴
		ar[0] = 50;
		ar = ar2;
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println("안녕");

	}
}
