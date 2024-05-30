package com.seonhui.study3.student;

public class Student {
	// 아래는 클래스를 구성하는 멤버변수 = instance variable
	// 클래스 안에는 변수&메서드만 있어야 함

	// 접근 지정자 class 클래스명

	int num; // 인스턴스 변수
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;

	// 변수 선언 공식 => 데이터타입 변수명=
	// 객체 만드는 공식 => new className()
	// 메서드 선언 공식
	// public static void main(String[] args){}
	// 메서드 선언 공식 => 접근지정자 [그외지정자] 리턴타입 메서드명([매개변수들 선언]){실행할 코드} 메서드 선언부 or 헤더, 메서드의
	// 바디 or 내용
	// 클래스 Student를 구성하는 멤버 메서드
	public void info() {
		int num = 10; // 지역변수
		System.out.println("info()가 실행됩니다.");

	}
}
