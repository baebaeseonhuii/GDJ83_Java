package com.seonhui.s2.util.collections.ex2;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class CardService {
	private StringBuffer sb;

	public CardService() {
		// 이름, 회사이름, 직책이름, 전화번호, 이메일주소
		this.sb = new StringBuffer();
		this.sb.append("Patrick Star, Home, Friend, 647879, star123@gmail.com,");
		this.sb.append("Seonhui Bae, Goodee, Junior Developer, 0105438, seonhuiB@gmail.com,");
		this.sb.append("Haeju Chua, Kelly, Finance Manager, 647567, haejuC@gmail.com,");
		this.sb.append("Wonkyoung Chang, Four Seasons, Marketer, 0101234, wonKCh@gmail.com,");
		this.sb.append("Sponge Bob, Krusty Krab, Cook, 64478, BOBBOB@gmail.com");

	}

	public ArrayList<CardDTO> init() {
		String cards = sb.toString();
		StringTokenizer st = new StringTokenizer(cards, ",");
		ArrayList<CardDTO> arr = new ArrayList<CardDTO>();
		while (st.hasMoreTokens()) {
			CardDTO dto = new CardDTO();
			dto.setName(st.nextToken().trim());
			dto.setCompany(st.nextToken().trim());
			dto.setPosition(st.nextToken().trim());
			dto.setMobile(Integer.parseInt(st.nextToken().trim()));
			dto.setEmail(st.nextToken().trim());
			arr.add(dto);
		}
		System.out.println("Initialized Business Card Program");
		return arr;

	}

}
