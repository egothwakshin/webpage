package exam;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/*
 응용문제10 -
 다음 배열을 확인 후 LinkedList 사용하여 결과와 같이 출력되도록 코드를 작성하시오
 
  변경 전
  [1,3,6,9,12,15,18,21,24,27]
  
  1~30까지 숫자 하나를 입력 : 22
   [1,3,6,9,12,15,18,21,22, 24,27]
 
 
  */
public class exam10 {

	public static void main(String[] args) {
		new exam10_box().abc();

	}

}

class exam10_box{
	
	Integer arr[] = {1,3,6,9,12,15,18,21,24,27};
	LinkedList<Integer> ls = new LinkedList<Integer>(Arrays.asList(arr));
	Scanner sc = new Scanner(System.in);
	
	
	public void abc() {
		
		System.out.println("1~30 중 숫자 하나를 입력 : ");
		int no = this.sc.nextInt();
		
	

		
		sc.close();
		
		
	}
}
