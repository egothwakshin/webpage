package exam;
//IO, Network -> try~catch
/*
 io(buffered) => close, flush, nio
 File => 경로를 로드 
 //String,char
 FileReader, FileWriter => ASCII
 BufferedReader, BufferedWriter => 단독사용X
 
 //Stream + Reader, Writer
 InputStreamReader + BufferedReader
 OutputStreamWriter + BufferedWriter
 
 //byte[] + read + available + String byte변환(getBytes)
 InputStream => FileInputStream, BufferedInputStream(read, readline)
 OutputStream => FileOutputStream, BufferedOutputStream(read, readline)
  */

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/*
 사용자가 도메인명을 입력합니다
 "이동할 URL을 입력하세요: " 해당 입력된 모든 내용을 url.txt로 저장되도록 합니다.
 이동할 URL을 입력하는 부분은 무한루프. 단 '종료' 입력시 더이상 질문 x
 저장은 d:\\url.txt
  
  */
public class ex25T {
	public static void main(String[] args) {
		new ex25_box().file_write("D:\\","url_T.txt");
	}
}

class ex25_box extends ex_ab{
	@Override
	protected void file_write(String src, String file) {
		super.file_write(src, file);
		System.out.println("입력된 내용이 정상적으로 저장되었습니다.");
	}
}

	
	

