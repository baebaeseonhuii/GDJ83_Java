package com.seonhui.s6.network.ex1.client;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientConnect {
	private Socket socket;
	private InputStream is;
	private InputStreamReader ir;
	private BufferedReader br;
	private OutputStream os;
	private OutputStreamWriter ow;

	// 1. 연결

	public BufferedReader getBr() {
		return br;
	}

	public OutputStreamWriter getOw() {
		return ow;
	}

	public void getConnection() throws Exception {
		socket = new Socket("localhost", 8282); // socket: phone(you can talk to the person thru phone(socket)

		// Input
		is = socket.getInputStream();
		ir = new InputStreamReader(is);//
		br = new BufferedReader(ir); // br만 있으면 연결 가능

		// Output
		os = socket.getOutputStream();
		ow = new OutputStreamWriter(os);

		// return은 하나만 할 수 있는데 br,ow 리턴해야됨 -> 클래스(낭비) or collection계열
		// 배열, list, set, map

	}

	public void disConnect() throws Exception {
		br.close();
		ir.close();
		is.close();
		ow.close();
		os.close();
		socket.close();
	}

}
