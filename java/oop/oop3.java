package oop;

//클래스와 메소드의 형태
public class oop3 { // public class : 한개의 파일당 한번만 사용가능
//pubilc class 이름과 파일명이 동일 즉 예시) public class oop3 => oop3.java

	public static void main(String[] args) {
		// public class 안에서만 사용하는 메인(실행) 메소드
		box star1 = new box(); // 객체 인스턴스 = 클래스
		/*
		 * 클래스 new box()
		 * 객체 box
		 * 인스턴스 aaa
		 */
		star1.abc(); // 해당 클래스(box)의 abc메소드 호출
		star1.bbb(); // 해당 클래스(box)의 bbb메소드 호출

		box2 star2 = new box2();
		star2.kkk();
		
	}
}

//외부 class 선언

class box {

	public void abc() {
		System.out.println("외부 클래스 및 메소드 데이터 호출!!");

	}

	public void bbb() {
		System.out.println("bbb메소드 데이터 호출!!");
	}
}

class box2 {

	public void kkk() {
		System.out.println("kkk메소드 호출!!");
	}
}