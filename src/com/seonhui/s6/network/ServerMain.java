package com.seonhui.s6.network;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ServerMain {

	public static void main(String[] args) throws Exception {
		// Network
		// ip:port -> Socket
		// Network 통신은 Socket끼리 1:1 통신
		// 클라이언트와 서버가 연결되기 위해선 소켓을 만들어야함
		// 서버와 클라이언트가 1:1 통신인데 클라이언트가 여러개라서 서버도 여러개 만들어짐
		ServerSocket serverSocket = null;
		Socket socket = null;
		InputStream is = null;
		InputStreamReader ir = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedReader br = null; // 문자열 읽어줌
		Scanner scanner = new Scanner(System.in);

		List<StudentDTO> ar = new ArrayList<StudentDTO>();

		File file = new File("C:\\study\\serverStudent.txt");
		FileReader fr = new FileReader(file);
		BufferedReader brForfile = new BufferedReader(fr);

		try {
			serverSocket = new ServerSocket(8282); // port number
			while (true) {
				// 서버를 열고 Client의 접속을 기다림
				System.out.println("서버 실행 후 클라이언트 기다리기");
				socket = serverSocket.accept(); // 클라이언트와 연결된 소켓을 줌
				System.out.println("클라이언트와 연결이 성공됐다");
				// 빨대꽂는건 한번만 해도 됨
				is = socket.getInputStream(); // 0,1처리함
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);
				os = socket.getOutputStream();
				ow = new OutputStreamWriter(os);

				// 여기부터 반복 exit 입력받기까지

				// 클라한테 번호 받아서 1번오면 학생정보 보내주기
				// 하나의 문자열로 append해서 클라한테 보내기
				// 클라한테 번호 받아서 2번오면 학생 한명 정보 하나의 문자열로 보내주기
				// 2번 눌러서 몇번 학생 번호를 볼건지
				// 2번 누르면 어떤 학생을 보시겠어요?까지 클라
				// if count == 2 -> for문 돌려서 if 학생 num == DTO의 getNum이랑 같으면
				// set으로 다 정해줘서
				// 3번오면 종료
				while (true) {
					String msg = br.readLine(); // 한줄읽는 메서드
					if (msg.toLowerCase().equals("exit")) {
						break;
					}
					System.out.println(msg);
					if (Integer.parseInt(msg) == 1) {
						// 학생정보 전체출력
						while (true) {
							String s = brForfile.readLine();
							if (s == null) {
								break;
							}
							s = s.replace(",", "-");
							StringTokenizer st = new StringTokenizer(s, "-");
							StudentDTO dto = new StudentDTO();
							while (st.hasMoreTokens()) {
								dto.setNum(Integer.parseInt(st.nextToken().trim()));
								dto.setName(st.nextToken().trim());
								dto.setKor(Integer.parseInt(st.nextToken().trim()));
								dto.setEng(Integer.parseInt(st.nextToken().trim()));
								dto.setMath(Integer.parseInt(st.nextToken().trim()));
							}
							ar.add(dto);

						}
						for (int i = 0; i < ar.size(); i++) {
							ow.write(ar.get(i).getNum() + "-" + ar.get(i).getName() + "-" + ar.get(i).getKor() + "-"
									+ ar.get(i).getEng() + "-" + ar.get(i).getMath() + "\r\n");

							System.out.println(ar.get(i).getNum() + "-" + ar.get(i).getName() + "-" + ar.get(i).getKor()
									+ "-" + ar.get(i).getEng() + "-" + ar.get(i).getMath() + "\r\n");

						}

					} else if (Integer.parseInt(msg) == 2) {
						while (true) {
							String s = brForfile.readLine();
							if (s == null) {
								break;
							}
							s = s.replace(",", "-");
							StringTokenizer st = new StringTokenizer(s, "-");
							StudentDTO dto = new StudentDTO();
							while (st.hasMoreTokens()) {
								dto.setNum(Integer.parseInt(st.nextToken().trim()));
								dto.setName(st.nextToken().trim());
								dto.setKor(Integer.parseInt(st.nextToken().trim()));
								dto.setEng(Integer.parseInt(st.nextToken().trim()));
								dto.setMath(Integer.parseInt(st.nextToken().trim()));
							}
							ar.add(dto);

						}
						// 어떤 학생 번호를 줄건지 묻기
						ow.write("검색할 학생의 번호를 입력하세요: ");
						ow.flush();

						msg = br.readLine();
						StudentDTO result = null;
						for (StudentDTO sDTO : ar) {
							if (Integer.parseInt(msg) == sDTO.getNum()) {
								result = sDTO;
								ow.write(result.getNum() + "-" + result.getName() + "-" + result.getKor() + "-"
										+ result.getEng() + "-" + result.getMath() + "\r\n");
								break;
							}
						}

					} else if (Integer.parseInt(msg) == 3) {
						break;
					}

//					System.out.println("클라이언트로 보낼거 입력: ");
//					msg = scanner.next();
//					ow.write(msg + "\r\n");// 쓰는 도구

					ow.flush();// 강제로 보내주기 위해
					// exit라는 걸 보내고!!!!
					// 받아서 exit인지 입력해서 exit인지 둘다 검사
//					if (msg.toLowerCase().equals("exit")) {
//						break;
//					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				// 연결된 순서의 역순으로 닫아줌
				br.close();
				ir.close();
				is.close();
				ow.close();
				os.close();
				socket.close();
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
