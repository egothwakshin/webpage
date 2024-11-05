package oop;
// class 안에 class (부모클래스 + 자식클래스)
public class method5 {

	public static void main(String[] args) {		
		parents pr = new parents();		// 부모클래스 로드
		pr.zzz();						// 부모클래스에 있는 메소드 호출
		parents.child pc = pr.new child();		// 자식클래스 로드
		//parents.child pc = new parents().new child();
		pc.abc();			// 자식클래스에 있는 메소드 호출
		
	}
}
class parents{		// 부모클래스
	public String a = "홍길동";		// 부모 필드에 있는 전역변수
	public void zzz() {
		System.out.println("부모클래스에 있는 zzz메소드");
	}
	
	class child{	// 자식클래스
		public int gugu = 50;	// 자식 필드에 있는 전역변수
		public void abc() {		// 자식클래스에 속한 메소드
			System.out.println("자식클래스에 있는 abc 메소드\n" + parents.this.a);
			// parents.this.a : 부모필드에 있는 전역변수 로드
			System.out.println(this.gugu);	// 자식필드에 있는 전역변수 로드
		}
	}
	
	class child2{
		
	}
}