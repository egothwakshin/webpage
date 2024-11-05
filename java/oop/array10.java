package oop;

import java.util.ArrayList;

//클래스 ArrayList배열
public class array10 {
	public static void main(String[] args) {
		ay10_box ay = new ay10_box();
		ay.abc();

	}

}

class ay10_box{
	public void abc() {
		// 문자열 클래스 빈 배열 선언문
		ArrayList<String> al = new ArrayList<String>();
		// add : 배열에 데이터 추가
		// remove : 배열에 데이터 삭제 (단, 데이터 삭제시 배열번호 변경됨)
		// size : 배열의 데이터 개수
		// clear : 배열의 모든 데이터 삭제
		// get: 배열에 있는 데이터값 출력
		al.add("홍길동");
		al.add("강감찬");
		al.add("유관순");
		al.add("이산");
		al.add("이순신");
		System.out.println(al);
		System.out.println(al.get(3));
		al.add("장보고");
		System.out.println(al);
		al.remove(0);
		System.out.println(al);
		int ea = al.size();
		System.out.println(ea);
		al.clear();
		System.out.println(al);
		
		
		// 복사 클래스배열
		// clone : 클래스배열을 복사 (추가,삭제 모두 가능)
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(5);
		al2.add(1);
		al2.add(8);
		System.out.println(al2);
		ArrayList<Integer> al3 = (ArrayList)al2.clone();	// al2배열을 복사하여 al3에 집어넣음
		System.out.println(al3);
		al3.add(10);
		al3.add(20);
		System.out.println(al3);
		
		
	}
}