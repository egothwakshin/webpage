package io;

import java.io.PrintWriter;

//servlet, spring : Java > jsp
public class file23 {
	public static void main(String[] args) {
		String url = "D:\\webpage\\agree\\src\\main\\java\\io\\info.txt";
		try {
			//Object -> Writer -> PrintWriter
			//FileWriter => PrintWriter (Javascript, IO기능)
			PrintWriter pw = new PrintWriter(url);	//파일을 로드하여 해당내용을 기록하는 클래스
			pw.write("홍길동");
			pw.close();
			
		}
		catch(Exception e) {
			e.getMessage();
		}
	}
}
