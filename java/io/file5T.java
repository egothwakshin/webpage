package io;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class file5T {
	public static void main(String[] args) throws Exception {
		file5T_box fb = new file5T_box();
		fb.abc();
 	}
}

class file5T_box{	//io,nio : try~catch안에 넣어야함
	Scanner sc = new Scanner(System.in);
	FileWriter fw = null;
	File f = null;
	
	public void abc() throws Exception {
		try {
			String url = "D:\\webpage\\agree\\src\\main\\java\\io\\gugu_T.txt";
			this.f = new File(url);
			this.f.createNewFile();
			
			System.out.println("구구단 숫자를 입력하세요: ");
			int gugu = this.sc.nextInt();
			this.fw = new FileWriter(url);
			
			
			int w = 1;
			while(w<10) {
				int sum = gugu * w;
				this.fw.write(sum + "\n");
				//fileWriter : int,Integer,double,float 등 숫자형 데이터 저장시 글자깨짐
				w++;
			}
		}
		catch(Exception e) {
			
		}
		finally {
			this.sc.close();	
			this.fw.close();			
		}
	}
}
