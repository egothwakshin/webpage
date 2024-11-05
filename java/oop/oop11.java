package oop;
//반복문을 이용한 응용편
public class oop11 {

	public static void main(String[] args) {
		/*
		 응용문제
		 무한루프를 이용하여 50이하까지만 반복문이 작동되면
		 1~50까지 모든 합계를 출력하는 반복문을 작성하시오.
		 While문 이용	 
		 */
		
		int a = 1;
		int sum = 0;
		while(true) {
			sum += a;
			if(a == 50) {
				break;
			}
			//sum += a;		(a=50 일 때 합계에 반영 안됨!)			
		a++;	
		}
		//System.out.println(sum);
		
		/*
		 응용문제2
		 무한루프 반복문 안에서
		 70부터 79까지의 합계를 출력하시오.
		 do while문 	  
		  */
		
		int n = 1;
		int total = 0;
		
		do {
			if(n>79) {
				break;
			}
			else if(n>=70) {
				total += n;
			}
			n++;
		}while(true);
		System.out.println(total);


	}

}
