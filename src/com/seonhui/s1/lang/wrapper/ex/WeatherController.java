package com.seonhui.s1.lang.wrapper.ex;

import java.util.Scanner;

public class WeatherController {
	private WeatherDTO[] dtos;
	// private WeatherDTO dto;
	private WeatherService weatherService;
	private WeatherView weatherView;
	private Scanner sc;

	// dtos와 weatherService의 초기화는 WeatherController의 생성자에서
	// 생성자는 클래스의 객체가 만들어짐과 동시에 실행됨
	public WeatherController() {
		this.weatherService = new WeatherService();
		this.weatherView = new WeatherView();
		this.dtos = this.weatherService.init();
		// this.dto = this.weatherService.findByCity(dtos);
		this.sc = new Scanner(System.in);
	}

	// start()
	// 1. 날씨 전체 정보 출력
	// 2. 종료
	public void start() {
		boolean flag = true;
		while (flag) {
			System.out.println("1. 날씨 전체 정보 출력 | 2. 날씨 정보 검색 | 3. 날씨 정보 추가 | 4. 날씨 정보 삭제 | 5. 종료");
			int select = sc.nextInt();
			if (select == 1) {
				this.weatherView.view(dtos);
				System.out.println();
			} else if (select == 2) {
				System.out.print("도시 검색: ");
				WeatherDTO dto = this.weatherService.findByCity(this.dtos);
				weatherView.view(dto);
				if (dto != null) {
					weatherView.view(dto);
				} else {
					System.out.println("검색결과가 없습니다.");
				}

			} else if (select == 3) {
				dtos = weatherService.addWeather(dtos);
			} else if (select == 4) {
				// 이름으로 검색해서 같은 이름이 있는 것 삭제
				dtos = weatherService.removeWeather(dtos);

			} else if (select == 5) {
				flag = false;

			} else {
				System.out.println("Make sure to press 1 or 2");
				System.out.println();
			}
		}

		// 메서드는 return을 만나면 그 밑에 추가 코드가 있어도 종료됨.
	}

}
