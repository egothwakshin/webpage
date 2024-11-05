package net;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

import javax.security.sasl.SaslException;

//Socket 통신 [cilent]
public class net6 {
	static Socket sk = null;
	
	public static void main(String[] args) {
		String ip = "172.30.1.49";	//서버주소
		int port = 9000;	//서버포트 적용
		
		System.out.println("클라이언트 접속시도...");
		Scanner sc = new Scanner(System.in);
		
		try {
			//System.out.println("서버에 연결되었습니다.");
			
			while(true) {					
				sk = new Socket(ip, port);
				System.out.println("보낼 내용을 입력하세요: ");
				String msg = sc.nextLine();		//사용자의 입력값
				
				//OutputStream : 클라이언트 ->서버 전송하는 역할
				OutputStream os = sk.getOutputStream();	
				byte m[] = msg.getBytes();	//문자 -> byte 변환
				os.write(m);		//전송
			
				//서버에서 보낸 내용을 클라이언트에서 메세지 출력
				InputStream is = sk.getInputStream();
				byte call[] = new byte[1024];
				is.read(call);
				String result = new String(call);
				System.out.println(result);
			
				os.flush();			//빈공간 내용 초기화
				os.close();
				is.close();
			}
					
		}
		catch(Exception e) {
			System.out.println("서버에 접속하지 못했습니다.");
		}

	}
}
