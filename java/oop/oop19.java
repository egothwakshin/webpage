package oop;

import java.util.Scanner;

/*
 반복적으로 사용자에게 질문을 던지는 코드(반복문+Scanner)
 응용문제
 
 총 입금 금액은 10만원입니다.
 3번의 출금을 합니다.
 출금 후 잔액을 표시하는 코드를 작성하시오.
 단, 총 입금 금액보다 클 경우
 "잔액보다 큰 금액을 출금하실 수 없습니다." 메세지를 출력합니다.
 
  */
public class oop19 {

	public static void main(String[] args) {
		bank fff = new bank();
		
		fff.kakao();

	}

}

class bank{
	public void kakao() {
		
		Scanner sc = new Scanner(System.in);
		
		int f;
		int total = 100000;
		for( f=1; f<=3; f++) {
			
			System.out.printf("출금할 금액을 입력하세요(%d회/3회)%n", f);
			int pp = sc.nextInt();
			if( total < pp ) {
				System.out.println("잔액보다 큰 금액을 출금하실 수 없습니다.");
				
			}
			else {
				//total = total - pp;
				total -= pp;
				System.out.println("현재 잔액은 " + total + "원 입니다.");
			}
			
		}
		System.out.println("총 금액은 " + total + "원 입니다.");
		sc.close();

		
	}

}
