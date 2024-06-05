package com.seonhui.s1.lang.wrapper.ex;

import java.util.Scanner;

public class WeatherController {
	private WeatherDTO[] dtos;
	private WeatherService weatherService;
	private WeatherView weatherView;

	// dtos와 weatherService의 초기화는 WeatherController의 생성자에서
	public WeatherController() {
		dtos = weatherService.init();
		weatherService = new WeatherService();
		weatherView = new WeatherView();
	}

	// start()
	// 1. 날씨 전체 정보 출력
	// 2. 종료
	public void start() {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		while (flag) {
			System.out.println("1. 날씨 전체 정보 출력 | 2. 종료");
			int select = sc.nextInt();
			if (select == 1) {
				weatherView.view(dtos);
				System.out.println();
			} else if (select == 2) {
				flag = false;
			} else {
				System.out.println("Make sure to press 1 or 2");
				System.out.println();
			}
		}
		sc.close();

	}

}
