package oop2;
//ab3.java와 연계
public class opp_class6 {
	public static void main(String[] args) {		
		oc6_box ob = new oc6_box(1004);
		ob.abc();
	}
}
//extends 하나의 추상클래스 또는 실제클래스를 로드할 수 있음
class oc6_box extends ab3{
	public void abc() {
		System.out.println(this.number);
		String td = this.today();	//abstract에 있는 return메소드를 호출
		System.out.println(td);		//return 값 출력
		
	}
	/*
	@Override
	public String today() {
		return super.today();
	}	
	*/
	public oc6_box(int a) {			//즉시실행 (Override 아님)
		super(a);					//super : 외부클래스에서 로드하는 내용을 그대로 반영할 때 사용
									//(abstract 내용 : this.number = a;)
	}
	@Override
	public String product() {
		return null;
	}
	@Override
	public Integer basket() {
		return null;
	}
}