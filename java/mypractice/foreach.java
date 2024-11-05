package mypractice;
import java.util.ArrayList;
import java.util.Arrays;

public class foreach {

	public static void main(String[] args) {
		String arr[] = {"홍길동","유관순","강감찬"};
		System.out.println(arr);
		
		for( String str : arr) {
			System.out.println(str);
		}
	}
}
