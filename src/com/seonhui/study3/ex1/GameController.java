package com.seonhui.study3.ex1;

public class GameController {

	public void start() {
		// 몬스터 생성 1마리, 그룹으로 3마리
		// 몬스터 생성 클래스 따로 만들기
		MonsterFactory mf = new MonsterFactory();
		Monster m = mf.createMonster();// 공장에서 만들어서 리턴해줌
		System.out.println(m.name);
		System.out.println(m.level);

		Monster[] monsters = mf.createMonsterGroup();

		for (int i = 0; i < monsters.length; i++) {
			System.out.println("==========================");
			System.out.println(monsters[i].name);
			System.out.println(monsters[i].level);
		}
	}
}
