package oop;

import java.util.Scanner;

public class method4 {

	public static void main(String[] args) {
		mth4_box mth4 = new mth4_box();
		int call = mth4.gugu(1, 10);
		System.out.println(call);
		
		
		/*
		 응용문제
		 사용자명에 따라 회원등급을 반환하는 return 코드를 작성하시오.
		 홍길동 => 일반회원
		 이순신 => 실버회원
		 유관순 => VIP 회원
		 강감찬 => 비회원 		  
		  */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("사용자명을 입력하세요 : ");
		String user_name = sc.next();		
		String user_grade = mth4.grade(user_name);
		System.out.println(user_grade);
		
		sc.close();

	}

}

class mth4_box{
	public int gugu(int a, int b) {
		int sum = 0;
		while(a<=b) {		// a부터 b까지의 합계
			sum += a;
			a++;
		}
		return sum;			// return 은 하나의 변수에만 사용가능
	}
	
	// return 자료형 메소드에서 인자값은 문자, 숫자, 실수 모든 자료형 쓸 수 있음
	// 단, 반환할 값은 메소드에 맞는 자료형만 적용 가능!!

	public String grade(String name) {
		String grade;
		switch(name) {
		case "홍길동":
			grade = "일반회원";
			break;
		case "이순신":
			grade = "실버회원";
			break;
		case "유관순":
			grade = "VIP회원";
			break;
		case "강감찬":
		default:
			grade = "비회원";
			break;
		}
		return grade;
	}
	
}