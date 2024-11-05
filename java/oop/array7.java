package oop;

import java.util.Arrays;

// 1차 배열 -> 2차배열로 적용
public class array7 {

	public static void main(String[] args) {
		String area[] = {"서울", "경기도", "인천"};		// 1차배열
		String people[] = {"12000", "6500", "3300"};	// 1차배열
		String total[][] = new String[area.length][2];	// 빈 2차배열 생성
		
		int f;		// 1차배열 데이터 갯수(=area.length)만큼 반복
		for(f=0; f<area.length; f++) {
			total[f][0] = area[f];	// 그룹0에 데이터 삽입
			total[f][1] = people[f];	//그룹1에 데이터삽입
		}
		System.out.println(Arrays.deepToString(total));		// 2차배열 생성완료
		
		
		
		/*
		 응용문제
		 <1차 배열 -> 2차배열 변환 응용>
		 
		 
		 {90, 22, 16, 13, 8, 42, 49, 37, 1, 9}
		 해당 1차 배열에 짝수 5개, 홀수 5개가 있습니다.
		 2차 배열로 각각 짝수 그룹, 홀수 그룹으로 나누어서 출력되도록
		 코드를 제작합니다. 
		  */		
		int number[] = {90, 22, 16, 13, 8, 42, 49, 37, 1, 9};
		
		
		int oddeven[][] = new int[2][number.length / 2];		
		
		/*
		//응용문제. 내가 쓴 코드
		int k;
		int even=0, odd=0;		
		for(k=0; k<number.length; k++) {
			if( number[k] % 2 == 0) {
				oddeven[0][even] = number[k];
				even++;
			}
			else {
				oddeven[1][odd] = number[k];
				odd++;
				
			}
		}
		System.out.println(Arrays.deepToString(oddeven));
		*/
		
		
		
		//응용문제. 선생님이 쓴 코드		
		int ct=0, ct2=0;
		int z;
		for(z=0; z<number.length; z++) {
			if(number[z] % 2 == 0) {
				oddeven[0][ct] = number[z];
				ct++;
			}
			else {
				oddeven[1][ct2] = number[z];
				ct2++;
			}
			
		}
		System.out.println(Arrays.deepToString(oddeven));		
		

	}
}
