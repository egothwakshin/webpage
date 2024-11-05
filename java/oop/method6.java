package oop;

import java.util.Scanner;

/*
응용문제.
외부 클래스를 이용하여 사용자가 하나의 숫자값을 입력합니다.
입력된 값이 짝수인지 홀수인지를 확인하는 return 메소드 코드를
작성하시오.
[결과]
"숫자 하나를 입력하세요 : 27 "
"입력하신 숫자는 홀수입니다."
*/
public class method6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 하나를 입력하세요 : ");
		int aa = sc.nextInt();		
		
		mth6_box mth6 = new mth6_box();
		String result = mth6.abc(aa);
		System.out.println("입력하신 숫자는 "+ result + " 입니다.");
		
		sc.close();
		

	}

}

class mth6_box{
	public String abc(int x) {
		String str;
		if( x % 2 == 0) {
			str = "짝수";
		}
		else {
			str = "홀수";
		}
		
		return str;		
	}
}


