package oop2;
//oop_class7.java와 연계
//interface는 class와 비슷한 성격을 지님->모든 메소드를 그룹화

public interface inter1 {
	public String names();	//기본 메소드에 {} 가 없음
	public Integer age();
	//private Integer age(); 사용불가능
	//protected Integer age(); 사용불가능
	//인터페이스에서 private, protected 사용불가능
		
	//default: interface에서 유일하게 기본메소드를 활용할 수 있는 선언문
	default void setbox(String id) {	
		
	}	
	default String getbox() {
		return null;
	}
}
