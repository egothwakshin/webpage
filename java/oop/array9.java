package oop;

import java.util.Arrays;

// return메소드를 이용한 배열값 받기
public class array9 {

	public static void main(String[] args) {
		ar9_box ar = new ar9_box();
		int result[] = ar.point();		// 1차배열 자료형선언. 반환된 배열 적용.
		System.out.println(Arrays.toString(result));		// 	배열 출력
		
		//허락된 key가 맞을 경우 데이터 출력
		String info[] = ar.user("a1234"); // key값을 인자값으로 전송
		System.out.println(Arrays.toString(info));
		
		// 2차배열 return
		int recall[][] = ar.money();		// 2차배열 호출 및 반환값 전달
		System.out.println(Arrays.deepToString(recall));	// 2차배열 출력
		
	}

}

class ar9_box{

	public int[] point() {	// 숫자형 1차배열 return 메소드			
		
		int adata[] = {10, 20, 30, 40, 50};		
		return adata;	//  return으로 배열 반환		
		
	}
	
	public String[] user(String api_key) { // key 값을 인자값으로 받음
		
		if(api_key == "a1234") {	// 인자값으로 받은 key 값이 맞으면
			String user_list[] = {"박세은", "최한결", "신희문", "김단희"};
			return user_list;		// 주어진 배열 반환
		}
		else {						// key가 일치하지 않을경우
			String user_list[] = null;
			return user_list;		// null로 반환
		}
		
	}
	
	public int[][] money(){		// 숫자형 2차배열 return 메소드
		int data[][] = {
				{10, 20, 30, 40, 50},
				{100, 200, 300, 400, 500}				
		};		
		return data;		// 배열값 반환
	}
}
