package oop;

import java.util.Arrays;

// 배열 생성 및 출력 방법 (1차배열) - 원시배열, 클래스배열
public class array1 {

	public static void main(String[] args) {
		
		//var a = [1, 2, 3, 4, 5]; <- Javascript
		int a[] = {1, 2, 3, 4, 5};		
		int[] b = {10, 20, 30, 40, 50};
		System.out.println(a.length);	// a.length 원시배열 갯수
		System.out.println(a[1]); // 배열번호 0부터 시작
		System.out.println(b[3]);
		 
		String c[] = {"홍길동", "이순신", "강감찬"};	// 문자 배열
		System.out.println(c.length);
		System.out.println(c[1]);
		// 'Arrays 배열클래스'를 이용하여 '문자화'하여 배열 출력
		System.out.println(Arrays.toString(b));	// '파싱'
		
		//배열에 값을 삽입
		int data[] = new int[4];	// 빈배열이며, 4개의 데이터를 입력받음
		data[0] = 100;
		data[1] = 200;
		//data[2] = 300;		// 해당 배열에 값이 미입력됨.숫자 0으로 처리됨.
		data[3] = 400;
		//data[4] = 500;		// 배열번호보다 큰 값이 적용되므로 error 처리
		System.out.println(Arrays.toString(data));
		
		String userlist[] = new String[2];	//2개의 데이터를 입력받음
		userlist[1] = "이순신";
		System.out.println(Arrays.toString(userlist));
		//문자 빈 배열값은 null로 처리됨
		
		//복합배열 Object (문자,숫자,실수)
		Object list[] = {"홍길동", 25, "이순신", 30, "circle", 3.14};
		System.out.println(Arrays.toString(list));
	}
}


