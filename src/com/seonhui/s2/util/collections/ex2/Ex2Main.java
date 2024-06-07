package com.seonhui.s2.util.collections.ex2;

import java.util.ArrayList;

public class Ex2Main {

	public static void main(String[] args) {
		// view class
		// DTO class
		// controller class
		// service class
		// 명함 관리 프로그램
		// 이름, 회사이름, 직책이름, 전화번호, 이메일주소
		CardDTO dto = new CardDTO();
		CardService cs = new CardService();
		CardController cc = new CardController();
		CardView view = new CardView();
		ArrayList<CardDTO> arr = cs.init();
		cc.start();

	}

}
