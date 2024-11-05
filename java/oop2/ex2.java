package oop2;

import java.util.Scanner;

//예외처리 중 finally 사용법
public class ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사용자 이름을 입력해주세요: ");
		try {
			String username = sc.nextLine().intern();
			if(username.equals("") || username.equals(null)) {	//입력란에 그냥 Enter치면 "" 빈문자열로 인식함
				System.out.println("미입력");
			}
			else {
				System.out.println("입력완료");
				System.out.println("연락처를 입력하세요(단 '-'없이 사용): ");
				Integer tel = sc.nextInt();
				System.out.println(tel); 
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		/*
		 finally : try로 정상작동되든, 예외처리 catch로 넘어가든, 무조건 실행됨.
		 finally 작성은 선택사항
		 */
		finally {	
			System.out.println("실행");
			sc.close();
		}
	}
}
