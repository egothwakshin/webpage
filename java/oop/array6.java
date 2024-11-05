package oop;

import java.util.Arrays;

//사용자 데이터를 이용한 배열값 출력하기
/*
 {"김민지", "서은진", "김선숙", "명동건", "강휘"},
 {"A", "B", "AB", "O", "B"},
 {"SKT", "KT", "LGT", "LGT", "KT"} 
  
 응용문제)
 사용자 중 KT 고객명만 출력하시오.
 [결과]
 서은진, 강휘
  */
public class array6 {

	public static void main(String[] args) {
		
		
		 // 응용문제. 내가 쓴 코드
		String data[][] = {
				 {"김민지", "서은진", "김선숙", "명동건", "강휘"},
				 {"A", "B", "AB", "O", "B"},
				 {"SKT", "KT", "LGT", "LGT", "KT"}				
		};
		
		int gp = data.length;	//3
		int ea = data[0].length; //5
		
		
		int f;
		for(f=0; f<ea; f++) { //ea=5 가로
			if( data[2][f] == "KT") {
				System.out.println(data[0][f]);
			}
		}
		

		ar6_box ab = new ar6_box();
		ab.abc(data);	// 배열변수를 인자값으로 전달
	}
}

class ar6_box{
	
	public void abc(String z[][]) {		// 자료형 배열로 인자값을 받음
		//System.out.println(Arrays.deepToString(z));
		
		int w = 0;
		do {
			if(z[2][w] == "KT") {	// 조건에 맞는 범위값
				System.out.println(z[0][w]);
			}
			w++;
		}while(w < z[0].length);
		
	}
}
