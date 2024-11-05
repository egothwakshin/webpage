package net;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//TCP 멀티서버
public class multi_server {
	public static void main(String[] args) {
		new server_port();
	}
}

//포트설정
class server_port{
	public server_port() {
		//싱글 port
		int port = 9001;
		server_open so = new server_open(port);
		so.start();
		
		/*
		//멀티 포트 설정
		int port[] = {9001,9002,9003};	//오픈할 포트 번호
		int w = 0 ;
		while(w<port.length) {
			server_open so = new server_open(port[w]);	//배열의 포트번로
			so.start(); //run메소드 실행
			w++;
		}
		*/
	}
}

//멀티 포트 오픈 (스레드 이용)
class server_open extends Thread{
	String ip = "";
	int pt = 0;
	ServerSocket sk = null;
	Scanner sc = null;
	public server_open(int p) {
		this.ip = "172.30.1.20";
		this.pt = p;
	}
	
	
	@Override
	public void run() {	//실행
		try {
			this.sk = new ServerSocket(this.pt);	//소켓을 이용하여 포트 오픈
			while(true) {	
				Socket s = this.sk.accept();	//클라이언트 접속을 할수 있도록 반복문으로 대기
				System.out.println(this.pt + "서버 오픈");
			}
		}
		catch(Exception e) {
			System.out.println("중복된 port로 인하여 서버가 실행되지 않습니다.");
		}
		super.run();
	}
}
