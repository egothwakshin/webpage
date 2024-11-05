package oop2;
//bank.java와 연계
//static 메소드 또한 사용가능함. 그리고 메소드 안에 문법을 입력할 수 있음

//★★ interface에 사용된 전역변수는 무조건 final(상수)
public interface inter3 {
	static Integer money = 100000;	//입금완료된 금액
	public void KB_bank();	//국민은행
	String password = "1234";
	String bankname = "국민";
	
}
