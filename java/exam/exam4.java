package exam;

import java.util.ArrayList;
import java.util.Arrays;

/*
응용문제4 - 외부클래스 x
PC가 총 10개의 숫자를 무작위로 선택 (범위 1~20)
단, 동일한 숫자 선택가능.
해당 무작위 숫자에서 짝수를 몇개 선택하였는지에
대한 결과를 출력하시오. while문 작성 
*/
public class exam4 {

	public static void main(String[] args) {
		
		new exam4_box().abc();

	}

}

class exam4_box{
	int pc;
	ArrayList<Integer> arr = null;
	
	public void abc() {
		
		this.arr = new ArrayList<Integer>();
		
		int count = 0;
		int w = 1;		
		while(w<=10) {
			this.pc = (int)Math.ceil(Math.random()*20);
			arr.add(this.pc);

				if(this.pc % 2 ==0) {
					count++;
				}
			w++;
		}
		System.out.println(arr);		
		System.out.println("10개의 숫자 중 짝수는 총 " + count + "개 입니다.");
		
	}
}