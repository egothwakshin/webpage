package oop;

import java.util.ArrayList;
import java.util.Arrays;

//공지사항 부분 - datalist.java (원시배열 + ArrayList(클래스))
//즉시 실행 메소드
public class notice {

	public static void main(String[] args) {
		
		datalist dl = new datalist();
		notice_list nt = new notice_list();
		String arr[][] = dl.notice();
		
		ArrayList<ArrayList<String>> al = new ArrayList<ArrayList<String>>();
		
		int f;
		for(f=0; f<arr.length; f++) {
			al.add(nt.abc(arr[f]));			
		}
		System.out.println(al);
		
		
	}

}

class notice_list{

	public ArrayList<String> abc(String data[]){
		
		ArrayList<String> all = new ArrayList<String>(Arrays.asList(data));
	return all;	
	}
}
