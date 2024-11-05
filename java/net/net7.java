package net;
//서버
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//UDP: 보안상 연결을 체크할수있음
//Server(TCP 5000) <-> Client(UDP 5000), Client(UDP 5000), Client(UDP 5000)
//Server(UDP 5000) <-> Client(UDP 5001), Client(UDP 5002), Client(UDP 5003) - 자동
public class net7 {
	public static void main(String[] args) {
		new server_udp().server_start();
	}
}

class server_udp{
	private String ip = null;	//서버ip
	private int port = 0;
	private DatagramSocket ds = null; //udp socket
	private DatagramPacket dp = null; //메세지 송수신 패킷

	
	public void server_start() {
		this.ip = "172.30.1.20";
		this.port = 7000;
		try {
			//server ip를 확인
			InetAddress ia = InetAddress.getByName(this.ip);
			this.ds = new DatagramSocket(this.port); //UDP소켓을 등록
			byte by[] = new byte[1024];	//byte 전송
			this.dp = new DatagramPacket(by, by.length); //송수신에 사용되는 패킷
			System.out.println("서버 오픈...");
			this.ds.receive(this.dp);	//client에서 보낸 메세지를 서버에서 받는 역활
		
			/*클라이언트 정보 출력*/
			InetAddress client_ip = this.dp.getAddress(); //상대방 접속ip를 가져옴
			int client_port = this.dp.getPort();	//상대방 접속 port를 가져옴
			System.out.println(client_ip);
			System.out.println(client_port);
		
		}
		catch(Exception e) {
			System.out.println("udp 포트 충돌 발생!");
		}
		finally {
			this.ds.close();
		}
	}
}
