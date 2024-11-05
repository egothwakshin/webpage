package oop;

//import: 외부 클래스 또는 라이브러리를 가져올 때 출력되는 코드
import java.util.Scanner;

//java에서 기본적으로 제공되는 Scanner를 이용합니다. (라이브러리 사용)
public class oop13 {

	public static void main(String[] args) {
		//사용자가 입력하는 가상의 입력창
		Scanner sc = new Scanner(System.in); //System.in : 데이터값 입력
		System.out.println("아이디를 입력하세요 : ");
		String mid = sc.next();	
		//사용자가 입력한 값을 변수 mid에 적용
		System.out.println(mid); //사용자가 입력한 값(mid)을 출력하는 코드
		
		/*
		 next()는 빈공간 입력사항에 대해서 단어 전체를 받지 못함
		 nextLine()은 빈공간과 관계없이 데이터를 인식함
		*/
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.println(age);
		
		System.out.println("이메일을 입력하세요 : ");
		String email = sc.next();
		System.out.println(email);
		
		sc.close(); //라이브러리 종료
	}


}


