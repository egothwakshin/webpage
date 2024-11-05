package oop2;
//oop_class7.java와 연계
public interface inter2 {

	public String data[] = {"유재석","강호동","신동엽","정상훈","아이유"};
	public void money();
}

/*
 기존 내용 외의 추가적인 메소드 및 전역변수 자료형이 있을 경우
 기존 interface를 로드 후 추가 옵션을 작성함

 [핵심]
 1. extends 로 interface 로드시 기존에 있는 메소드를 default 변경 유/무 선택
 2. 새로운 메소드 생성시 implements 한 class에 추가 메소드를 오버라이드 해야함
 3. '즉시실행'되는 메소드 없음
 */

interface inter2_2 extends inter2{
	
	Integer p = 1000;
	public void point();
	
}