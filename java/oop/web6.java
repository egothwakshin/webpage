package oop;

import java.util.ArrayList;
import java.util.LinkedList;

//ArrayList와 LinkedList 데이터 속도처리 차이
/*
 ArrayList : 순차적으로 데이터를 읽기 또는 쓰기 할 경우 빠름
 LinkedList : 이미 데이터가 있는 상황에서 추가로 데이터를 중간에 삽입할 때 빠름 
  */
public class web6 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();	//시작시간
		ArrayList<Integer> data1 = new ArrayList<Integer>();
		LinkedList<Integer> data2 = new LinkedList<Integer>();
		
		int w = 0;
		do {
			data1.add(w);
			data2.add(w);
			w++;
		}while(w<=1000000);
		
		int ww = 0;
		int no = 0;
		do {
			data1.add(no,ww);
			data2.add(no,ww);
			ww++;
			no++;
		}while(ww<=5000);
		


		long end = System.currentTimeMillis();		//종료시간
		long result = end - start;		//최종 결과 시간
		System.out.println(result);

	}

}






