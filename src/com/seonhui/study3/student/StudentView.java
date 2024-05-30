package com.seonhui.study3.student;

public class StudentView {
	public void view(Student[] students) {
		// StudentService 클래스의 makeStudent 메서드의 리턴값을 어떻게 받아오지?
		// 매개변수 활용

		// 1. 프린트 일단 해서 눈으로 확인
		System.out.println("학생 정보 출력");

		// view메서드에 Student배열 타입의 students를 매개변수로 넣음
		// ->

		for (int i = 0; i < students.length; i++) {

			System.out.println(students[i].name);
			System.out.println(students[i].num);
			System.out.println(students[i].kor);
			System.out.println(students[i].math);
			System.out.println(students[i].eng);

		}

	}

	public void view(Student student) {
		System.out.println(student.num);
		System.out.println(student.name);
		System.out.println(student.kor);
		System.out.println(student.math);
		System.out.println(student.eng);
		System.out.println(student.avg);
	}

	public void view(String str) {
		System.out.println(str);
	}
}
