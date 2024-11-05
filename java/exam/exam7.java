package exam;

import java.util.ArrayList;

/*
 응용문제7 - 외부 class 미사용
 다음 원시배열 기준으로 class 배열을 활용하여
 다염 결과가 나오도록 데이터값을 분리하시오. (class 배열 -ArrayList)
 
 60,39,42,7,93,26,38,41,9,12,71
 
 짝수 클래스 배열 : 60,42,26,38,12
 홀수 클래스 배열 : 39,7,93,41,9,71
  
  */
public class exam7 {

	public static void main(String[] args) {
		
		int arr[] = {60,39,42,7,93,26,38,41,9,12,71};
		ArrayList<Integer> al_even = new ArrayList<Integer>();
		ArrayList<Integer> al_odd = new ArrayList<Integer>();
		
		int w = 0;
		while(w<arr.length) {
			if(arr[w] % 2 == 0) {
				al_even.add(arr[w]);
			}
			else {
				al_odd.add(arr[w]);
			}
			w++;
		}
		System.out.println(al_even);
		System.out.println(al_odd);
		
		

	}

}


