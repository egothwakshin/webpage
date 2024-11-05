package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

//csv 데이터 저장
public class file20 {
	public static void main(String[] args) throws Exception {
		new file_csv("member.csv");	//,쉼표 형태 csv

	}
}

class file_csv{
	String file_src = "";	//파일 위치 및 파일명
	File f = null;
	FileWriter fw = null;
	BufferedWriter bw = null;
	
	public file_csv(String url) throws Exception {
		this.file_src = "D:\\webpage\\agree\\src\\main\\java\\io\\" + url;
		this.member_input();
	}
	
	private void member_input() throws IOException {
		this.f = new File(this.file_src);
		try {
			//FileWriter(파일경로, 언어셋, true) - txt외에 문서파일에 한글깨짐이 발생할 경우
			this.fw = new FileWriter(this.f, Charset.forName("euc-kr"), true);	//true 계속 데이터 저장
			this.bw = new BufferedWriter(this.fw);	//메모리를 활성화 파일에 저장시킴
			ArrayList<String> mb = new ArrayList<String>();	//csv 특성(,구분). 엑셀 칸 구분
			mb.add("유재석,ISFP");
			mb.add("강호동,ENFP");
			mb.add("안정환,INFP");
			mb.add("조정석,INTP");
			mb.add("차은우,ENTP");
			
			for(String m : mb) {	//foreach로 해당 배열의 값을 csv파일 저장
				this.bw.write(m + "\n");
				this.bw.flush();	//writer->flush 메모리초기화
			}
		}
		catch(Exception e) {
			e.getMessage();
		}
		finally {
			this.fw.close();
		}
	}
}
