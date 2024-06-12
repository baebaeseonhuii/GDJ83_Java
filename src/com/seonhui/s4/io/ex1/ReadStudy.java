package com.seonhui.s4.io.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ReadStudy {

	public List<MenuDTO> read() throws Exception {
		// info.txt 파일을 읽어오기
		// 1. 한 줄씩 읽어와서 항목별로 parsing 후 출력
		// 2. DTO만든 후에 리턴

		File file = new File("C:\\study", "info.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		MenuDTO dto = new MenuDTO();

		String result = "";
		ArrayList<MenuDTO> ar = new ArrayList<MenuDTO>();
		while (true) {
			String s = br.readLine();

			if (s == null) {
				break;
			}

			StringTokenizer st = new StringTokenizer(s, ",");
			MenuDTO mDTO = new MenuDTO();

			while (st.hasMoreTokens()) {
				mDTO.setMenuName(st.nextToken().trim());
				mDTO.setPrice(Integer.parseInt(st.nextToken().trim()));
				mDTO.setKcal(Integer.parseInt(st.nextToken().trim()));
			}
			ar.add(mDTO);
//
//			for (MenuDTO a : ar) {
//				System.out.println(a.getMenuName());
//				System.out.println(a.getPrice());
//				System.out.println(a.getKcal());
//				System.out.println();
//			}
		}
		return ar;

	}
}
