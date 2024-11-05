package net;
//클라이언트
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//UDP: Client 코드
public class net8 {
	public static void main(String[] args) {
		new net8_client().client_start();
	}
}

/*
 packet: 실제 데이터에서 앞, 뒤 정보를 표시하는 역활
 socket: 일반 socket - 실시간통신 O
 		 web socket(http, https) - 실시간통신 X, 양방향(node.js - Socket.io) - 실시간 통신가능
  */

class net8_client{
	private String ip = null; //서버ip
	private int port = 0;	//udp port
	private int myport = 0;	//자신의 port를 체크해서 server로 전달
	private DatagramSocket ds = null;	//socket
	private DatagramPacket dp = null;	//packet
	
	public void client_start() {
		this.ip = "172.30.1.XX";
		this.port = 7000;
		
		/*1:1 접속*/
		//this.myport = 7001;
		
		/*다중접속*/
		this.myport = (int)Math.ceil(Math.random()*1000) + 7000;
		
		try {
			InetAddress ia = InetAddress.getByName(this.ip); //서버 ip를 가져옴
			this.ds = new DatagramSocket(this.myport);
			while(true) {
				byte b[] = new byte[1024];	//전송메세지
				this.dp = new DatagramPacket(b, b.length, ia, this.port);
				System.out.println("메세지 전송완료!");
				
				byte b2[] = new byte[1024];
				this.dp = new DatagramPacket(b2, b2.length); //서버 메세지를 받는 공간 생성
				this.ds.receive(this.dp);	//서버 메세지를 받음
				System.out.println(new String(this.dp.getData()));	//서버 메세지 출력
			}
		}
		catch(RuntimeException re) {
			System.out.println("서버 접속 지연시간으로 접속장애 발생");
		}
		catch(Exception e) {
			System.out.println("서버로 접근이 불가능합니다.");
		}
	}
	
}