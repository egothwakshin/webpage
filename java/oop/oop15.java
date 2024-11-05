package oop;

import java.util.Scanner;

//Scanner 사용시 next, nexLine 오류발생 원인
public class oop15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a, b;
		System.out.println("고객명을 입력하세요 : ");
		//a = sc.nextLine();
		a = sc.next();
		System.out.println("이메일을 입력하세요 : ");
		//b = sc.next();		
		b = sc.nextLine();	//문제 발생!
		System.out.println(a + " / " + b);
		
		// nextLine -> next 순서로 적용할 때는 이상 없음
		/*
		 next -> nextLine 순서로 적용할 때 문제가 발생!!
		 next 는 입력하면 개행이 안되고 바로 붙어버리기 때문에
		 그 후 개행해서 출력되는 nextLine을 쓸 수가 없음. 
		 */
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("연락처를 입력하세요 : ");
		String tel = sc2.next();
		System.out.println(tel);
		
		sc2.close();
		sc.close();
		//라이브러리 닫을 때 '역순'으로 닫는다. 먼저 오픈한거 나중에 클로즈.
		
	}	
	
}


