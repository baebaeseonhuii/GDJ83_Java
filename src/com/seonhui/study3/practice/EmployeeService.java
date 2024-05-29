package com.seonhui.study3.practice;

import java.util.Scanner;

public class EmployeeService {
	public Employee[] inputEmployeeInfo() {
		// 사원수입력
		Scanner sc = new Scanner(System.in);
		System.out.print("사원 수를 입력하세요: ");
		int count = sc.nextInt();

		// i명 만큼의 사원수들의 "이름, 사원 번호, 급여, 보너스, 부서" 입력 후 배열에 저장
		Employee[] employees = new Employee[count];

		for (int i = 0; i < count; i++) {
			Employee e = new Employee();
			System.out.print(i + 1 + "번째 사원 이름: ");
			e.name = sc.next();
			System.out.print("사원 번호: ");
			e.employeeNum = sc.nextInt();
			System.out.print("급여: ");
			e.salary = sc.nextInt();
			System.out.print("보너스: ");
			e.bonus = sc.nextDouble();
			System.out.print("부서명: ");
			e.departmentName = sc.next();

			System.out.println();
			// employee class 배열 생성
			employees[i] = e;

		}
		return employees;

		// employees 리턴
	}
}
