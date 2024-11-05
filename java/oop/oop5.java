package oop;

//외부 클래스를 이용하여 데이터 값을 메소드로 전달
/*
 * this 란 ? ★★★★★
 * "같은 클래스 그룹을 지칭"할 때 사용하는 문법
 */

public class oop5 {

	public static void main(String[] args) {
		oop5_box op5 = new oop5_box();
		String mid = "hong";
		String mpass = "a1234";
		op5.abc(mid, mpass);
		/*
		 * null : 값을 확인하지 못함 " " : 값이 비어있음
		 */

		
		//public class안의 메소드(zzz, kkk)를 호출하는 방법
		oop5 mains = new oop5();
		mains.zzz();
		
		new oop5().zzz();	// 위 두줄코드를 한줄코드로 줄임\
		
		
		new oop5().kkk();

		
		/*
		 * 주의! ★★★★★
		 * main메소드 안에서는 this 로 추가메소드 호출 못함
		 */
	}

	public void zzz() { // 메인 클래스 안에 있는 zzz메소드
		System.out.println("메인 클래스의 zzz메소드!!");
		this.kkk();
		//main메소드에서 zzz메소드 호출 -> zzz메소드에서 kkk메소드 호출
		
		//main메소드가 아닌 public class안의 추가 메소드는 this 활용 가능
		/*
		 * this.kkk();
		 * kkk();
		 * new oop5().kkk();
		 * */
		

	}
	
	public void kkk() {
		System.out.println("메인 클래스의 kkk메소드!!");
	}
}


class oop5_box {
	public void abc(String id, String pw) { // 외부클래스의 abc메소드
		System.out.println(id);
		System.out.println(pw);

		this.login(id, pw);
		// this를 이용하여 login메소드로 값을 전달함
		// 추가메모. this를 안쓰더라도 전달이 되기는 함...

	}

	public void login(String id, String pw) { // 외부 클래스의 login메소드
		System.out.println(id);
		System.out.println(pw);

	}

}
