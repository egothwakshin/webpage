package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//StreamWriter, StreamReader
public class file18 {
	public static void main(String[] args) {
		//String data = "유재석";
		try {
			System.out.println("입력값은: ");
			//InputStreamReader : Stream + Reader로 변환 가능한 라이브러리
			/* Stream [byte], Reader [String] */
			InputStreamReader isr = new InputStreamReader(System.in);
			//int data = isr.read();	//read를 사용하면, Buffered에 loss 데이터발생
			
			//InputStreamReader -> BufferedReader
			BufferedReader br = new BufferedReader(isr);
			System.out.println(br.readLine());	//입력된 모든 값을 출력
			
			//OutputStreamWriter			
			OutputStreamWriter osw = new OutputStreamWriter(System.out);
			BufferedWriter bw = new BufferedWriter(osw);			
			//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 	//위 두줄코드 한줄로 줄임
			
			String msg = "고객님의 포인트는 10000입니다.";
			bw.write(msg);
					
			bw.close();osw.close();br.close();isr.close();
		}
		catch(Exception e) {
			e.getMessage();
		}
		
	}
}
