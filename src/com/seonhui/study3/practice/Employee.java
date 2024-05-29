package com.seonhui.study3.practice;

import java.util.Scanner;

public class Employee {
	String name;
	String departmentName;
	int employeeNum;
	int salary;
	double bonus;

	public void mockInfo() {
		System.out.println("이름: " + name);
		System.out.println("부서: " + departmentName);
		System.out.println("사원번호: " + employeeNum);
		System.out.println("급여: " + salary);
		System.out.println("보너스: " + bonus);
	}

	public void sayInfo() {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		Employee[] employees = null;
		EmployeeService service = new EmployeeService();

		while (flag) {
			System.out.println("1. 사원 정보 입력 | 2. 사원 정보 보기 | 3. 사원 번호 검색 | 4. 종료");
			int select = sc.nextInt();
			if (select == 1) {
				System.out.println("1번 사원정보입력");
				employees = service.inputEmployeeInfo();
			} else if (select == 2) {
				System.out.println("2번 사원정보열람");
				for (int i = 0; i < employees.length; i++) {
					Employee e = employees[i];
					System.out.println("이름: " + e.name);
					System.out.println("보너스: " + e.bonus);
					System.out.println("부서명: " + e.departmentName);
					System.out.println("급여: " + e.salary);
					System.out.println("사원 번호: " + e.employeeNum);

					System.out.println();

				}
			} else if (select == 3) {
				System.out.println("3번 사원번호검색");

			} else if (select == 4) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("입력 오류");
			}
		}

	}
}
