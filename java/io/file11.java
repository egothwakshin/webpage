package io;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//Reader, Writer, File -> ASCII
//Stream -> 바이너리(이미지, 동영상, 오디오, pdf, zip 등)
//InputStream(입력), OutputStream(출력)
//InputStream -> FileInputStream, AudioInputStream, ObjectInputStream(하위)

//Files JAVA11
public class file11 {
	public static void main(String[] args) {
		try {
			//createDirectories : 디렉토리 생성
			Files.createDirectories(Paths.get("D:\\images"));
			
			/*
			//파일복사 Path(interface) copy로 복사
			Path data1 = Paths.get("D:\\images\\gugu.txt");
			Path data2 = Paths.get("D:\\images\\gugu2.txt");
			Files.copy(data1, data2);
			*/
			
			/*
			//파일이동
			Path data3 = Paths.get("D:\\images\\gugu2.txt");
			Path data4 = Paths.get("D:\\gugu2.txt");
			Files.move(data3, data4);
			*/
			
			/*
			//파일생성
			Path data5 = Paths.get("D:\\images\\gugu_copy.txt");
			Files.createFile(data5);
			*/
			
			//파일삭제
			Path data6 = Paths.get("D:\\images\\gugu_copy.txt");
			Files.delete(data6);
			
		}
		catch(Exception e) {
			e.getMessage();
		}
	}
}
