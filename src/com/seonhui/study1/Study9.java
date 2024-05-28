package com.seonhui.study1;

import java.util.Scanner;

public class Study9 {
	public static void main(String[] args) {

		// 사용자의 아이디와 비번을 입력받아서 로그인 시도를 N번 시도
		// 틀리면 로그인 실패 출력, 로그인 성공하면 성공을 출력하고 반복문 종료
		// 반복문 종료 후, 종료를 선택하면 프로그램 종료
		// 로그인이 성공 후 반복문이 종료되었다면 게임을 시작하자

		// 로그인 시도 전에 로그인 할 것 말 것? 1. 로그인, 2.종료

		// mmorpg:

		// 숫자 3*myLevel을 누르면 사냥합니다.
		// 1 -> 2: 3마리 사냥 => 사냥했다! * 3번 출력
		// 2 -> 3: 6마리 사냥 => 사냥했다! * 6번 출력
		// 3 -> 4: 9마리 사냥 => 사냥했다! * 9번 출력
		// 14 -> 15: 42마리 사냥 => 사냥했다! * 42번 출력

		Scanner sc = new Scanner(System.in);
		int answerId = 1234;
		int answerPw = 5678;
		boolean flag = true;

		while (flag) {
			System.out.print("로그인 하시겠습니까?(1: Yes | 2: No): ");
			int loginOrNot = sc.nextInt();
			if (loginOrNot == 1) {
				System.out.print("id를 입력하세요: ");
				int id = sc.nextInt();
				System.out.print("pw를 입력하세요: ");
				int pw = sc.nextInt();

				if (id == answerId && pw == answerPw) {
					System.out.println("로그인 성공");
					break;
				} else {
					System.out.println("로그인 실패");
				}
			} else {
				System.out.println("종료합니다.");
				flag = false;
			}

		}

		if (flag) {
			System.out.println("게임을 시작하겠습니다.");
			// 시작 레벨은 1로 시작해서 15가 만랩
//			int myLevel = 1;
//			// GOLD: 0으로 시작
//			int myGold = 0;
//			String hunt = "사냥했다!";
//			int huntCount = myLevel * 3;
//			for (int i = myLevel; i <= 15; i++) {
//				if (i == 5) { // 5레벨 달성시 1000G 지급
//					System.out.println("현재 " + i + "레벨. " + i * 200 + "GOLD를 지급합니다.");
//				} else if (i == 10) { // 10레벨 달성시 2000G 지급
//					System.out.println("현재 " + i + "레벨. " + i * 200 + "GOLD를 지급합니다.");
//				} else if (i == 15) { // 15레벨 달성 시 3000G 지급
//					System.out.println("현재 " + i + "레벨. " + i * 200 + "GOLD를 지급합니다.");
//				}
//
//				if (i == 15) {
//					System.out.println("만랩입니다. 게임을 종료합니다.");
//					break;
//				} else {
//					System.out.println("현재 레벨: " + i);
//					huntCount = i * 3;
//					// 레벨업을 위해 myLevel * 3 마리를 사냥하세요
//					System.out.println("레벨업을 위해 " + huntCount + "을 눌러 " + huntCount + "마리를 사냥하세요.");
//					int count = sc.nextInt();
//					System.out.println(hunt.repeat(count));
//					System.out.println("------------------레벨업 하셨습니다------------------");
//				}
//			}

			// 선생님 코드
			int level = 1;
			int mon = 3;
			int gold = 0;
			for (level = 1; level < 15; level++) {
				System.out.println("1. 사냥 | 2. 종료");
				int select = sc.nextInt();
				if (select != 1) {
					break;
				}

				if (level % 5 == 0) {
					gold = gold + level / 5 * 1000;
					System.out.println(level + "레벨, 축하금: " + level / 5 * 1000 + "GOLD 지급");
				}

				System.out.println("현재 레벨: " + level);
				for (int j = 0; j < level * mon; j++) {
					System.out.println(j + 1 + "번째 사냥");
				}
			}
			gold = gold + 3000;
			System.out.println("최종 레벨: " + level + " | 소유 골드: " + gold);
		}
	}
}
