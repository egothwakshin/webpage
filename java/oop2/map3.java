package oop2;

import java.util.Hashtable;

//HashTable 사용법
public class map3 {
	public static void main(String[] args) {
		//Hashtable : 데이터 병렬처리 및 Thread
		//Hashmap : 단일처리 및 Single Thread
		Hashtable<Integer, String> all = new Hashtable<Integer, String>();
		all.put(0, "HTML");
		all.put(1, "CSS");
		all.put(2, "JS");
		all.put(3, "JS");
		//all.put(4, null); 	오류. Hashtable은 null 사용못함
		System.out.println(all);
		System.out.printf("%s %s %s%n", all.get(0),all.get(2),all.get(1));
		System.out.println(all.keySet());	//등록된 키 현황
		System.out.println(all.keySet().size());	//키 갯수
		System.out.println(all.size());		//키 갯수
		
		int w = 0;
		while(w<all.keySet().size()) {
			System.out.println(all.get(w));	//키 갯수만큼 반복하여 데이터출력
			w++;
		}
		
		
	}
}
