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
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/*
 사용자가 도메인명을 입력합니다
 "이동할 URL을 입력하세요: " 해당 입력된 모든 내용을 url.txt로 저장되도록 합니다.
 이동할 URL을 입력하는 부분은 무한루프. 단 '종료' 입력시 더이상 질문 x
 저장은 d:\\url.txt
  
  */
public class ex25 {
	public static void main(String[] args)  {
		try {
		new ex25_mybox().abc();
		}
		catch(Exception e) {
			e.getMessage();
		}
	}
}


class ex25_mybox{
	
	
	String url = "D:\\url_my.txt";
	FileWriter fw = null;
	Scanner sc = null;
	
	public void abc() throws Exception {
		try {				
			this.fw = new FileWriter(this.url, true);
			while(true) {		
			System.out.println("이동할 URL을 입력하세요: ");
			this.sc = new Scanner(System.in);
			String str = this.sc.nextLine();
				if(str.equals("종료")) {
					break;
				}
				else {			
					this.fw.write(str + "\n");
				}
		}
			
	}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
			fw.close();
			
		}
	}
}
