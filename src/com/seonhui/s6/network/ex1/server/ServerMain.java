package com.seonhui.s6.network.ex1.server;

public class ServerMain {

	public static void main(String[] args) {
		ServerConnect serverConnect = new ServerConnect();
		try {
			serverConnect.getConnect();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
