package net;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class net_chat_server {

	public static void main(String[] args) {
		new net_chat_server().open();
	}
	//소켓을 유지하는 Thread
	public void open() {
		ServerSocket ss = null;
		Socket sk = null;
		try {
			ss = new ServerSocket(9000);
			System.out.println("[채팅 서버 오픈]");
			while (true) { // 소켓을 유지하기 위한 반복문
				sk = ss.accept();
				// Thread 부분에서 채팅이 작성됨
				chatroom ch = new chatroom(sk);
				ch.start();
			}
		} catch (Exception e) {
			System.out.println("서버 포트 충돌로 서버 가동 중지");
		} finally {
			if (ss != null) {
				try {
					ss.close();
					System.out.println("서버를 강제 종료합니다.");
				} catch (Exception e) {
					System.out.println("서버 소켓이 완전 오류가 발생함");
					System.exit(0);
				}
			}
		}
	}
}
//관리자가 직접 채팅을 사용하여 입력시에는 별도의 Thread
class admin extends Thread{
	
}


//송신,수신 역할을 하는 클래스(Thred)
class chatroom extends Thread {
	InputStream is = null;
	InputStreamReader isr = null;
	BufferedReader br = null;
	OutputStream os = null;
	Socket socket = null;
	PrintWriter pw = null; // Stream -> Writer 자동변환 (byte -> String)
	String mid = "";
	// 서버에 접속한 모든 사용자를 메모리에 저장한 리스트
	static List<PrintWriter> list = new ArrayList<PrintWriter>();
	
	public void message(String msg) { // 배열에 있는 모든 사용자에게 동일한 메시지 전달
		for (PrintWriter pw : this. list) {
			pw.println(msg); // 메시지 발송
			pw.flush();
		}
	}
	
	@Override
	public void run() {
		try {
			this.mid = this.br.readLine();
			String hello = "[" + this.mid + "]님 입장하였습니다.";
			System.out.println(hello); // 서버에서 해당 클라이언트 정보 출력
			this.message(hello); // 전체 발송
			
			while (this.br != null) { // 메시지를 입력하면 작동이 되는 반복문
				hello = this.br.readLine().intern();
				if (hello == "나가기") {
					break;
				}
				else {
					this.message(this.mid + " : " + hello);
				}
			}
		} catch (Exception e) {
			System.out.println("사용자 추가 오류 발생, 접속 해제");
		} finally {
			this.message(this.mid + "님이 퇴장하였습니다.");
			this.list.remove(this.pw);
			try {
				this.socket.close();
			} catch (Exception e) {
				System.out.println("채팅 서버 종료");
			}
			System.out.println(this.mid + " 퇴장");
		}
	}
	//
	public chatroom(Socket s) {
		this.socket = s;
		try {
			// 접속에 대한 정보를 list 배열에 추가
			this.pw = new PrintWriter(this.socket.getOutputStream());
			this.list.add(this.pw);
			System.out.println("채팅참여자 + 총 " + this.list.size() + "명 입니다.");
			
			//채팅 관련 정보
			this.is = this.socket.getInputStream();
			this.isr = new InputStreamReader(this.is);
			this.br = new BufferedReader(this.isr);
			
			//System.out.println(this.socket.getInetAddress()); // 접속자 IP
			//System.out.println(this.socket.getKeepAlive()); // 소켓 유무 판별 (false 기본)
		} catch (Exception e) {
			System.out.println("소켓 통신 오류 발생");
		}
	}
}