package net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

//채팅 server
public class udp_server {
	public static void main(String[] args) {
		new chat_server();
	}
}

class chat_server{
	private final String ip = "172.30.1.20";
	private final int port = 9000;
	private DatagramSocket ds = null;
	private DatagramPacket dp = null;
	private InetAddress ia = null;
	private String msg = ""; //메세지
	private InputStreamReader isr = null;
	private BufferedReader br= null;

	
	public chat_server(){
		try {
			this.ia = InetAddress.getByName(this.ip);
			this.ds = new DatagramSocket(this.port);
			this.udp();
		}
		catch(Exception e) {
			System.out.println("포트충돌로 인하여 서버가 작동되지 않습니다.");
		}
		
	}
	private void udp() {
		try{
			while(true) {
				byte server_byte[] = new byte[1024];
				this.dp = new DatagramPacket(server_byte, server_byte.length);
				System.out.println("상담시작!");	//서버오픈 (대기)
				this.ds.receive(this.dp);	//클라이언트에서 전송한 메세지를 받음
				this.msg = new String(this.dp.getData());	//전송된 메세지(byte)를 문자열(String)로 변환
				System.out.println(this.msg);	//출력
				
				/*클라이언트에게 전송할 메세지*/
				System.out.println("메세지를 입력하세요: ");
				InetAddress ia2 = this.dp.getAddress(); //상대방 ip
				int port2 = this.dp.getPort(); //상대방 port		
				this.isr = new InputStreamReader(System.in);	//메세지 작성
				this.br = new BufferedReader(this.isr);	//작성된 내용을 메모리에 등록
				this.msg = this.br.readLine();	//메모리에 등록된 내용을 변수
				byte client_msg[] = this.msg.getBytes();	//문자열->byte로 변환
				//클라이언트에서 전송할 패키지 제작
				//DatagramPacket(byte배열,배열전체크기,전송할ip,전송할port)
				this.dp = new DatagramPacket(client_msg, client_msg.length, ia2, port2);
				this.ds.send(this.dp);	//클라이언트 전송
			}
			
			
		}
		catch(Exception e) {
			System.out.println("UDP서버 오픈 오류발생");
		}
	}
}
