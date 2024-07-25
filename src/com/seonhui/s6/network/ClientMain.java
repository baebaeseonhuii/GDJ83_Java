package com.seonhui.s6.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {
		Socket socket = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		Scanner sc = new Scanner(System.in);
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;

		// 학생 정보 리스트, 학생 상세 정보, 종료
		// 종료 누를때까지 반복
		try {
			// 118
			socket = new Socket("192.168.7.120", 8282);
			System.out.println("서버와 연결 성공");
			// 빨대꽂는건 한번만 해도 됨
			os = socket.getOutputStream();// 0,1을 처리함
			ow = new OutputStreamWriter(os);// 문자열을 문자로 쪼갬
			is = socket.getInputStream();// 소켓에서 인풋스트림가져와서
			ir = new InputStreamReader(is);// 읽어오기
			br = new BufferedReader(ir);

			// 여기부터 반복 exit 입력받기까지
			while (true) {

				System.out.println("서버로 보낼 메세지를 입력하세요: ");
				String str = sc.next();
				// 콘솔로 받은 문자열을 0,1로 바꿔야 함 0,1,로 내보내야됨
				ow.write(str + "\r\n");
				ow.flush();
				if (str.toLowerCase().equals("exit")) {
					break;
				}

				str = br.readLine();// 서버에서 읽어온다는 뜻
				if (str.toLowerCase().equals("exit")) {
					break;
				}
				System.out.println(str);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				// 연결된 순서의 역순으로 닫아줌
				ow.close();
				os.close();
				br.close();
				ir.close();
				is.close();

				socket.close();
				sc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
