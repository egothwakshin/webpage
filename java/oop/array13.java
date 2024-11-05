package oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 응용편
 다음 배열 데이터를 이용하여 결과와 동일하게 출력되도록 코드를 작성하시오.
 
 1번 데이터 : 100, 55, 67, 90, 13, 7
 2번 데이터 : 9, 16, 22, 31
 
 [결과]
 [100, 90, 67, 55, 31, 22, 16, 13, 9, 7]
 */


public class array13 {

	public static void main(String[] args) {
		Integer a[] = {100, 55, 67, 90, 13, 7};
		Integer b[] = {9, 16, 22, 31};
		
		ArrayList<Integer> aa = new ArrayList<Integer>(Arrays.asList(a));
		ArrayList<Integer> bb = new ArrayList<Integer>(Arrays.asList(b));
			
		
		int w = 0;
		while( w< b.length) {
			aa.add(b[w]);     //방법① 클래스배열aa에 원시배열b데이터 추가
			//aa.add(bb.get(w)); 	//방법② 클래스배열aa에 클래스배열bb데이터 추가
			w++;
		}
		//aa.addAll(bb);	//addAll : 위 반복문 과정을 한줄로 끝내는 코드.		
		System.out.println(aa);		
		Collections.sort(aa, Collections.reverseOrder());	
		System.out.println(aa);
		
		/*
		ArrayList<Integer> aa = new ArrayList<Integer>(Arrays.asList(a));
		ArrayList<Integer> bb = new ArrayList<Integer>(Arrays.asList(b));
					
		ArrayList<Integer> nn = new ArrayList<Integer>();
		
		int f,ff;
		for(f=0; f<a.length; f++) {
			nn.add(a[f]);
		}
		for(ff=0; ff<b.length; ff++) {
			nn.add(b[ff]);
		}
		
		Collections.sort(nn,Collections.reverseOrder());
		System.out.println(nn);
		  */
		
		/*
		 응용문제
		 다음 배열 데이터를 확인 후 홀수 데이터만 출력을 해야 합니다.
		 단, 홀수 데이터를 올림차순 정렬로 결과가 출력되도록 코드를 작성하시오.
		 
		 10,16,9,7,31,45,27,94,86,87,112,100,3
		  
		 [결과]
		 3,7,9,27,31,45,87
		  
		 힌트)
		 add, 클래스배열 활용	
		  */
		

	}

}
