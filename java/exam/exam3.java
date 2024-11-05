package exam;
/*
 응용문제3 - 외부클래스 사용
 PC가 1~9까지 랜덤숫자를 하나 선택합니다.
 선택한 숫자의 구구단을 출력합니다
 (조건: 즉시 실행 메소드에서 PC가 랜덤 숫자를 선택되도록합니다)
 for문 사용
  
  
  */
public class exam3 {

	public static void main(String[] args) {
	
		new exam3_box();
	}

}

class exam3_box{
	
	int pc;
	
	public exam3_box() {
		
		this.pc = (int)Math.ceil(Math.random()*9);
		
		int f;
		for(f=1; f<10; f++) {	
			System.out.println(pc + " x " + f + " = " + pc*f);
		}
	}

}

