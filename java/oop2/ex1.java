package oop2;
import java.util.InputMismatchException;
import java.util.Scanner;
//Exception: 예외처리 사용법(오동작 발생)
/*
  1. 사용자의 입력실수로 인한 정보전달이 안될 경우
  2. 개발자가 프로그램 오류시 정확한 오류 파악을 하기 위한 수단
  3. 강제 프로세서에 대한 정보 수정 및 종료
  */
public class ex1 {
	public static void main(String[] args) {
		String a = "2000";
		double b;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요: ");
		try {		//try: 프로세서를 진행
			b = Integer.parseInt(a) / 3;	
			System.out.println(b);		
			Integer user = sc.nextInt();		
		}
		catch(NumberFormatException nfe) {
			System.out.println("문자를 숫자로 변경되는 사항 오류발생!!");
		}  
		catch(InputMismatchException ime) {
			System.out.println("숫자를 입력하셔야 합니다.");
		}		
		catch(Exception e) {	//catch는 try에서 문제발생시 해당 문법이 발동
			System.out.println(e);
		}
		sc.close();
	}
}
