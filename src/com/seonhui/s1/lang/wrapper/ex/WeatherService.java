package com.seonhui.s1.lang.wrapper.ex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherService {

	// Controller Layer
	// Service이름 붙은 Class는 Business Layer: 실제 기능 or 데이터 전처리 후처리
	// DAO(Data Access Object)

	private StringBuffer sb;

	public WeatherService() {
		this.sb = new StringBuffer();
		this.sb.append("서울  , 29.3 - 맑음 - 60");
		this.sb.append("-부산  , 33.6 - 흐림 - 90");
		this.sb.append("-제주  , 26.5 - 눈 - 30");
		this.sb.append("-Los Angeles  , 20.7 - 맑음 - 35");
		this.sb.append("-대전  , 8.9 - 태풍 - 70");
		this.sb.append("-울산  , 22.4 - 비 - 80");
	}

	public ArrayList init() {
		// sb에 있는 것을 문자열 변수에 담아서 출력
		String info = sb.toString();

		info = info.replace(",", "-");

		ArrayList arr = this.useTokenizer(info);

		return arr;

	}

	private ArrayList useTokenizer(String info) {
		// 도시 기온 상태 습도
		StringTokenizer st = new StringTokenizer(info, "-");
		WeatherDTO[] dtos = new WeatherDTO[st.countTokens() / 4];
		ArrayList<WeatherDTO> arrays = new ArrayList<WeatherDTO>();
		String city = "";
		double gion = 0;
		String status = "";
		int humidity = 0;
		int count = 0;
		while (st.hasMoreTokens()) {
			WeatherDTO dto = new WeatherDTO();
			city = st.nextToken().trim();
			gion = Double.parseDouble(st.nextToken().trim());
			status = st.nextToken().trim();
			humidity = Integer.parseInt(st.nextToken().trim());
			dto.setCity(city);
			dto.setGion(gion);
			dto.setStatus(status);
			dto.setHumidity(humidity);
			arrays.add(dto);

		}

		return arrays;

	}

	private WeatherDTO[] getWeathers(String info) {

		String[] infos = info.split("-");
		for (int i = 0; i < infos.length; i++) {
			infos[i] = infos[i].trim(); // 문자열의 앞뒤 공백만 없애줌

		}

		WeatherDTO[] arr = new WeatherDTO[infos.length / 4];
		// WeatherDTO 타입의 배열을 [infos.length/4]개 만들어 놓음
		// 각 배열에는 NULL 값만 존재, 주소 넣을 공간만 생김

		int idx = 0;
		for (int i = 0; i < arr.length; i++) {
			// 배열에 넣어주고 싶을 때 마다 DTO 객체 한개씩 만들기
			arr[i] = new WeatherDTO();// 객체가 힙 영역에 만들어짐
			arr[i].setCity(infos[idx]);
			idx++;
			arr[i].setGion(Double.parseDouble(infos[idx]));
			idx++;
			arr[i].setStatus(infos[idx]);
			idx++;
			arr[i].setHumidity(Integer.parseInt(infos[idx]));
			idx++;

		}

		return arr;

	}

	// 날씨정보를 도시명으로 검색 -> 해당 날씨 return
	// findByCity()
	public WeatherDTO findByCity(WeatherDTO[] dtos) {
		Scanner sc = new Scanner(System.in);
		String cityName = sc.next();
		WeatherDTO dto = null;
		for (int i = 0; i < dtos.length; i++) {
			// dto = new WeatherDTO();
			if (cityName.equals(dtos[i].getCity())) {
				dto = dtos[i];
				break;
			}
		}
		return dto;
	}

	// 날씨정보 추가
	// addWeather
	// 도시명, 기온, 상태, 습도

	public WeatherDTO[] addWeather(WeatherDTO[] ar) {
		Scanner sc = new Scanner(System.in);
		WeatherDTO d = new WeatherDTO();
		System.out.print("도시: ");
		d.setCity(sc.next());
		System.out.print("기온: ");
		d.setGion(sc.nextDouble());
		System.out.print("상태: ");
		d.setStatus(sc.next());
		System.out.print("습도: ");
		d.setHumidity(sc.nextInt());

		WeatherDTO[] arr = new WeatherDTO[ar.length + 1];
		for (int i = 0; i < ar.length; i++) {
			arr[i] = ar[i];
		}
		arr[ar.length] = d;
		return arr;
//		
		// 클래스변수 클래스메서드 -> 객체없이 사용 가능
		// 클래스명.변수명
		// 클래스명.메서드명

	}

	// removeWeather
	// 기존 WeatherDTOs 배열에서 한칸 삭제
	// 도시명 입력받아서 해당 도시명 날씨 정보 삭제
	// continue 활용
	// 해당 도시명이면 continue로 건너뛰기
	public WeatherDTO[] removeWeather(WeatherDTO[] dtos) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 도시: ");
		String cityName = sc.next();

		WeatherDTO[] arr = new WeatherDTO[dtos.length - 1];

		int flag = 0;
		for (int i = 0; i < dtos.length; i++) {
			if (cityName.equals(dtos[i].getCity())) {
				flag++;
				continue;
			}

			arr[i - flag] = dtos[i];

		}
		System.out.println(cityName + "의 날씨 정보가 지워졌습니다.");
		System.out.println();

		return arr;

		// delim as a parameter -> split starting delim

	}

}
