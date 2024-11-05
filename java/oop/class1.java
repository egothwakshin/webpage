package oop;

import java.util.Arrays;
import java.util.Scanner;

//실행 파일 (load_class.java와 연계)
public class class1 {

	public static void main(String[] args) {
		cl1_box cl = new cl1_box();
		//cl.abc();
		cl.bbb();
		cl.news_data();

	}

}

class cl1_box{
	
	load_class lc = new load_class();	// 중요★ 외부 class 로드
	Scanner sc = new Scanner(System.in);
	
	// ①보안코드 체크
	public void abc() {
		String result =this.lc.sc_code(1234);	//인증번호 체크 메소드로 값 전달 및 반환
		System.out.println(result);
	}
	// ②로그인을 하는 프로세서
	public void bbb() {
		System.out.println("아이디를 입력하세요 : ");
		String mid = this.sc.nextLine().intern();
		System.out.println("패스워드를 입력하세요 : ");
		String mpass = this.sc.nextLine().intern();
		String result = this.lc.login(mid, mpass);	// 사용자 정보 검토 프로세서
		System.out.println(result);
		this.sc.close();
	}
	
	// ③데이터 로드
	public void news_data(){
		String result[] = lc.news();	// 반환된 배열값을 변수 배열로 받음
		System.out.println(Arrays.toString(result));	// 출력
	}
	
}


