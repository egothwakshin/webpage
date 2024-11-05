package oop2;
//외부클래스 로드 및 abstract(추상클래스)
public class oop_class2 {
	public static void main(String[] args) {
		oc1_box ob = new oc1_box();
		ob.age = 65;	//protected 선언 변수형
		ob.abc();
		
		oc2_box ob2 = new oc2_box();	//추상클래스 포함됨
		ob2.aaa();
		String result = ob2.bbb();
		System.out.println(result);
		ob2.ccc();
	}
}
//추상클래스 생성
//※주의사항※ 코드 작성중 해당 추상메소드 이름 변경시 상속받은 모든 클래스에 문제가 발생
abstract class ab_box1{
 	public void aaa() {};				    //추상메소드
	public String bbb() { return null; };	//추상메소드
	public void ddd() {};					//미사용된 추상메소드
}

//일반클래스
class oc2_box extends ab_box1{		//extends: 상속클래스
	@Override				//@Override: 상속된 메소드 호출
	public void aaa() {		
		System.out.println("aaa");
		super.aaa();
	}
	@Override				//@Override: 상속된 메소드 호출
	public String bbb() {	
		String user = "강감찬";
		return user;
	}
	
	//Overloading : 상속받은 메소드 외에 추가로 메소드를 생성하는 것
	//※추상 클래스에 선언하지 않은 메소드 이름으로 정한다
	public void ccc() {
		System.out.println("오버로딩 호출!");
	}
}