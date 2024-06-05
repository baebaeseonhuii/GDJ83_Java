package com.seonhui.s1.lang.wrapper.ex;

public class WeatherView {

	// view method
	// 날씨들의 정보를 받아서 이쁘게 출력
	public void view(WeatherDTO[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].getCity() + " ");
			System.out.print(arr[i].getGion() + " ");
			System.out.print(arr[i].getStatus() + " ");
			System.out.print(arr[i].getHumidity() + " ");
			System.out.println();
		}

	}

	public void view(WeatherDTO dto) {
		if (dto != null) {
			System.out.print(dto.getCity() + " ");
			System.out.print(dto.getGion() + " ");
			System.out.print(dto.getStatus() + " ");
			System.out.print(dto.getHumidity() + " ");
			System.out.println();
		} else {
			System.out.println("검색 정보가 없다");
		}
	}
}
