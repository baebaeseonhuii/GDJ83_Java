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
		this.sb.append("-Los Angeles  , 20.7 - 맑음 - 35");
		this.sb.append("-대전  , 8.9 - 태풍 - 70");
		this.sb.append("-울산  , 22.4 - 비 - 80");
	}

	public WeatherDTO[] init() {
		// sb에 있는 것을 문자열 변수에 담아서 출력
		String info = sb.toString();

		info = info.replace(",", "-");

		WeatherDTO[] arr = this.getWeathers(info);

		return arr;

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

		// index%4를 어디에 쓰지?
		// Los Angenles도 공백을 빼면 안되니까 replace" ", "" 안됨

		// weatherDTO를 배열에 넣기
		// infos의 배열에서 4개씩 한묶음
//		weatherDTO.setCity(infos[0]);
//		weatherDTO.setGion(Double.parseDouble(infos[1]));
//		weatherDTO.setStatus(infos[2]);
//		weatherDTO.setHumidity(Integer.parseInt(infos[3]));

	}

}
