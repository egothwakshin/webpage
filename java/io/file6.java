package io;

import java.io.BufferedReader;
import java.io.FileReader;

//FileReder => buffer
//buffer : 메모리를 활용하여 데이터를 출력 또는 입력(te mp)
/*
 ⓐ buffer : 임시저장된 공간의 데이터이므로 read 또는 readLine 사용시
 무조건 데이터를 순차적으로 삭제시킴 
 */
public class file6 {
	public static void main(String[] args) {
		try {
			String url = "D:\\webpage\\agree\\src\\main\\java\\io\\agree.txt";
			FileReader fr = new FileReader(url);	//Reader,Write 선언
			BufferedReader bf = new BufferedReader(fr);	//Buffer 선언
			
			/*
			// ⓐ관련사항
			String msg = bf.readLine();
			if(bf.readLine()!="") {		
				System.out.println(bf.readLine());
			}
			*/
			
			/*
			while(true) {
				String msg = bf.readLine();	//Buffer readLine : 공백포함 임시저장소 값 읽기
				if(msg != null) {
				System.out.println(msg);	//출력
				}
				else {
					break;
				}				
			}
			*/
			
			
			String msg = "";
			while((msg = bf.readLine())!=null) {	// null(false)
				System.out.println(msg);
			}
			
			bf.close();	//Buffer 종료
			fr.close();	//FileReader 종료
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
