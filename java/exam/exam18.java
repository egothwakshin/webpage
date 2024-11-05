package exam;

import java.util.Scanner;

/*
 응용문제7) 정규식코드 활용
 다음 아이디를 생성시 예외처리를 이용하여 올바른 값이 배열(Object)에 저장되도록 합니다.
 
 아이디를 입력하세요:
 휴대폰 뒷자리를 입력하세요: 
 
 [결과]
 1.한글 사용시 "아이디는 영문자 + 숫자만 사용가능합니다."
 2.미입력시 "아이디를 입력하셔야 합니다." -> 아이디를 입력하세요:
 3.휴대폰 뒷자리가 숫자 외 문자가 입력될 경우 배열에 0으로 입력되도록 함.
 
 */
public class exam18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력하세요: ");
		Integer user = sc.nextInt();
		System.out.println(String.valueOf(user).length());
		
	}
}
