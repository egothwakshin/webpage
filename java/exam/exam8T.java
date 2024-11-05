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
public class exam8T {

	public static void main(String[] args) {
		
		
		
		String product[][] = {
				{"콜라","3000"},
				{"커피","1500"},
				{"아이스크림","500"}			
		};
		
		String menulist = "";
		int w = 0;
		while(w <product.length) {
			menulist = menulist +  (w+1) + "." + product[w][0] + " : " + product[w][1] + "원   ";	
			w++;
		}
		System.out.println(menulist + "\n메뉴를 선택하세요 : ");
		
		new exam8T_box().abc();

	}

}

class exam8T_box{
	
	Scanner sc = null;
	
	public void abc() {
		
		
		String product[][] = {
				{"콜라","3000"},
				{"커피","1500"},
				{"아이스크림","500"}			
		};
		sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int price = Integer.parseInt(product[num-1][1]);
		System.out.println("해당 메뉴의 갯수를 입력하세요 : ");
		int ea = sc.nextInt();
		System.out.println("총 결제 금액: " + price*ea);		
		
		sc.close();
		
	}
}
