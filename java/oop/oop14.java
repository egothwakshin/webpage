package oop;

import java.util.Scanner;
/*
응용편
사용자 아이디 및 패스워드를 입력하는 코드를 작성하시오.
단, 샘플 데이터로 hong / a1234 일 경우  "로그인 하셨습니다 "
패스워드가 틀릴경우 " 아이디 및 패스워드를 확인하세요
그 외 아이디가 틀릴경우 " 가입되지 않은 사용자입니다.
*/
public class oop14 {

	public static void main(String[] args) {
		oop14_box op14 = new oop14_box();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요 : ");
		String mid = sc.next();
		System.out.println("패스워드를 입력하세요 : ");
		String mpw = sc.next().intern();
		//.intern() 메소드는 조건문 안에 문자열에 대해 '연산기호'를 쓰기 위해 적용함. 
		// 숫자는 intern 메소드 사용 안해도 됨.
		op14.login(mid, mpw);
		
		sc.close();
		
	}
}

class oop14_box {
	
	public void login(String aaa, String bbb) {
		if(aaa.equals("hong")) {	// 연산기호를 쓸수 없음. equals 메소드 이용
			if(bbb == "a1234") {	//.intern()이 적용되어 '연산기호'를 쓸 수 있음!
				System.out.println("로그인 되셨습니다!");
			}else {
				System.out.println("패스워드가 올바르지 않습니다.");
			}
		}else {
			System.out.println("가입되지 않은 아이디입니다.");
		}
		
		
	}
}


