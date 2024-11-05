package oop;

import java.util.Scanner;

/*
 응용문제
 Scanner 라이브러리를 활용하여 다음 코드를 작성하시오.
 사용자가 다음과 같이 입력합니다.
 "첫번째 숫자를 입력하세요 : "
 "두번째 숫자를 입력하세요 : "
 [결과]
 두 숫자의 합은 ?? 입니다.
  
  */
public class oop16 {

	public static void main(String[] args) {
		oop16_box op16 =  new oop16_box();
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요 : ");
		int aa = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요 : ");
		int bb = sc.nextInt();
			
		op16.plus(aa, bb);

	}

}

class oop16_box{
	public void plus(int x, int y) {
		System.out.println("두 숫자의 합은 " + (x+y) + " 입니다.");
		
	}
	
}
