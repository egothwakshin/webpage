package exam;

import java.util.Scanner;

/*
 응용문제2
 다음 키오스크 메뉴형태에 맞춰서 주문하는 시스템 프로세서를 제작하게 됩니다.
 다음 결과에 맞춰서 결과가 출력되도록 하세요 (조건 : 외부 class 사용)
 
  [키오스크] - 2 입력시
  메뉴선택 : 1.커피 2.햄버거 3.콜라 4.피자
  "햄버거를 신청하였습니다."
  그 외 번호 입력시
  "해당 메뉴는 SOLD OUT 입니다."

  */
public class exam2 {

	public static void main(String[] args) {
		
		new exam2_box().abc();
		

	}

}

class exam2_box{
	
	Scanner sc = null;
	
	public void abc() {
		
		this.sc = new Scanner(System.in);
		
		System.out.println("[키오스크]\n<메뉴> 1.커피 2.햄버거 3.콜라 4.피자\n메뉴를 선택해주세요 : ");
		int menu = sc.nextInt();
		
		switch(menu){
		case 1:
			System.out.println("커피를 신청하였습니다.");
			break;
		case 2:
			System.out.println("햄버거를 신청하였습니다.");
			break;
		case 3:
			System.out.println("콜라를 신청하였습니다.");
			break;
		case 4:
			System.out.println("피자를 신청하였습니다.");
			break;
		default:
			System.out.println("해당 메뉴는 SOLD OUT입니다.");
			break;
		}
		sc.close();
		
		
	}
}