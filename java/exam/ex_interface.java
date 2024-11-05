package exam;

import oop2.inter1;

/*
 1.public 클래스 형태로 만들지 않음 
 2.default 클래스 활용 
 3.오버라이드 활용해야 함
 4.필드에 변수 사용시 무조건 상수
 5.interface 안에 abstract 사용 가능
 6.interface 는 여러개를 한꺼번에 로드할수 있음
 7.interface 는 즉시실행메소드 없음
 8.public 외에는 사용하지 않음(protected,private X)
 9.조건문,반복문...사용X
  */
public interface ex_interface {
	public void box1();	//interface 메소드
	public String box2();
	public abstract void box3();	//abstract 메소드
	default void zzz() {
		System.out.println("test");
	}
}

//기존에 사용한 interface를 보강 및 유지보수할 때 사용하는 방식
interface re{
	public String getdata();
}

//예제연습
interface user{
	public String userlevel();
}