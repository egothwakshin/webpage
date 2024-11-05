package oop2;
//class + class
/*
 1.현재시간,날짜
 2.로그인 정보 
 3.dto (setter,getter)
 4.Session,Cookie
 5.Database Connetion
  */
public class oop_class5 {
	public static void main(String[] args) {
		b_class bc = new b_class();
		bc.aaa("홍길동", 01032234567); //int, Integer는 0으로 시작하면 loss
	}
}

class a_class{	//실제 문법이 작성된 class
	String user = "";
	Integer tel = 0;
	
	public void aaa(String nm, Integer no) {
		this.user = nm;
		this.tel = no;
		System.out.println(this.user);
		System.out.println(this.tel);
	}
}


class b_class extends a_class{	//상속을 받는 class. 상속내용만 작성됨. 따로 코드작성 X
	@Override
	public void aaa(String nm, Integer no) {
		super.aaa(nm, no);
	}
}
