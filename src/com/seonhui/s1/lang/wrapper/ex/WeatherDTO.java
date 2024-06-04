package com.seonhui.s1.lang.wrapper.ex;

public class WeatherDTO {

	// DTO의 모든 멤버변수를 private로 설정
	// Getters/Setters 필요
	// 생성자는 여러 개 만들어도 상관없지만 기본 생성자는 필수

	// city name
	private String city;
	// temperature
	private double gion;
	// weather information
	private String status;
	// humidity
	private int humidity;

	public String getCity() {

		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getGion() {

		return gion;
	}

	public void setGion(double gion) {
		this.gion = gion;
	}

	public String getStatus() {

		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getHumidity() {

		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
}
