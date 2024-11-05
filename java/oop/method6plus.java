package oop;

import java.util.Scanner;

public class method6plus {
	public static int no;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 :");
		no = sc.nextInt();
		method6_box mb = new method6_box();
		String result = mb.ck();		//return 결과값응ㄹ 받는 변수
		System.out.printf("%d는 %s입니다.", no, result);
		sc.close();
	}

}
// this는 외부 클래스에서 활용
class method6_box{
	// 전역변수에 메인 클래스에 있는 메모리 변수값을 로드
	public int user = new method6plus().no;	
	public String msg = " ";	// return 결과값을 쓰기 위한 변수
	
	public String ck() {
		if(this.user % 2 == 0) {
			this.msg = "짝수";
		}
		else {
			this.msg = "홀수";
		}
		return this.msg;
	}
}
