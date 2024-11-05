package oop;

// 반복문 + 1차 원시배열
public class array2 {

	public static void main(String[] args) {
		Integer data[] = { 10, 20, 30, 40 };
		int ea = data.length; // 배열 데이터의 갯수 = 4
		int f;
		for (f = 0; f < ea; f++) { // 주의★ 배열번호 0부터 시작. f<=ea 가 아니라 f<ea 임!!
			System.out.println(data[f]);
		}
		
		/*
		 해당 배열의 모든 값을 합한 결과값을 출력하시오. 
		  */
		Integer data2[] = {9, 22, 6, 8, 32};
		
		int ea2 = data2.length; //5
		int sum = 0;	
		int ff=0;
		// do while문 이용
		do {
			sum += data2[ff];
			ff++;
		}while(ff<data2.length);
		
		//for문 이용
		/*
		int ff;
		for( ff=0; ff<data2.length; ff++) {
			sum += data2[ff];
		}
		*/
		System.out.println(sum);
	}
}
