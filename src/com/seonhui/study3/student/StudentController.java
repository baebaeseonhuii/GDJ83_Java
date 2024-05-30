package com.seonhui.study3.student;

import java.util.Scanner;

public class StudentController {
	public void start() {

		// S2-2 중 1. 학생 정보 입력, 2. 학생 정보 출력, 3. 학생 번호 검색, 4. 종료:
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		StudentService service = new StudentService();
		StudentView studentView = new StudentView();
		Student[] students = null;

		while (flag) {
			System.out.print("1. 학생 정보 입력, 2. 학생 정보 출력, 3. 학생 번호 검색, 4. 종료: ");
			int select = sc.nextInt();
			if (select == 1) {
				System.out.println("1번");
				students = service.makeStudent();

			} else if (select == 2) {
				System.out.println("2번");
				if (students != null) {
					studentView.view(students);

				} else {
					studentView.view3("학생정보를 입력하세요");
				}

			} else if (select == 3) {
				System.out.println("학생 번호 검색: ");
				// 학생 번호 입력받아서 일치하는지 확인
				// 찾은 학생 정보 출력 2번 처럼

				Student student = service.findByNum(students);
				if (student != null) {
					studentView.view2(student);
				} else {
					studentView.view3("검색결과가 없습니다.");
				}

			} else if (select == 4) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("입력 오류");
			}
		}
	}
}
