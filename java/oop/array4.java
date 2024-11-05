package oop;

import java.util.Arrays;

// 2차 원시배열
public class array4 {

	public static void main(String[] args) {
		String user[][] = {
				{"홍길동", "이순신", "유관순"},
				{"100", "88", "75"}				
		};
		//System.out.println(user[1][1]);
		
		int gp = user.length;	// '그룹' 개수 = 2
		//System.out.println(gp);
		int ea = user[0].length;	// 해당 그룹의 '데이터' 개수 = 3
		//System.out.println(ea);
		
		// ★ 중요 ★ 원리 이해하기!
		int f,ff;
		for(f=0; f<ea; f++) {		//ea=3	// 큰반복문 ->데이터개수 그룹갯수0~1 반복을 0~3번 반복.
			for(ff=0; ff<gp; ff++) {	//gp=2	// 작은반복문 ->그룹개수 0~1 반복
				System.out.println(user[ff][f]);
			}
		}
				/*
				0 0
				1 0

				0 1
				1 1

				0 2
				1 2
				*/
			
		
		
		int adata[][] = new int[2][2];
		adata[0][0] = 50;
		adata[0][1] = 100;
		adata[1][0] = 200;
		adata[1][1] = 500;
		System.out.println(Arrays.toString(adata));	// Arrays.toString : 1차배열에서 씀. 특수문자 (암호화 적용)
		System.out.println(Arrays.deepToString(adata));	// Arrays.deepToString : 2차배열부터 정상적으로 데이터를 출력
	
	}

}
