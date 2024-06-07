package com.seonhui.s2.util.collections.ex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ProductService {
	private StringBuffer sb;

	public ProductService() {
		this.sb = new StringBuffer();
		this.sb.append("50000, 아이폰, 50,");
		this.sb.append("45000, 갤럭시, 100,");
		this.sb.append("30000, 노키아, 20");
	}

	public ArrayList init() {
		String datas = sb.toString();
		StringTokenizer st = new StringTokenizer(datas, ",");
		ArrayList<ProductDTO> ar = new ArrayList();
		while (st.hasMoreTokens()) {
			// 제품(통장)만들기
			ProductDTO dto = new ProductDTO();
			// price
			dto.setPrice(Integer.parseInt(st.nextToken().trim()));
			// name
			dto.setName(st.nextToken().trim());
			// stock
			dto.setStock(Integer.parseInt(st.nextToken().trim()));
			// 제품(통장)을 가방에 넣기
			ar.add(dto);

		}
		return ar;

	}

	// 기존의 가방에 새 상품 추가
	public void addProduct(ArrayList<ProductDTO> ar) {
		// 통장 새로 만들기,
		Scanner sc = new Scanner(System.in);
		ProductDTO dto = new ProductDTO();
		System.out.print("가격: ");
		dto.setPrice(sc.nextInt());
		System.out.print("기종: ");
		dto.setName(sc.next());
		System.out.print("수량: ");
		dto.setStock(sc.nextInt());
		ar.add(dto);

	}

	// 기존의 가방에서 제품 삭제 remove(indexNum), 물건의 이름을 입력받아서 일치하는 제품 삭제 return은 필요 없다
	public int removeProduct(ArrayList<ProductDTO> ar) {
		Scanner sc = new Scanner(System.in);
		ProductDTO dto = new ProductDTO();
		System.out.print("기종: ");
		String name = sc.next();

		int result = 0;

		for (int i = 0; i < ar.size(); i++) {
			if (name.equals(ar.get(i).getName())) {
				ar.remove(i);
				result = 1;
				break;
			}
		}
		return result;
	}
}
