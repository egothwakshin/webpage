package oop;
// 상수와 변수 (전역변수, 지역변수, 메모리 지정변수)
public class method1 {

	public static void main(String[] args) {
		//새로운 클래스를 지속적으로 호출.
		method_box mb = new method_box();
		mb.method();
		method_box mb2 = new method_box();
		mb2.method();
		method_box mb3 = new method_box();
		mb3.method();
	}
}


class method_box{
	//field (필드 영역) : 라이브러리, 배열, 변수(상수, 메모리)선언
	
	String user;	//필드영역에 전역변수 선언
	int a = 10;
	final int b = 100; // 상수(값 변경 불가능)
	static int c = 1;		//	static - 메모리에 저장하는 영역
	int d = 1;
	//Scanner sc = null;
	//라이브러리를 필드에 사용하여 해당 클래스 안에서 즉각 사용 가능
	
	
	public void method() {
		this.user = "홍길동";		// 전역변수
		String user2 = "이순신";	// method()의 지역변수
		this.a = 30;
		//int a = 30;
		//this.b = 500; 			// 상수. 값 변경 불가능
		this.method2();
		this.c++;
		this.d++;
		System.out.println(this.c);
		System.out.println(this.d);
		
		
	}
	public void method2() {
		System.out.println(this.user);
		//System.out.println(this.user2); // method() 지역변수이므로 출력 불가능
		System.out.println(this.a);
		/*
		 this.a = 30; => 30 출력됨
		 int a = 30; => 10 출력됨.
		 */
		//this.sc = new Scanner(System.in);
		//System.out.println("아이디 입력 : ");
		//String mid = this.sc.next();
		//System.out.println(mid);

	}
}
