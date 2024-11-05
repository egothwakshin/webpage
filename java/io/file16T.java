package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class file16T {
	public static void main(String[] args) throws Exception {
		new file16_box().property();
		new file16_box().dirctory();
		
		FileInputStream fs = null;
		FileOutputStream os = null;
	
		String url = "D:\\product\\";
		String data[] = {"pd1.2024.jpg", "pd1.jpg","pd2.jpg","pd3.jpg","pd4.jpg", "pd5.avif"};		
		String cpurl = "D:\\upload\\";
		
		int w = 0;
		while(w<data.length) {		//배열 개수만큼 반복
			fs = new FileInputStream(url + data[w]); // url + 파일명(배열데이터)
			byte bt[] = new byte[fs.available()];	//원시 규격 사이즈
			fs.read(bt);	//파일 전체 읽어들임
			
			os = new FileOutputStream(cpurl + data[w]);
			os.write(bt);
			
			os.flush();
			w++;
		}
		System.out.println("파일이 정상적으로 업로드 되었습니다.");
		os.close();
		fs.close();
	}
}

//파일 속성 및 디렉토리 리스트
class file16_box{
	//파일속성
	public void property() throws Exception {
		String url = "D:\\product\\pd1.2024.jpg";
		File f = new File(url);
		System.out.println(f.getName());	//파일명
		
		//속성(확장자)만 출력하기
		String filename = f.getName();
		int n = filename.lastIndexOf(".");	//해당단어를 기준으로 맨 마지막에 해당되는 단어 노드번호		
		System.out.println(n);
		String modify = filename.substring(n);	//(시작 노드번호, 검색할 단어개수)
		System.out.println(modify);
	}
	
	/*
	해당 디렉토리에 있는 모든 파일리스트 가져오는 코드
	: 서버에 업로드시 동일한 이름이 이미 있을 경우 해당 부분을
	조건문으로 처리하여 다른이름으로 저장하기위한 목적
	*/
	public void dirctory() throws Exception {
		String url = "D:\\product\\";
		File f = new File(url);
		File allfile[] = f.listFiles();
		System.out.println(Arrays.asList(allfile));
		
	}
		
}
