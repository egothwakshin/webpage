package oop;
//메소드 인자값 호출 및 전달
public class oop4 {

	public static void main(String[] args) {
		oop4_box op4 = new oop4_box();
		op4.abc(117, "홍길동");
		/*
		넣을 인자값의 형태에 따라 아래 4개의 메소드에
		해당하는 각 인자값의 형태에 맞는 메소드를 호출
		*/
	}

}

//외부 "class"는 동일한 package에 있을 경우 "같은 이름"을 사용하지 "못함"
/*
해당 class안에서 "method"는 "동일한 이름"을 사용할 수 있음.
단, "인자값에 대한 자료형 및 갯수"에 따라 동일한 method 이름을 여러번 사용가능함.
*/

class oop4_box{
	public void abc() {		//인자값을 받지 않는 메소드
		System.out.println("테스트");		
	}
	
	public void abc(String a) {	//문자 인자값을 받는 메소드
		System.out.println("테스트2");		
	}
	
	public void abc(int a) {	//숫자 인자값을 받는 메소드
		System.out.println("테스트3");		
	}
	
	public void abc(int a, int b) {		//2개의 숫자 인자값을 받는 메소드
		System.out.println("테스트4");		
	}
	public void abc(int a, String b) {		//1개의 숫자, 1개의 문자 인자값을 받는 메소드
		
		System.out.println("테스트5");
		System.out.println(a + ", " + b);
		
	}
}

