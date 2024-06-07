package com.seonhui.s2.util.collections.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class CardController {
	private Scanner sc = new Scanner(System.in);
	private ArrayList<CardDTO> ar;
	private CardView cardView;

	public CardController() {
		this.cardView = new CardView();
	}

	public void start() {
		boolean flag = true;
		while (flag) {
			System.out.println(
					"1. Print out all the cards | 2. Search a card by a name | 3. Add a card | 4. Delete a card by a name | 5. Exit");
			int select = sc.nextInt();
			if (select == 1) {
				this.cardView.view(ar);
				System.out.println("hi");
			} else if (select == 2) {
				System.out.println("hi");
			} else if (select == 3) {
				System.out.println("hi");
			} else if (select == 4) {
				System.out.println("hi");
			} else if (select == 5) {
				System.out.println("Bye");
				flag = false;
			} else {
				System.out.println("Make sure to press from number 1 to 5");
			}
		}
	}
}
