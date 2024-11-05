package oop2;

import java.util.ArrayList;

//ab2.java와 연계 - 추상클래스 응용편
public class oop_class4 {

	public static void main(String[] args) {		
		/*내코드
		int result = new oc4_box().abc();
		System.out.println(result);		
		 */
		//선생님코드
		new oc4_box().abc();
	}
}

/* 내코드
class oc4_box extends ab2{
	@Override
	public int abc() {
		int f;
		int sum = 0;
		this.all = new ArrayList<Integer>();
		for(f=1; f<=10; f++) {
			System.out.println("숫자를 입력하세요(" + f + "/10) : " );
			int num = this.sc.nextInt();
			this.all.add(num);
			sum += all.get(f-1);		
		}	
		return sum;
	}	
}
*/




//선생님코드
class oc4_box extends ab2{
	@Override				//abstract 강제메소드 호출
	public void userinfo(String id, String pw) {
	}
	
	
	@Override
	public void abc() {
		this.arr = new ArrayList<Integer>(); //빈 클래스
		
		int f;
		for(f=1; f<=10; f++){
			System.out.println("숫자를 하나 입력해주세요");
			this.user = this.sc.nextInt();
			this.arr.add(this.user);
			this.sum += this.user;
		}
		this.sc.close();
		System.out.println(this.arr);
		super.abc();			//super란 abstract에 이미 제작되어있는 코드를 그대로 인식시킴
	}
	@Override
	public Integer cal() {
		return super.cal();
	}
}