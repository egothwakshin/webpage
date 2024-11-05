package exam;

import java.util.Scanner;
/*
응용문제8 - 외부 클래스 사용
사용자가 메뉴와 갯수를 입력하면
총 결제금액을 출력하는 프로세서를 작성하시오
(메뉴 및 가격 배열 형태는 자유입니다)

[메뉴 배열 및 1EA 가격]
1. 콜라 - 3000
2. 커피 - 1500
3. 아이스크림 - 500

[메뉴선택]
1.콜라. 2.커피. 3아이스크림 : 1
해당메뉴의 갯수를 입력하세요 : 5
총 결제금액: 15000
  */
public class exam8 {
	public static void main(String[] args) {
		new exam8_box().abc();
	}
}

class exam8_box{
	
	Scanner sc = null;
	
	public void abc() {
		sc = new Scanner(System.in);
		
		String aa[][] = {
				{"콜라","커피","아이스크림"},
				{"3000","1500","500"}
		};
		
		System.out.printf("[메뉴선택]\n1.%s 2.%s 3.%s%n", aa[0][0],aa[0][1],aa[0][2]);
		int no = sc.nextInt();
		
		int price= Integer.parseInt(aa[1][no-1]);
		System.out.println("해당 메뉴의 갯수를 입력하세요 : ");
		int ea = sc.nextInt();
		System.out.println("총 결제 금액: " + price*ea);		
		sc.close();		
	}
}
