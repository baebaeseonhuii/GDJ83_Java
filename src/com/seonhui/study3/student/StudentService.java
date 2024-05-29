package com.seonhui.study3.student;

import java.util.Scanner;

public class StudentService {
	public Student[] makeStudent() { // 메서드의 리턴타입은 클래스이름이 될수도있음
		// 학생 수 만큼 정수 배열을 만들어서 리턴
		Scanner sc = new Scanner(System.in);
		// 같은 데이터 타입을 묶는 것
		System.out.print("학생수를 입력하세요: ");
		int count = sc.nextInt();

		// 학생들을 모을 배열을 리턴
		// Student -> 데이터 타입
		// 배열
		Student[] students = new Student[count];

		for (int i = 0; i < count; i++) {
			// students[i] = new Student(); //student 객체(객체의 주소)를 i번 만들기
			Student s = new Student();
			System.out.print(i + 1 + "번째 이름 입력: ");
			s.name = sc.next();
			System.out.print(s.name + " 번호 입력: ");
			s.num = sc.nextInt();
			System.out.print(s.name + "의 국어 점수를 입력하세요: ");
			s.kor = sc.nextInt();
			System.out.print(s.name + "의 영어 점수를 입력하세요: ");
			s.eng = sc.nextInt();
			System.out.print(s.name + "의 수학 점수를 입력하세요: ");
			s.math = sc.nextInt();
			s.total = s.kor + s.eng + s.math;
			s.avg = s.total / 3.0;
			students[i] = s; // students는 Student 배열[] 타입, student[i]는 Student 타입이라서 s가 student[i]에 대입 가능

		}

		return students;

	}
}
