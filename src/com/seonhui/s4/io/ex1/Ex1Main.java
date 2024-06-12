package com.seonhui.s4.io.ex1;

import java.util.ArrayList;

public class Ex1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadStudy rs = new ReadStudy();
		ArrayList<MenuDTO> ar = new ArrayList<MenuDTO>();

		try {
			rs.read();

			for (MenuDTO menuDTO : ar) {
				menuDTO.getMenuName();
				menuDTO.getPrice();
				menuDTO.getKcal();
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
