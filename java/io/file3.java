package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import javax.annotation.processing.Filer;

//여러개의 라인이 있는 파일 내용 읽기
//Filereader : 읽기, Filewriter : 쓰기
public class file3 {
	public static void main(String[] args) {
		try {
		String url = "D:\\webpage\\agree\\src\\main\\java\\io\\agree.txt";
		FileReader fr = new FileReader(url);
		Scanner sc = new Scanner(fr);
		System.out.println(sc.hasNext());	//true, false
		/*
		//for문 - 해당 라인 외 경고메세지까지 출력됨
		for(;;) {
			String result = sc.nextLine();
			
			if(result != null) {
				System.out.println(result);
			}
			else {
				break;
			}
		}
		*/
		
		/*
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		*/
		
		
		do {
			System.out.println(sc.nextLine());
		}while(sc.hasNext()); 
		
		
		//추가 글쓰기
		file3_box fb = new file3_box();
		fb.file_write();
		
		sc.close();
		fr.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class file3_box{
	String url = "D:\\webpage\\agree\\src\\main\\java\\io\\agree.txt";
	FileWriter fw = null;;
	Scanner sc = null;
	
	public void file_write() throws Exception {
		System.out.println("추가내용을 입력하세요:");
		this.sc = new Scanner(System.in);
		String msg = this.sc.nextLine();
		
		this.fw = new FileWriter(this.url,true);
		//핵심★ true: 기존데이터보존됨(누적), false: 새롭게 데이터삽입됨(갱신)
		this.fw.write("\n" + msg);	//개행
		System.out.println("저장완료 되었습니다.");
		this.fw.close();
		this.sc.close();
	}
}
