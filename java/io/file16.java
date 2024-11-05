package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 D드라이브에 product디렉토리 상품 4개의 이미지가 있습니다.
 해당 이미지를 upload라는 디렉토리에 복사되도록
 코드를 작성하시오. 
  */
public class file16 {
	public static void main(String[] args) {
		try {
			FileInputStream fs = null;
			FileOutputStream os = null;
			
			for(int f=1; f<=4; f++) {
			String pd = "D:\\product\\pd" + f + ".jpg";
			fs = new FileInputStream(pd);
			byte[] by = new byte[fs.available()];
			fs.read(by);

			String copy_pd = "D:\\upload\\";
			os = new FileOutputStream(copy_pd+"copy_pd" + f + ".jpg");
			os.write(by);
			os.flush();
			}
			os.close();
			fs.close();
			
		}catch(Exception e) {
			e.getMessage();
		}
	}
}
