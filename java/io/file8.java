package io;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//파일 내용(nio)을 배열로 저장
public class file8 {
	public static void main(String[] args) throws Exception {
		String url ="D:\\webpage\\agree\\src\\main\\java\\io\\agree.txt";
		
		//io형태로 배열 저장
		FileReader fr = new FileReader(url);
		BufferedReader br = new BufferedReader(fr);
		ArrayList<String> data = new ArrayList<String>();
		String msg = "";
		while((msg = br.readLine()) != null) {
			data.add(msg);
		}
		System.out.println(data);
		br.close();
		fr.close();
		
				
		
		//List interface 구성형태로 nio배열 저장
		List<String> data2 = new ArrayList<String>();
		data2 = Files.readAllLines(Paths.get(url));
		System.out.println(data2);
		
		
		
		//Class 구성 형태로 addAll을 이용하여 nio배열 저장
		ArrayList<String> data3 = new ArrayList<String>();
		data3.addAll(Files.readAllLines(Paths.get(url)));
		System.out.println(data3);
		
		
		
		//byte를 이용한 배열 형태 -> 문자열 변환
		String word = "abc";
		byte bt[] = word.getBytes();	//ASCII코드로 배열에 저장. a=97
		System.out.println(Arrays.toString(bt)); 	// [97,98,99]		
		String unbox1 = new String(bt);
		System.out.println(unbox1);					// abc	
		String unbox2 = Arrays.toString(bt);
		System.out.println(unbox2);					// [97,98,99]
		
		
		
		//byte + nio 활용	
		byte bt2[] = Files.readAllBytes(Paths.get(url));
		String unbox = new String(bt2);
		System.out.println(unbox);
		
	}
}
