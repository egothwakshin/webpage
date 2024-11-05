package io;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class file9 {
	public static void main(String[] args) throws Exception {
		String url = "D:\\webpage\\agree\\src\\main\\java\\io\\member.txt";
		//nio Files를 이용한 데이터 저장
		String msg = "허경환";
		Path path = Paths.get(url);	//nio 경로
		Files.write(path, msg.getBytes(),StandardOpenOption.APPEND);
		/*
		 nio write (경로, 문자열.getBytes())
		 
		 StandardOpenOption : 파일형태 삭제,추가,생성 
		 StandardOpenOption.APPEND : 기존데이터 보존 + 새로운값 추가
		 StandardOpenOption.WRITE : 기존 데이터 덮어쓰기
		 StandardOpenOption 미사용할 경우 : 기존데이터 삭제 + 새로운값 추가
		 StandardOpenOption.CREATE_NEW : 새로운파일을 생성하여 데이터 추가
		 StandardOpenOption.CREATE : 해당경로에 파일명이 없을 경우 생성 후 데이터 추가
		 StandardOpenOption.DELETE_ON_CLOSE : 파일 삭제
		 */
	}
}
