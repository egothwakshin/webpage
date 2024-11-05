package io;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/*
 i/o 기초 응용편
 파일은 gugu.txt로 java에서 생성 되어야 하며,
 사용자가 다음과 같이 입력합니다.
 
 "구구단을 입력하세요: "
 gugu.txt에 사용자가 입력한 구구단이 모두 출력되어야 합니다.
 
 [예시]
 6 입력시,
 6x1=6
 6x2=12
 ...
 6x9=54
  
 */
public class file5 {
	public static void main(String[] args) {
		file5_box fb = new file5_box();
		fb.abc();
	}
}

class file5_box{
	
	String url = "D:\\webpage\\agree\\src\\main\\java\\io\\gugu.txt";
	File f = null;
	FileWriter fw = null;
	Scanner sc = null;
	
	public void abc() {
		try {
			this.f = new File(this.url);
			this.f.createNewFile();
			
			this.fw = new FileWriter(this.url,true); //
			System.out.println("구구단을 입력하세요: ");		
			this.sc = new Scanner(System.in);
			int kk = this.sc.nextInt();
			
			int w = 1;
			while(w<10) {
				String str = (kk + " x " + w + " = " + kk*w + "\n");
				this.fw.write(str);
				//fileWriter : int,Integer,double,float 등 숫자형 데이터 저장시 글자깨짐
				w++;
			}
			this.fw.close();
			this.sc.close();			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}