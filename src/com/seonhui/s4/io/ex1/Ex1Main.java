package com.seonhui.s4.io.ex1;

import java.util.ArrayList;

public class Ex1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadStudy rs = new ReadStudy();
		MenuDTO dto = new MenuDTO();
		ArrayList<MenuDTO> ar = new ArrayList<MenuDTO>();

		try {
			ar = (ArrayList<MenuDTO>) rs.read();

			for (MenuDTO mDTO : ar) {
				System.out.println(mDTO.getMenuName());
				System.out.println(mDTO.getPrice());
				System.out.println(mDTO.getKcal());
				System.out.println("=====================");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
