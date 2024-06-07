package com.seonhui.s2.util.collections.ex2;

import java.util.ArrayList;

public class CardView {
	public void view(ArrayList<CardDTO> arr) {
		for (int i = 0; i < arr.size(); i++) {

			arr.get(i).getName();
			arr.get(i).getCompany();
			arr.get(i).getPosition();
			arr.get(i).getMobile();
			arr.get(i).getEmail();
			System.out.println();

		}
	}
}
