package oop2;

import java.util.List;
import java.util.Scanner;

//추상클래스 선언 및 생성. oop_class3.java와 연계
public abstract class ab1 {
	String userid = null;	//추상클래스의 전역변수
	Scanner sc = new Scanner(System.in);	//추상클래스에 라이브러리 호출
	List<String> all = null;
	final int level = 1;	//전역변수 값이 고정으로 필요할 경우 선언
	int kk = 7;
	
	public void ab_method1() {};
	public void ab_method1(String uid) {};
	public void ab_method1(int level) {
		level = kk;
	};

}
