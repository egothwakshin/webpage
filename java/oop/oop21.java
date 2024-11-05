package oop;

import java.util.Scanner;

//더블반복문을 이용한 코드 테스트
/*
  응용문제
  다음 코드를 작성하시오.
  사용자가 입력하는 첫번째 값 : 2
  사용자가 입력하는 두번째 값 : 5
  [결과]
  2 x 2 = 4
  2 x 3 = 6
  2 x 4 = 8
  2 x 5 = 10
  
  3 x 3 = 9
  3 x 4 = 12
  3 x 5 = 15
  
  4 x 4 = 16
  4 x 5 = 20
  
  5 x 5 = 25
  
  */



public class oop21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 값을 입력하세요 : " );
		int aa = sc.nextInt();
		System.out.println("두번째 값을 입력하세요 : " );
		int bb = sc.nextInt();
		
		oop21_box op21 = new oop21_box();
		op21.abc(aa, bb);
		sc.close();

	}

}


class oop21_box{
	public void abc(int x, int y) {
		int f;
		for( f=x; f<=y; f++) {
			int ff=f;
			while(ff<=y) {
				System.out.println(f + " x " + ff + " =" + f*ff);
				ff++;
			}
		}
		
	}
}
