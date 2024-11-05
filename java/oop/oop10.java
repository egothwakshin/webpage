package oop;
// do while문
public class oop10 {

	public static void main(String[] args) {
		int n = 15;
		do{
			System.out.println(n);
			n--;
		}while(n>9);	
		
		/*
		 응용문제
		 do while문으로 1부터 10까지 모두 더한 값을 출력하시오. 		  
		 */
		
		int a = 1;
		int sum = 0;
		do {
			sum += a;
			a++;
		}while(a<=10);
		System.out.println(sum);
		
		/*
		 응용문제
		 구구단 3단에서 짝수들의 모든 합
		 홀수들의 모든 합을 각각 출력하시오. 		  
		 */
		
		int i = 1;		
		int sum_even = 0;
		int sum_odd = 0;
		
		do {
			int result = 3*i;
			if(result % 2 == 0) {
				sum_even += result;
			}
			else {
				sum_odd += result;
			}
			i++;
		}while(i<10);
		System.out.println("짝수 총합: " + sum_even);
		System.out.println("홀수 총합: " + sum_odd);
		
		
		//do while문 무한루프
		int aa = 1;
		do {
			//System.out.println(aa);
			aa++;
		}while(true);		
		
		
		
	}

}
