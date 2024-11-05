package oop;
//메소드 정의 (void, 자료형, return)
public class method3 {

	public static void main(String[] args) {
		mth3_box mth3 = new mth3_box();
		mth3.abc();
		
		//bbb 자료형 메소드에 인자값을 보낸 후 결과값을 변수로 받음
		String result = mth3.bbb("hong");
		System.out.println(result);		// 결과값을 출력
		
		int sum = mth3.ccc(10, 5);
		System.out.println(sum);
		
	}

}

class mth3_box{
	public void abc() {		//void : 연산, 결과, 실행 담당. ★return 없음★
		System.out.println("abc void 메소드");
	}
	
	public String bbb(String id) {	//문자 자료형 메소드
		String email = id + "@nate.com";	
		return email;
	}
	
	public int ccc(int a, int b) {		//숫자 자료형 메소드
		int c = a * b;
		return c;
	}
	public static void ddd() {		// 메모리 영역에 등록된 void 메소드
		
	}
	
	public static String eee() {	// 메모리 영역에 등록된 자료형 메소드
		return null;
	}
}