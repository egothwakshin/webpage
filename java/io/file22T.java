package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class file22T {

	public static void main(String[] args) {
		try {
			new file22_box("info.txt","member.csv");
		}

		catch(IOException ne) {
			System.out.println("");
		}

	}

}

class file22_box{
	private String url = "D:\\webpage\\agree\\src\\main\\java\\io\\";
	private String file_a, file_b;
	private InputStream is = null;
	private OutputStream os = null;
	private OutputStreamWriter osw = null;
	
	public file22_box(String filea, String fileb) throws IOException {
		this.file_a = filea;
		this.file_b = fileb;
		this.filecopy();
	}
	
	private void filecopy() throws IOException {
		try {
			this.is = new FileInputStream(this.url + this.file_a);
			byte data[] = new byte[this.is.available()];
			this.is.read(data);
			String txt = new String(data,"utf-8");
			System.out.println(txt);
			this.os = new FileOutputStream(this.url + this.file_b);
			this.osw = new OutputStreamWriter(os, "euc-kr");	
			//byte data2[] = txt.getBytes();
			//this.os.write(data2);
			//this.os.flush();
			this.osw.write(txt);
			this.osw.flush();
			
		}
		catch(Exception e) {
			//e.printStackTrace();
			e.getMessage();
		}
		finally {
			//this.os.close();
			this.osw.close();
			this.is.close();
		}
	}
	
}
