package com.seonhui.study3.ex1;

import java.util.Random;

public class MonsterFactory {

	public Monster createMonster() {
		Monster m = new Monster();

		return m;
	}

	public Monster[] createMonsterGroup() {
		Random random = new Random();
		int count = random.nextInt(5) + 2; // 2~6마리
		Monster[] monsters = new Monster[count];

		for (int i = 0; i < count; i++) {
			Monster m = new Monster();
			monsters[i] = m;
		}

		return monsters;
	}

}
