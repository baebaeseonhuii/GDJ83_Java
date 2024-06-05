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
}
