package oop2;
//inter1, inter2 와 연계
public class oop_class7 {
	public static void main(String[] args) {
		op7_box op = new op7_box();
		op.point();
	}
}
//interface를 직접 class파일에 사용할 수 없음(로드를 활용해서 사용해야함)
//'implements' => interface 로드할 때 사용
//interface는 여러 개의 .java파일을 로드할 수 있음
class op7_box implements inter1,inter2,inter2_2{
	//inter2_2 => interface에 extends를 적용해서 가져옴
	@Override
	public void point() {		//inter2-2의 메소드(필수)
	System.out.println(this.p);
	}
	@Override 
	public void money() {		//inter2의 메소드(필수)
	}
	
	//인터페이스에 있는 public 메소드는 필수로 써야함
	//인터페이스에 있는 default 메소드는 필수아님(써도되고 안써도 됨)
	@Override	//@Override는 추상클래스와 동일하게 사용
	public String names() {		//inter1의 메소드(필수)
		return null;
	}
	@Override
	public Integer age() {		//inter1의 메소드(필수)
		return null;
	}
	@Override	
	public void setbox(String id) {
		inter1.super.setbox(id);	//super도 동일하게 사용됨.
	}
	
	
}