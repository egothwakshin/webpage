package net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//채팅 client
public class udp_client {
	public static void main(String[] args) {
		new chat_client();
	}
}

class chat_client{	
	private final String ip = "172.30.1.20";	//서버ip
	private final int port = 9000;		//서버port
	private int myport = 0;		//자신(클라이언트)이 사용하는 port
	private DatagramSocket ds = null;
	private DatagramPacket dp = null;
	private InetAddress ia = null;
	private String msg = ""; //메세지
	private InputStreamReader isr = null;
	private BufferedReader br= null;
	
	
	public chat_client() {
		//다중접속
		this.myport = (int)Math.ceil(Math.random()*1000) + 9000;
		this.chatting();
	}
	public void chatting() {
		try {
			this.ia = InetAddress.getByName(this.ip);	//서버 ip 가져옴
			this.ds = new DatagramSocket(this.myport);	//서버에게 자신의 port정보 
			while(true) {
				System.out.println("상담 내용을 입력하세요: ");
				this.isr = new InputStreamReader(System.in);	//메세지 입력
				this.br = new BufferedReader(this.isr);	//입력한 내용을 메모리에 임시저장
				this.msg = this.br.readLine();	//임시저장된 내용을 변수로 받아서 처리
				byte by[] = this.msg.getBytes();	//메세지 String -> byte
				this.dp = new DatagramPacket(by, by.length, this.ia, this.port); //전송할 내용 packet
				this.ds.send(this.dp); //전송
				System.out.println("상담내용 전송완료!");
				
				//서버 메세지 출력 역할
				byte server[] = new byte[1024];
				this.dp = new DatagramPacket(server, server.length);
				this.ds.receive(this.dp);	//서버 내용을 받음
				String msg = new String(this.dp.getData());	//byte -> 문자열변환
				System.out.println(msg);
			}
		}
		catch(Exception e) {
			System.out.println("서버 접속 오류!");
		}
	}
}