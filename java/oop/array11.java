package oop;

import java.util.ArrayList;
import java.util.Arrays;

// 원시배열을 클래스 배열로 변환
public class array11 {
	public static void main(String[] args) {
		// Arrays.asList: 원시 배열값을 클래스로 변환하는 메소드
		Integer data[] = {10, 20, 30, 40, 50};
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(data));
		//ArrayList<String> al = new ArrayList<String>(); 클래스배열(빈배열) 선언
		System.out.println(al);
		al.add(60);
		al.add(70);
		al.add(80);
		System.out.println(al);
		
		// 반복문
		String arr[] = {"홍길동", "유관순"};
		ArrayList<String> al2 = new ArrayList<String>(Arrays.asList(arr));
		System.out.println(al2);
		al2.add("HTML&CSS");
		al2.add("Javascript 기초");
		al2.add("Java OOP");
		System.out.println(al2);
		System.out.println(al2.size());
		
		// 반복문을 이용한 데이터 출력
		int w = 0;
		while( w < al2.size()) {
			System.out.println(al2.get(w));
			w++;
		}
		al2.set(1, "Ajax기초");	// 해당 배열번호의 데이터 수정
		System.out.println(al2);
	}

}
