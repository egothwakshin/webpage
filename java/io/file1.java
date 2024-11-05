package io;

import java.io.FileReader;

//oop > io > net > security > aop
/*
 I/O : input-output 
  input: 키보드, 마우스, HDD, File
  output: 모니터, 프린터
  
  java.io > java.nio
  io는 무조건 예외처리를 사용해야 합니다.
  */
public class file1 {
	public static void main(String[] args) {
		/*
		 FileReader : 문자데이터(ASCII)만 해당됨
		 FileWriter : 문자데이터 저장 파일 (ASCII)
				  
		  */	
		try {	//로드(load)할 파일명과 경로가 올바르면 try, 그렇지않으면 catch 작동 
			FileReader fr = new FileReader("D:\\webpage\\agree\\src\\main\\java\\io\\agree.txt");
			//System.out.println(fr.getEncoding());	//해당파일 언어셋. UTF-8
			//System.out.println(fr.read());			//첫번째 글자 데이터(파일) 크기
			
			//무한루프로 파일 전체를 읽어 들어야함
			while(true) {
				int size = fr.read();		//read() : 파일을 읽어들임(ASCII)
				System.out.println(size);	//반복문이 한글자씩 읽어들임
				//System.out.println((char)size);
				if(size == -1) {	// -1 : 해당 파일에 더이상 읽을 내용이 없을 경우
				break;
				}
			}
			fr.close();
		}
		catch(Exception e) {	
			System.out.println(e.getMessage());
		}
		
		}
}
