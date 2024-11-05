package oop;

import java.util.Scanner;

// 선택문 switch ~ case
public class switch1 {

	public static void main(String[] args) {
		String ck = "5";		//선택한 값이며, 자료형에 따라 switch case의 자료형이 정해짐
		switch(ck) {
			
			case "1":
			case "5":
			//멀티 case 사용
			System.out.println("1번을 선택 하셨습니다.");
			break;
			case "2":
			System.out.println("2번을 선택 하셨습니다.");
			break;
			 
			default:	//case에 선택사항이 없을 경우 default가 작동
			System.out.println("기타를 선택 하셨습니다.");
			break;
		}
		
		/*
		 Scanner 이용
		 "결제방법을 선택해주세요 : "
		 1 : "신용카드로 결제 합니다."
		 2 : "휴대폰으로 결제 합니다."
		 3 : "무통장 입금 결제 합니다."
		 그 외 기타 : "결제를 취소합니다."
		  */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("결제방법을 선택해주세요 : ");
		int aa = sc.nextInt();
		
		switch(aa){
			case 1:
				System.out.println("신용카드로 결제 합니다.");
				break;				
			case 2:
				System.out.println("휴대폰으로 결제 합니다.");
				break;				
			case 3:
				System.out.println("무통장 입금 결제 합니다.");
				break;
			default:
				System.out.println("결제를 취소합니다.");
				break;							
		}
	
	}

}

