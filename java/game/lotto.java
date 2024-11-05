package game;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/*
 숙제
 PC가 1~46까지 숫자를 총 6개를 생성합니다.
 해당 6개의 숫자를 클래스 배열에 모두 저장시킵니다.
 단, 동일한 숫자가 입력되었을 경우 새로운 숫자로 다시 PC가
 선택할수 있도록 코드를 작성합니다
 
 예시)
 [2,6,8,22,6,27] (X)
 [10,16,32,41,22,31] (O)
  
 */
public class lotto {

	public static void main(String[] args) {
		new lotto_box().abc();
		

	}

}

class lotto_box{
	
	String pc;
	String arr[] = new String[6];
	
	public void abc(){
			
		int w=0;
		while(w<=5) {
			int k = (int)Math.ceil(Math.random() * 6);
			this.pc = "" + k;
			
			if(Arrays.asList(arr).indexOf(this.pc) == -1) {
				arr[w]= pc;
				
			}
			else {
				continue;
			}

			w++;
		}
		
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(arr));
		System.out.println(al);
		System.out.println(al.indexOf("5"));
		
	}
}
