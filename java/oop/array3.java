package oop;

import java.util.Arrays;
import java.util.Scanner;

// 반복문 + 1차 원시배열 응용편(금융)
/*
 응용문제
 사용자는 최대 5번 입금할 수 있습니다.
 입금된 내용은 모두 배열에 추가 되어야 하며,
 최종 합계 입금 금액을 출력 되도록 합니다.
 [힌트] Scanner, 배열, 반복문 
 [결과]
 "입금하실 금액을 입력하세요 : (직접입력)"
 x 5
 
 "총 입금한 금액은 ( ) 원 입니다. "
 
  
  */
public class array3 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {		
		/*
		// 응용문제. 내가 작성한 코드
		int f;
		int data[] = new int[5];
		int ea = data.length;
		int sum = 0;
		for(f=0; f<ea; f++) {
			System.out.println("입금하실 금액을 입력하세요(" + (f+1) + "회/5회) : " );
			data[f] = sc.nextInt();
			sum += data[f];
		}
		System.out.println("총 입금한 금액은 " + sum + "원 입니다.");
		sc.close();
		*/
		
		// 응용문제. 선생님이 작성한 코드
		
		Integer money[] = new Integer[5];	// 빈배열. 데이터 갯수 5
		int ea = money.length;	// ea에 5가 저장됨
		int w = 0;
		int total = 0;
		while(w < ea) {
			System.out.println("입금하실 금액을 입력하세요(" + (w+1) + "회/5회) : ");
			money[w] = sc.nextInt();
			total += money[w];
			w++;
		}
		System.out.println(Arrays.toString(money));
		System.out.println("총 입금한 금액은 " + total + "원 입니다.");
		
		sc.close();
		
	}

}
