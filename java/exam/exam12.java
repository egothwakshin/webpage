package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//ArrayList(순서를 유지하는 배열형태), LinkedList(순방향,역방향 검색) => List
//=> List(부모 라이브러리)
/*
응용문제1
{ 1,3,6,9,10 } 의 원시배열 데이터 중 홀수 값을 다음과 같이 모두 변경 합니다. 
(LinkedList 사용)
[결과]
{ 2,4,6,10,10 } 로 변경 
*/
public class exam12 {
	public static void main(String[] args) {
		//new exam12_box().abc(); 내코드
		
		//선생님코드
		Integer arr[] = {1,3,6,9,10};
		List<Integer> data = new LinkedList<Integer>(Arrays.asList(arr));
		int idx = 0;		
		for(Integer a : data) {
			if(a % 2 != 0) {
				System.out.println(a);
				data.set(idx, a+1);
			}
			idx++;
		}		
		System.out.println(data);
		
	}
}

class exam12_box{		
	/*내코드
	Integer a[] = {1,3,6,9,10};
	LinkedList<Integer> ls = null;	
	*/	
	public void abc() {
		/*내코드
		this.ls = new LinkedList<Integer>(Arrays.asList(a));
		System.out.println(this.ls);
		int w = 0;
		while(w<a.length) {
		if(a[w] % 2 != 0) {
			int k = a[w] +1;
			this.ls.set(w, k);
		}
		w++;
		}
		System.out.println(this.ls);
		*/	
	}
}
