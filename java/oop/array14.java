package oop;

import java.util.ArrayList;

//2차 원시배열 => class 배열로 변환
public class array14 {

	public static void main(String[] args) {
		ay14_box ay = new ay14_box();
		ay.abc();

	}

}

class ay14_box {

	public void abc() {
		int a[][] = { 
			{ 10, 20, 30 }, 
			{ 100, 200, 300 } 
		};
		
		// 2차배열 빈 값
		ArrayList<ArrayList<Integer>> al2 = new ArrayList<ArrayList<Integer>>();
		
		
		
		int w = 0;
		while( w < a.length) {	//2
			// 1차배열 빈 값. 반복문이 한번 실행할 때마다 새롭게 1차 빈배열이 생성됨.
			ArrayList<Integer> al = new ArrayList<Integer>();
			int ww = 0;
			while(ww< a[0].length) {	//3
				al.add(a[w][ww]);	// 1차배열에 값을 반복문으로 삽입
				ww++;
			}
			al2.add(al);	// 1차 클래스배열의 전체묶음을 -> 2차 빈배열에 삽입

		w++;
		}
		System.out.println(al2);
		
		
		System.out.println(al2.get(1));
		System.out.println(al2.get(1).get(2));	//get을 이용해서 그룹,데이터 출력
		
		
		
		

		
		
	}
}