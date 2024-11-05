package oop;

import java.util.Scanner;

//Scanner + 반복문
public class oop17 {
	public static void main(String[] args) {
		//oop17_box op17 = new oop17_box();
		//op17.abc();
		
		/*
		 응용문제
		 외부클래스(product), 메소드(product_cal)을 이용하여 코드를 작성하시오.
		 "사용할 포인트 금액을 입력하세요 : "
		 포인트 입력 후 상품금액에서 사용한 포인트를 뺀
		 최종 결제금액을 출력합니다.
		 상품금액: 50000
		 
		 [결과]
		 45000		  
		  */
		products kkk = new products();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("사용할 포인트 금액을 입력하세요 : ");
		int point = sc.nextInt();
		kkk.product_cal(point);
		
		sc.close();
	}
}

class oop17_box{
	public void abc() {
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 구구단의 숫자를 입력하세요 : ");;
		int no = sc.nextInt();
		int f;
		for( f=1; f<10; f++) {
			System.out.printf("%d x %d = %d%n", no, f, no*f);
			
		sc.close();
		}		
	}	
}

class products{
	public void product_cal(int p) {
		int product_price = 50000;
		System.out.println("상품의 최종 결제금액은 " + (product_price - p) + "원 입니다.");
	}
}
