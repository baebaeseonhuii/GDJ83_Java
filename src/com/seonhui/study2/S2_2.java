package com.seonhui.study2;

import java.util.Scanner;

public class S2_2 {
	public static void main(String[] args) {
		// 학생 수를 입력받아서 학생 수 만큼 이름과 국어점수를 입력받아서 출력
		// 배선희: 90, 민병관: 80, 김구디: 88

		Scanner sc = new Scanner(System.in);

		// 1 -> 학생 정보 입력
		// 2 -> 학생 정보 출력
		// 3 -> 프로그램 종료

		String[] students = null;
		int[] korScores = null;
		int[] engScores = null;
		int[] mathScores = null;
		int[] studentNum = null;
		int[] totals = null;
		double[] avgs = null;
		boolean flag = true;
		while (flag) {
			System.out.print("1. 학생 정보 입력, 2. 학생 정보 출력, 3. 학생 번호 검색, 4. 성적순 출력, 5. 종료: ");
			int typeOfNum = sc.nextInt();

			switch (typeOfNum) {
			case 1:
				System.out.print("학생 수를 입력하세요: ");
				int numOfStudent = sc.nextInt();

				studentNum = new int[numOfStudent];
				students = new String[numOfStudent];
				korScores = new int[numOfStudent];
				engScores = new int[numOfStudent];
				mathScores = new int[numOfStudent];
				totals = new int[numOfStudent];
				avgs = new double[numOfStudent];

				for (int i = 0; i < students.length; i++) {
					System.out.print("학생 이름을 입력하세요: ");
					students[i] = sc.next();
					System.out.print(students[i] + "의 국어 점수: ");
					korScores[i] = sc.nextInt();
					System.out.print(students[i] + "의 영어 점수: ");
					engScores[i] = sc.nextInt();
					System.out.print(students[i] + "의 수학 점수: ");
					mathScores[i] = sc.nextInt();
					studentNum[i] = i + 1;
					totals[i] = korScores[i] + engScores[i] + mathScores[i];
					avgs[i] = (double) totals[i] / 3;
				}
				break;

			case 2:
				System.out.println("이름\t국어\t영어\t수학\t학생번호\t총합\t평균");
				for (int i = 0; i < students.length; i++) {
					System.out.print(students[i] + "\t");
					System.out.print(korScores[i] + "\t");
					System.out.print(engScores[i] + "\t");
					System.out.print(mathScores[i] + "\t");
					System.out.print(studentNum[i] + "\t");
					System.out.print(totals[i] + "\t");
					System.out.print(avgs[i] + "\n");

				}
				break;

			case 3:
				System.out.println("검색할 학생 번호를 입력합니다: ");
				int n = sc.nextInt();
				for (int i = 0; i < students.length; i++) {
					if (studentNum[i] == n) {
						System.out.println("이름\t국어\t영어\t수학\t학생번호\t총합\t평균");
						System.out.print(students[i] + "\t");
						System.out.print(korScores[i] + "\t");
						System.out.print(engScores[i] + "\t");
						System.out.print(mathScores[i] + "\t");
						System.out.print(studentNum[i] + "\t");
						System.out.print(totals[i] + "\t");
						System.out.print(avgs[i] + "\n");
					} else {
						System.out.println("학생이 검색되지 않습니다.");
					}
				}
				break;

			case 4:
				// 성적순으로 출력
				for (int i = 0; i < avgs.length - 1; i++) {
					for (int j = 0; j < avgs.length - i - 1; j++) {
						if (avgs[j] < avgs[j + 1]) {
							double tmp = avgs[j];
							avgs[j] = avgs[j + 1];
							avgs[j + 1] = tmp;
						}
					}

				}
				for (int i = 0; i < students.length; i++) {

					System.out.println(students[i] + ": " + avgs[i]);
				}
				break;

			default:
				flag = false;
			}

			//

			/*
			 * if (typeOfNum == 1) {
			 * 
			 * } else if (typeOfNum == 2 && numOfStudent != 0) {
			 * System.out.println("이름\t국어\t영어\t수학\t학생번호\t총합\t평균"); for (int i = 0; i <
			 * students.length; i++) { System.out.print(students[i] + "\t");
			 * System.out.print(korScores[i] + "\t"); System.out.print(engScores[i] + "\t");
			 * System.out.print(mathScores[i] + "\t"); System.out.print(studentNum[i] +
			 * "\t"); System.out.print(totals[i] + "\t"); System.out.print(avgs[i] + "\n");
			 * 
			 * } } else if (typeOfNum == 3) { System.out.println("프로그램 종료"); flag = false; }
			 * else { System.out.println("숫자 입력 오류 or 입력된 학생 정보가 없습니다"); break; }
			 */
		}

	}
}
