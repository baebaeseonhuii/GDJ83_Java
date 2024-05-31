package com.seonhui.s3;

public class S3Main {

	public static void main(String[] args) {
		// polymorph - reference끼리의 형변환
		// tiger 8, penguine 2
		// ship 하나에 여러 마리를 담으려고 함
		Tiger tiger = new Tiger();
		tiger.age = 5;
		tiger.name = "호돌이";
		tiger.power = 500;

		Penguin penguin = new Penguin();
		penguin.age = 3;
		penguin.name = "펭수";
		penguin.wing = 2;

		Animal animal = tiger; // tiger is a animal, tiger 객체가 animal로 바뀐거임
		animal = penguin;

		System.out.println(animal.name);
		System.out.println();

		penguin = (Penguin) animal;

		Animal[] dropShip = new Animal[8];
		dropShip[0] = tiger;
		dropShip[1] = penguin;

		Tiger ani = (Tiger) dropShip[0];
		// 부모는 부모것만 알고 자식은 자식 것+ 부모 것 까지 알고 있음
		// 부모는 자식에 접근하려면 자식으로 타입을 바꿔서 접근해야됨

		Eagle eagle = new Eagle();
		Airplane airPlane = new Airplane();

		Fly fly = eagle;
		fly = airPlane;

	}

}
