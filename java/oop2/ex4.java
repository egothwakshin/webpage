package oop2;

import java.util.Scanner;
//예외처리 응용편(reload)
public class ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입금할 금액을 입력하세요: ");
		try {
			int money = sc.nextInt();
			System.out.println("정상적으로 입금이 완료되었습니다.");
		}
		catch(Exception e){
			System.out.println("숫자만 제발 입력하세요.");
			
			//해당 클래스와 메소드를 재실행
			//ex4 ex = new ex4();
			//ex.main(args);
			new ex4().main(args); //위 두줄코드를 한줄로 줄임
		}
		finally {
			sc.close();
		}
	}

}
