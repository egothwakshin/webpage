package oop;

import java.util.Scanner;

//반복적으로 사용자에게 질문을 던지는 코드(반복문+Scanner)
public class oop18 {

	public static void main(String[] args) {
		oop18_box ob = new oop18_box();
		ob.abc();

	}

}

/*
 응용문제
 사용자가 4번 입력한 금액의 합계가 출력되는 코드를 작성하시오.
  */
class oop18_box{
	public void abc() {
		Scanner sc = new Scanner(System.in);
		int w = 1;
		int money;	//사용자가 직접 입력하는 변수
		int zzz = 0;
		while(w<= 4) {
			System.out.println("상품금액을 입력하세요 : ");
			money = sc.nextInt(); //사용자가 입력한 값을 변수로 이관
			zzz += money;
			w++;
		}
		System.out.println("4번 입력한 금액의 총합은 " + zzz + "원 입니다.");
		sc.close();
	}
	
}