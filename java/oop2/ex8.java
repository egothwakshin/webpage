package oop2;

import java.util.Scanner;

//try, catch, finally, throws, throw
public class ex8 {	//값을 보내고, 결과값을 받는 코드
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//① throws
		try {
			System.out.println("첫번째 숫자를 입력하세요: ");
			String a = sc.nextLine();
			System.out.println("두번째 숫자를 입력하세요:");
			String b = sc.nextLine();
			Integer result = new bx8_box().files(a, b);
			//②
			//사용자 입력값 전송 및 결과 받음
			System.out.println("결과: " + result);
		}
		catch(NumberFormatException nfe) {
			System.out.println("데이터 전송 오류!");
		}
		catch(Exception e) {	//⑦오류사항 확인
			System.out.println(e);
		}
		finally {	//⑧라이브러리 종료
			sc.close();
		}
	}
}

class bx8_box{	//값을 받고, 산술연산 후 결과값을 보내는 코드
	public Integer files(String aa, String bb) throws Exception {
		int sum = 0;
		try { //③
			sum = Integer.parseInt(aa) + Integer.parseInt(bb); //문자-> 숫자변환 *

		}
		catch(Exception e) {//④ * 실패시
			System.out.println("인자값 숫자변환 오류!");//⑤
			throw e;//⑥ 상대방에게 문제가 되는 "오류사항"을 전송 (상대방의 catch를 작동시킴)
		}
		return sum;
	}
}