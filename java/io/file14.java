package io;
/*
 Stream을 이용하여 구구단 8단을 dan.txt 로 저장.
 8 * 1 = 8
 8 * 2 = 16
 ...
 8 * 9 = 72
  
  */

import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class file14 {
	public static void main(String[] args) {
		try {
			//Path data = Paths.get("D:\\webpage\\agree\\src\\main\\java\\io\\dan.txt");
			//Files.createFile(data);
			
			String url = "D:\\webpage\\agree\\src\\main\\java\\io\\dan.txt";
			FileOutputStream os = new FileOutputStream(url, false); //true 필수아님
			int w = 1;
			while(w<10) {
				String gugu8 = 8 + " * " + w + " = " + 8*w + "\n";
				byte dan[] = gugu8.getBytes();		//Stream -> getBytes 단짝친구
				//System.out.println(Arrays.toString(dan));
				os.write(dan);
				os.flush();
				w++;
			};			
			os.close();
			
		}
		catch(Exception e) {
			e.getMessage();
			System.out.println(e);
		}

	}

}
