package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

//이미지(binary) - Stream
/*
 Stram 유의사항
 1. byte[] (바이트배열) 변환 
 2. InputStream -> read (읽어드림) 해야함
 3. write
  */
public class file15 {
	public static void main(String[] args) {
		try {
			
			/*
			String img = "D:\\webpage\\agree\\src\\main\\java\\io\\img.png";
			FileInputStream fs = new FileInputStream(img); 	//파일을 로드
			System.out.println(fs.available());	//fs.available : 이미지 용량
			byte[] by = new byte[fs.available()];	//이미지 용량 byte
			fs.read();	//해당 이미지 읽은 후 캐시메모리에 저장
					
			//복사 이미지(반복문없이 처리)
			String cpimg = "D:\\webpage\\agree\\src\\main\\java\\io\\"; //복사할 이미지
			FileOutputStream os = new FileOutputStream(cpimg+"img2.png");
			os.write(by);	//복사 시행		
			os.flush();
			os.close();	
			*/
		
			
			//반복문으로 progress 구현
			String img = "D:\\webpage\\agree\\src\\main\\java\\io\\img.png";
			FileInputStream fs = new FileInputStream(img); 	//파일을 로드
			byte[] by = new byte[fs.available() / 100];	//이미지 용량 byte
			fs.read();	//해당 이미지 읽은 후 캐시메모리에 저장
			
			String cpimg = "D:\\webpage\\agree\\src\\main\\java\\io\\"; //복사할 이미지
			FileOutputStream os = new FileOutputStream(cpimg+"img2.png");
			
			int i = 0;	//읽은 바이트 수
			int check = 0;	//읽은 횟수
			while(true) {				
				i = fs.read(by);	//byte 이므로 숫자. 총용량/100 단위로 읽어들임.
				if(i == -1) {		// -1 : 더이상 읽을 내용이 없을 경우
					break;
				}
				else {
					os.write(by, 0, i);	//해당 byte만큼 지속적으로 이미지 조합(byte객체명,0부터시작,읽은byte수)
				}
				check++;
				if(check % 2 == 0) {	// progress 현재상황
					System.out.println(check + "%");
					if(check == 50) {
					System.out.println(check + "%");
					break;
					}
				}
			}
			os.flush();
			os.close();
			fs.close();
			
		}catch(Exception e) {
			e.getMessage();
		}

	}

}
