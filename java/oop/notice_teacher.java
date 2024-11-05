package oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//공지사항 부분 - datalist.java (원시배열 + ArrayList(클래스))
//즉시 실행 메소드
public class notice_teacher {

	public static void main(String[] args) {
		notice_list2 nl = new notice_list2();
		nl.product_list();

	}

}

class notice_list2{
	datalist da = null;
	String n[][] = null;
	ArrayList<ArrayList<String>> all = new ArrayList<ArrayList<String>>();
	
	//sort메소드 사용 (Collections.sort : 1차 배열에서만 가능)
	public void product_list() {			// 해당 배열은 별도로 sort 사용하기 힘듬
		Collections.sort(this.all.get(0));	// 해당 그룹을 정렬 시켜서 사용됨
		System.out.println(this.all);
		
	}
	
	
	public notice_list2() {	// 클래스명과 동일한 메소드일 경우 즉시 실행됨
		this.da = new datalist();		//datalist.java 호출
		this.n = da.notice();			//datalist.java의 메소드 호출
		int ea = this.n.length;	//그룹 갯수 6
		int w = 0;
		do {
			this.all.add(this.bbb(this.n[w]));	// 1차 배열 return 결과를 2차 배열에 삽입
			w++;
		}while(w<ea);
		//System.out.println(this.all);	//2차 배열 최종 출력
	}
	//원시배열을 -> 1차 배열로 생성하는 메소드
	public ArrayList<String> bbb(String data[]){
		ArrayList<String> z = new ArrayList<String>(Arrays.asList(data));
		//System.out.println(Arrays.toString(data));
		return z;
	}
}
