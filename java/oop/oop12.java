package oop;
//더블반복문
public class oop12 {

	public static void main(String[] args) {
		
		int a,b;
		//구구단 풀버전
		for( a=2; a<=9; a++) {
			for( b=1; b<=9; b++) {
			//System.out.println(a + " x " + b + " = " + a*b);					
			}
		}
		
		//5단~7단
		int w = 5;
		//int ww = 1;     ★중요★안쪽반복문 변수는 안쪽에 선언해야함
		while(w<=7) {
			int ww = 1;	// ★중요★ 안쪽반복문의 변수 초기화!!
			while(ww<=9) {
				//System.out.println(w + " x " + ww + " = " + w*ww );
				ww++;
			}
			w++;
		}
		
		//9단~5단 역순 출력
		int r = 9;
		do {
			int rr = 1;
			
			do {
				//System.out.println(r + " x " + rr + " = " + r*rr);				
				rr++;
			}while(rr<=9);		
			
			r--;
		}while(r>=5);
		
		/*
		 응용문제
		 구구단 6단~9단에서 모든 홀수의 총 합계를 출력하시오.
		 for문 do~while문 	  	  
		  */
		
		int k;
		int sum = 0;
		for( k=6; k<=9; k++) {
			int kk = 1;
			do {
				if( k*kk % 2 != 0) {
					sum += k*kk;
				}
				kk++;
			}while(kk<=9);
		}
		//System.out.println(sum);
		
		/*
		 구구단 홀수단만 출력하시오.
		 do~while문, while문  
		  */
		
		int z = 2;
		do {
			int zz = 1;
			if(z % 2 != 0) {
				while(zz<=9) {
					System.out.printf("%d x %d = %d%n", z, zz, z*zz);
					zz++;
				}
			}
			z++;
		}while(z<=9);
	
		
	}

}
