package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

//다른속성을 가진 ASCII 파일 읽기
public class file2 {
	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("D:\\webpage\\agree\\src\\main\\java\\io\\member.data");	
		//System.out.println((char)fr.read()); 	//첫글자 읽음

		Scanner file = new Scanner(fr);
		System.out.println(file.nextLine()); //해당 라인전체를 읽어들이는 방식
		file.close();
		fr.close();
		
		FileWriter fw = new FileWriter("D:\\webpage\\agree\\src\\main\\java\\io\\member.data",true);
		Scanner sc = new Scanner(System.in);
		System.out.println("추가 내용 입력: ");
		fw.write("\n" + sc.nextLine()); //write : 해당내용을 저장시키는 메소드
		sc.close();
		fw.close();
	}
}
