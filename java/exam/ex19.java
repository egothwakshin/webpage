package exam;
//추상 클래스(abstract) => extend 이용하여 로드
public class ex19 {
	public static void main(String[] args) {
		new ex19_member().abc();	//은닉화
	}
}

class ex19_member extends ex19_box{

	@Override
	public void bbb() {		
		
	}

	@Override
	public void bbb(int a) {
		
	}
	
}

abstract class ex19_box{
	private String data = "";
	public ex19_box() {
		System.out.println("즉시실행!");
	}
	
	public void abc() {
		this.data = "홍길동";
		System.out.println(this.data);
	};
	abstract public void bbb();
	abstract public void bbb(int a);
		
	
}
