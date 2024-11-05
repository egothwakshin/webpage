package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

//파일 용량 체크로 업로드 방식 (Bufferd)
public class file17 {
	public static void main(String[] args) {
		String url = "D:\\product\\img1.png";	//2MB이상
		String url2 = "D:\\product\\img2.jpg";	//2MB미만
		try {
			//BufferedInputStream : byte내용을 temp 임시메모리에 저장
			InputStream is = new FileInputStream(url2);
			BufferedInputStream bs = new BufferedInputStream(is);
			System.out.println(bs.available());
			if(bs.available() > 2097152) {
				System.out.println("이미지는 최대 2MB 이하의 파일만 업로드 가능");
			}
			else {
				byte file[] = new byte[bs.available()]; //buffer로 해당 값을 byte로 변환
				FileOutputStream os = new FileOutputStream("D:\\upload\\20240522.jpg");	// OutputStream 사용시 파일명 변경 가능
				bs.read(file);	// 한개의 픽셀값 전체사이즈			
				os.write(file);
				os.flush();
				os.close();
				System.out.println("정상적으로 업로드 되었습니다.");
			}


			
			bs.close();
			is.close();
		}
		catch(Exception e) {
			e.getMessage();
		}
	}
}
