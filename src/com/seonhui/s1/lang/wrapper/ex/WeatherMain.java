package com.seonhui.s1.lang.wrapper.ex;

public class WeatherMain {

	public static void main(String[] args) {
		// DTO(Data Transfer Object)
		// VO(Value Object)
		WeatherDTO[] dtos = new WeatherService().init();
		WeatherView view = new WeatherView();
		WeatherController wc = new WeatherController();
		// view.view(dtos);
		wc.start();

	}

}
