package oop;

import java.util.ArrayList;

//2차배열 -> 2차배열 등록가능 O.K
public class arraylist1 {

	public static void main(String[] args) {
		//1차 배열 값 추가
		ArrayList<String> a = new ArrayList<String>();
		a.add("홍길동");
		a.add("이순신");
		//2차 배열 값 추가
		ArrayList<ArrayList<String>> all = new ArrayList<ArrayList<String>>();
		all.add(a);
		System.out.println(all);
		//2차배열을 2차배열에 받아서 처리
		ArrayList<ArrayList<String>> all2 = all;
		System.out.println(all2);
	}

}
