package com.seonhui.s6.network.ex1.client;

public class ClientMain {

	public static void main(String[] args) {
		ClientConnect clientConnect = new ClientConnect();
		ClientService clientService = new ClientService();
		try {
			// clientConnect.getConnection();//연결 잠깐 주석처리하고
			String info = "1,iu,50,60,70"; // 가짜 데이터 넣어서 테스트
			clientService.getInfo(info);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
