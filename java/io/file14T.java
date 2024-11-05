package io;

import java.io.File;
import java.io.FileOutputStream;

public class file14T {

	public static void main(String[] args) {
		try {
			String url = "D:\\webpage\\agree\\src\\main\\java\\io\\dan_T.txt";
			File f = new File(url);
			f.createNewFile();
			FileOutputStream os = new FileOutputStream(url);
			int w = 1;
			while(w<10) {
				int sum = 8*w;
				String gugu8 = 8 + " * " + w + " = " + 8*w + "\n";
				byte dan[] = gugu8.getBytes();
				os.write(dan);
				os.flush();
				w++;
			}
			os.close();
		}catch(Exception e) {
			
		}

	}

}
