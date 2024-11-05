package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

/*
 응용문제
 info.txt를 이용하여 member.csv에 데이터를 입력시켜야 합니다.
 콤마 기준으로 각각의 데이터를 저장되도록 코드를 작성하시오.
 단, Stream, Writer 선택
  
  */
public class file22 {
	public static void main(String[] args) throws Exception {
		new file22_csv("member.csv");

	}
}

class file22_csv{
	String file_src = "";
	File f = null;
	FileWriter fw = null;
	BufferedWriter bw = null;
	
	FileReader fr = null;
	Scanner file = null;
	
	public file22_csv(String url) throws Exception {
		this.file_src = "D:\\webpage\\agree\\src\\main\\java\\io\\" + url;
		this.member_input();
	}
	
	public void member_input() throws IOException {
		this.f = new File(this.file_src);
		try {
			this.fw = new FileWriter(this.f, Charset.forName("euc-kr"), false);
			this.bw = new BufferedWriter(this.fw);
			
			this.fr = new FileReader("D:\\webpage\\agree\\src\\main\\java\\io\\info.txt");
			this.file = new Scanner(this.fr);
		

			while(true) {
				String str = file.nextLine();
				this.bw.write(str + "\n");
				this.bw.flush();
				
			}	
		}
		catch(Exception e) {
			e.getMessage();			
		}
		finally {
			this.file.close();
			this.fr.close();
			this.bw.close();
			this.fw.close();
		}
		
		
	}
}