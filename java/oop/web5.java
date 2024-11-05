package oop;

import java.util.Arrays;
import java.util.LinkedList;

//LinkedList 클래스 배열
public class web5 {

	public static void main(String[] args) {
		Integer a[] = {1,3,5,7,9};	// 원시배열
		//클래스배열 선언
		LinkedList<Integer> ls = new LinkedList<Integer>(Arrays.asList(a));
		System.out.println(ls);
		LinkedList<Integer> ls2 = new LinkedList<Integer>();
		ls2.add(10);
		ls2.add(20);		
		ls2.add(30);
		ls2.add(2,50);	//ArrayList와 동일. 2번자리에 50 삽입
		ls2.remove(0);	 //clear. 0번자리 데이터 삭제
		ls2.set(1, 500);		//1번자리 데이터 500으로 수정
		ls2.push(100);		// 0번자리(맨앞자리)에 100 삽입
		Integer aa = ls2.pop();		//배열 첫번째 값 출력후 배열에서 삭제
		Integer bb = ls2.peek();	//배열 첫번째 값 출력후 배열에서 그대로 보관	
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(ls2);
		
		
		
		

	}

}
