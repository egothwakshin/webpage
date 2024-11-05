package oop;
/*
 * 응용문제1.
 외부 class를 이용하여 다음 결과를 출력하는 코드를 작성하시오.
 숫자 33, 41, 81 를 모두 곱하여 해당 결과값이
 짝수인지 홀수인지를 출력하시오.
 */
public class oop7 {

	public static void main(String[] args) {
		oop7_box quiz = new oop7_box();
		quiz.cal(33, 41, 81);
		
	}

}

class oop7_box{
	
	public void cal(int x, int y, int z) {
		int multiple = x * y * z; 
		if ( multiple % 2 == 0) {
			System.out.println("결과값은 짝수입니다.");
		}
		else {
			System.out.println("결과값은 홀수입니다.");
		}
		
	}
}