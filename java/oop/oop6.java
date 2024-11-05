package oop;
//외부 클래스를 이용한 조건문 (if문)
public class oop6 {
	public static void main(String[] args) {
		//사용자 정보
		String user = "hong";
		String pass = "a1234";
		oop6_cal op6 = new oop6_cal();
		op6.abc(user, pass);
		
		/*
		 *<input type = "text" name="user"> : null 인 경우
		 *<input type = "text" name="user" value=""> : "" 인 경우
		 */
		
		oop6_ck fff = new oop6_ck();
		
		//char auto_login = 'Y';
		String auto_login = "Y";
		fff.login_ck(auto_login);
	}
}

//외부 클래스
class oop6_cal{
	
	public void abc(String mid, String mpw) {
		if(mid == null || mid == "") {
			System.out.println("아이디가 확인되지 않음");
		}
		else if(mid != null || mid != "") {	
			System.out.println("아이디가 확인됨");
			if(mid == "hong") {
				if(mpw == "a1234") {
					System.out.println("로그인 되었습니다.");
				}
				else {
					System.out.println("패스워드가 틀립니다.");
				}
			}
			else {
				System.out.println("등록된 회원이 아닙니다.");
			}
		}
	}
}

//외부 클래스2

class oop6_ck{
	/*
	 * equals 메소드★
	 * 문자열이 같은지 비교
	 * 숫자에는 쓸수 없음. 숫자는 무조건 연산기호 (==, !=, >=, <=, >, <)
	 * */
	//public void login_ck(char ck) { char 로 쓸경우 '연산기호(==)' 사용
	public void login_ck(String ck) { //string 으로 쓸 경우 'equals'메소드 사용가능
		if(ck.equals("Y")) {
			System.out.println("자동로그인 활성화!");
		}
		else if(!ck.equals("Y")) {	// !ck.equals("Y") : 앞에 ! 붙으면 '같지 않음'을 의미
			System.out.println("자동로그인 비활성화");
		}
	}
}


