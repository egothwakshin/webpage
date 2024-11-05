package oop;
//외부 클래스 변수값 가져오기 및 변경 (public, private)
public class method2 {
	
	static String user = null;	// 로그인 사용명 (메모리에 장소 설정)
	
	//main메소드 : 기본적으로 메모리 영역을 무조건 사용함.
	public static void main(String[] args) {
		/*
		 <String user = null; 로 선언했을 경우>
		 method2 md = new method2();
		 md.user = "홍길동"; 
		 */		
		user = "홍길동";	// 메모리에 등록된 전역변수 값을 입력시킴
		
		method2_box mb2 = new method2_box();
		mb2.aaa = 500;	// 외부클래스 필드에 있는 전역변수의 값을 변경시킴
		//mb2.bbb = 2000;	// private 선언한 전역변수45
		mb2.abc();
		//mb2.zzz();		// private으로 생성된 메소드는 외부에서 호출할 수 없음
	}

}

class method2_box{
	
	public int aaa = 100;	// 일반 전역변수
	private int bbb = 1000;	// private은 해당 class에서만 사용 및 변경 가능
	
	private void zzz() {
		System.out.println("내부 보안 메소드...");
	}
	
	public void abc() {
		// public class에 있는 메모리 영역의 변수값을 일반 변수에 등록
		method2 md = new method2();		
		String aaa = md.user;
		//String aaa = new method2().user;	// 위 두줄코드를 한줄로 줄임		
		System.out.println(aaa);
		System.out.println(this.aaa);
		this.bbb = 2000;
		System.out.println(this.bbb);	// 동일 class 내부에서는 값 변경가능
	}
}
