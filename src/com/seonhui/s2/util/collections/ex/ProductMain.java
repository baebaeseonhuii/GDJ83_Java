package com.seonhui.s2.util.collections.ex;

import java.util.ArrayList;

public class ProductMain {

	public static void main(String[] args) {
		ProductService productService = new ProductService();
		ArrayList<ProductDTO> ar = productService.init();
		// productService.addProduct(ar);
		int result = productService.removeProduct(ar);
		if (result > 0) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}

//		for (int i = 0; i < ar.size(); i++) {
//			System.out.print(ar.get(i).getPrice() + ", ");
//			System.out.print(ar.get(i).getName() + ", ");
//			System.out.print(ar.get(i).getStock() + " ");
//			System.out.println();
//		}

		Account ac = new Account();
		Account ac2 = new Account();
		Account ac3 = new Account();
		Account ac4 = new Account();
		Account ac5 = new Account();
		Account ac6 = new Account();

		// ac1~ac6 통장들
		// 이 통장들을 넣을 가방 -> 배열, collection의 List의 ArrayList
		// 통장의 가방이니까 타입이 통장
//		ArrayList<Account> ar = new ArrayList<Account>();
//		for(int i = 0; i < 6; i++) {
//			Account a = new Account();
//			ar.add(a)
//		}
//		ar.get(0).getMoney();// 가방의 0번째 통장에서 잔고를 확인

	}

}
