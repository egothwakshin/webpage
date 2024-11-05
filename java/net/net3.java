package net;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Scanner;

//외부서버에 있는 이미지를 다운로드 받는 코드
public class net3 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("웹에서 가져올 이미지 주소를 입력하세요: ");
			String url = sc.nextLine();
			
			URL u = new URL(url);	//url 경로 확인
			URLConnection con = u.openConnection();	//해당 서버로 접근
			
			int imgsize = con.getContentLength();	//파일 사이즈
			String imgtype = con.getContentType();	//파일 속성 및 확장자
			long date = con.getDate();	//해당파알에 접속한 날짜
			//unix시간을 라이브러리를 통해 현재시간 형태로 변환
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String today = sdf.format(date);
			System.out.println(imgsize);
			System.out.println(imgtype);
			System.out.println(today);
			
			//Stream형태
			InputStream is = u.openStream();	//openStream: 외부에서 접속하는 파일 형태
			BufferedInputStream bs = new BufferedInputStream(is);
			byte b[] = new byte[bs.available() / 1024];
			
			//PC에 저장 (저장경로 및 파일명)
			String copy = "D:\\";
			FileOutputStream fs = new FileOutputStream(copy + "Ryan.png");
			int size = 0;
			while((size = bs.read(b)) != -1) {
				fs.write(b,0,size);		//파일 크기에 맞춰서 저장
				fs.flush();	//필수아님(OutputStream)
			}
			fs.close();
			bs.close();
			is.close();
			System.out.println("해당파일을 정상적으로 다운로드 완료 하였습니다.");
			
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("해당 서버로 접속이 제한되었습니다.");
		}

	}
}
