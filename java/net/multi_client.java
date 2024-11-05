package net;

import java.net.Socket;

//Thread를 이용한 client
public class multi_client {
	public static void main(String[] args) {
		new client_port();
	}
}

class client_port{
	Socket sk = null;
	String serverip = "";
	int port = 0;
	
	public client_port() {
		this.serverip = "172.30.1.20";
		this.port = 9001;
		
		try {
			this.sk = new Socket(this.serverip,this.port);
			System.out.println("서버 접속 완료!!");
			
			//대화시 Thread로 넘기는 방식
			Thread th = new client_open();	//Thread 메소드 호출
			th.start();	//Thread run() 실행
			
		}
		catch(Exception e) {
			System.out.println("서버 접속 오류 발생!");
		}
	}
	
}

//채팅참여시 같은 port 사용자끼리 대화할때 사용하는 부분
class client_open extends Thread{
	public client_open() {
		
		
	}
	@Override
	public void run() {
		
		super.run();
	}
	
}
