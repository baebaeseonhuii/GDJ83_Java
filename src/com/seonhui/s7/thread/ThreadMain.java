package com.seonhui.s7.thread;

public class ThreadMain {

	public synchronized void main(String[] args) {
		Object obj = new Object();

		PrintNumber pn = new PrintNumber();
		PrintWord pw = new PrintWord();
		Thread thread = new Thread(pw);

		pn.start();// 번갈아 가면서 일을 할건데 누가 먼저 나올거냐는 운영체제가 결정, start()는 Thread 클래스만 가지고 있음
		thread.start(); // 결제 상황에서 한사람이 들어오면 다른 사람은 못들어오게 막는것: Synchronized(그외지정자로)
	}

}
