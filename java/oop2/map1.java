package oop2;
//배열: 데이터배열, key가 존재하는 배열
import java.util.HashMap;
import java.util.Map;

//ArrayList, LinkedList : class
//Map : interface

//Map 클래스 배열(key 배열) => key : 데이터값
//Map (Hashmap, Hashtable, TreeMap) => 모두 class
//Hashmap -> ArrayList -> LinkedList
public class map1 {
	public static void main(String[] args) {
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("product", "모니터");
		map1.put("product", "키보드");	//중복된 키 사용시 해당 값이 변경됨(모니터->키보드)
		map1.put("product2", null);
		System.out.println(map1);
		System.out.println(map1.get("product")); //등록된 키를 이용하여 데이터를 출력
		System.out.println(map1.keySet());	//등록된 키 현황
	}
}
