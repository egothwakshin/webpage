package oop;

import java.util.ArrayList;

//DTO(Getter, Setter를 이루는 메소드의 집합)를 이용한 배열 생성하기
/*
 DTO에 있는 모든 변수를 활용할 필요는 없으며,
 추가로 필요한 변수가 있을 경우 DTO에 생성 후
 getter,setter 메소드를 생성한다. 
  */
public class web3 {

	public static void main(String[] args) {
		dto dt = new dto();	// dto.java 의 클래스dto 로드
		String user[][] = {
				{"홍길동","이순신"},	
				{"25","33"},
				{"hong@nate.com","lee@naver.com"},
				{"hong","lee"}
		};	//[고객명-이메일-나이] 순으로
		
		ArrayList<ArrayList<String>> all = new ArrayList<ArrayList<String>>();
		int f;
		for(f=0; f<user[0].length; f++) {	//2
			dt.setName(user[0][f]);
			dt.setEmail(user[2][f]);
			dt.setAge(user[1][f]);
			dt.setId(user[3][f]);	// dto.java에서 순서상1번이므로 제일 먼저 출력됨
			all.add(dt.make());
			//System.out.println(userdata);
		}
		System.out.println(all);
		//1차 배열 return 받는 형태
		
		//ArrayList<String> userdata = new ArrayList<String>();	
		//user = dt.make();										
		
		//ArrayList<String> userdata = dt.make();		③ = ⓛ + ②
		
	}

}
