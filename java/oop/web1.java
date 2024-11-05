package oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// setter, getter를 이용한 데이터 주고 받기
/*
DAO (Data Access Object) : 데이터에 접근하기 위한 객체 (삽입, 삭제, 조회)
DTO (Data Transfer Object) : Getter, Setter를 이루는 메소드의 집합
VO (Value Object) : 상수 데이터를 이용하여 값을 가져오는 메소드
*/
public class web1 {
	public static void main(String[] args) {
		/*반복문 사용시 new오브젝트 할당량을 확인해야 함*/
		Integer a[] = {5,10,8,4,2};
		ArrayList<Integer> arr1 = null;
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		//System.out.println(arr1);
		//System.out.println(arr2);
		int w = 0;
		while(w<a.length) {
			arr1 = new ArrayList<Integer>();
			//반복문 안에 'new'가 있어서 반복될 때마다 데이터 날려버림(마지막 반복 데이터만 남음)
			arr1.add(a[w]);
			arr2.add(arr1.get(0));
			w++;
		}
		System.out.println(arr1);
		Collections.sort(arr1);
		System.out.println(arr1);
		System.out.println(arr2);
		
		/*
		 1차 -> 2차 배열(반복문 사용시 1차 배열 생성이 중요합니다)
		 또한, 2차 배열도 반복문 안쪽과 바깥쪽 중 어디에 쓰느냐에 따라
		 결과가 달라지므로 잘 판단해야합니다.
		 */
		
		/*
		 2차 이상 배열에서 sort 를 1차배열 형태에 적용하면,
		 추가 2차배열 및 다차원 배열 ;모두 동일하게 적용'된다.
		 ★★★★ 2차배열에서 collection.sort 안쓰는 거 추천! 
		  */
		String user[][] = {
				{"hong","kim","park"},
				{"21","16","33"}				
		};
		
		ArrayList<ArrayList<String>> all = new ArrayList<ArrayList<String>>();
		ArrayList<ArrayList<String>> all2 = new ArrayList<ArrayList<String>>();
		ArrayList<String> al = null;
		
		int f;
		for(f=0; f<user[0].length; f++) {
			al = new ArrayList<String>();
			al.add(user[0][f]);
			al.add(user[1][f]);			
			all.add(al);
			all2.add(al);
			
		}
		System.out.println(all);
		System.out.println(all2);
		Collections.sort(all.get(0));
		System.out.println(all);
		System.out.println(all2);
		
	}

}
