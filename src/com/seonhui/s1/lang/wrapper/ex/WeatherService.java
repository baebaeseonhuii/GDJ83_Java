package com.seonhui.s1.lang.wrapper.ex;

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
		this.sb.append("-광주  , 10.7 - 태풍 - 80");
	}

	public void init() {
		// sb에 있는 것을 문자열 변수에 담아서 출력
		String info = sb.toString();

		System.out.println(info);
		info = info.replace(",", "-");

		String[] infos = info.split("-");

		for (int i = 0; i < infos.length; i++) {
			infos[i] = infos[i].trim();

		}

		WeatherDTO[] arr = new WeatherDTO[infos.length / 4];
		// WeatherDTO 타입의 배열을 [infos.length/4]개 만들어 놓음
		// 각 배열에는 NULL 값만 존재, 주소 넣을 공간만 생김

		for (int i = 0; i < arr.length; i++) {
			// 배열에 넣어주고 싶을 때 마다 DTO 객체 한개씩 만들기
			arr[i] = new WeatherDTO();// 객체가 힙 영역에 만들어짐

			arr[i].setCity(infos[i * 4]);
			arr[i].setGion(Double.parseDouble(infos[i * 4 + 1]));
			arr[i].setStatus(infos[i * 4 + 2]);
			arr[i].setHumidity(Integer.parseInt(infos[i * 4 + 3]));

		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].getCity() + " ");
			System.out.print(arr[i].getGion() + " ");
			System.out.print(arr[i].getStatus() + " ");
			System.out.print(arr[i].getHumidity() + " ");
			System.out.println();
		}

		// index%4를 어디에 쓰지?
		// Los Angenles도 공백을 빼면 안되니까 replace" ", "" 안됨
		// 서울 -> city
		// 29.3 -> gion
		// 맑음 -> status
		// 60% -> humidity

		// weatherDTO를 배열에 넣기
		// infos의 배열에서 4개씩 한묶음
//		weatherDTO.setCity(infos[0]);
//		weatherDTO.setGion(Double.parseDouble(infos[1]));
//		weatherDTO.setStatus(infos[2]);
//		weatherDTO.setHumidity(Integer.parseInt(infos[3]));

	}

}
