package oop2;

import java.util.ArrayList;

//배열을 이용한 예외처리 코드문법
public class ex10 {
	public static void main(String[] args) {
		Object data[] = {"유재석", 1000, "실버회원", 0.5, true, 4};
		System.out.println(data[4].getClass().getName());	//배열값에 대한 자료형 확인
		System.out.println(data[4].getClass().getSimpleName()); //간단한 자료형 이름만 출력	
		ArrayList<Integer> user = new ArrayList<Integer>();	//빈 클래스배열
		try {
			int w = 0;
			while(w<data.length) {
				//user.add(String.valueOf(data[w]));
				
				//Object 원시배열시 숫자 클래스 배열로 입력할 경우 자료형 변환 후
				String ck = data[w].getClass().getSimpleName();		
				if(ck.equals("Integer")) {
					user.add(Integer.valueOf((int)data[w]));
				}
				w++;
			}
			System.out.println(user);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
