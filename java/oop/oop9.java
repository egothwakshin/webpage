package oop;
// while문 
public class oop9 {

	public static void main(String[] args) {
		
		int w = 1;
		while(w<10) {
			//System.out.println(w);
			w++;
		}
		
		/*
		 응용문제
		 while문과 if문을 이용하여
		 구구단 6단을 출력합니다.
		 단, 40이상이 되었을 경우 강제로 반복문이 종료되도록 합니다.
		  */
		
		int i = 1;
		int result = 0; // 전역변수로 선언
		while(i<10) {
			result = 6 * i;
			if( result >= 40 ) {
				break;
			}
			else {
				System.out.println(6 + " x " + i + " = " + result );
			}
			
			i++;
		}
		
		//while문 무한루프
		int aa = 1;
		while(true) {
			System.out.println(aa);
			aa++;
		}

	}

}
