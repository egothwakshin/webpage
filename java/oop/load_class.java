package oop;
// 데이터 처리(출력) 및 데이터 반환
public class load_class {
		
	// ①인증코드 확인
	public String sc_code(int a) {
		String msg = "";
		if( a == 1234) {
			msg = "정상적으로 인증이 완료되었습니다.";
			
		}
		else {
			msg = "인증번호를 다시 확인하세요.";
		}
		return msg;
	}
	
	// ②로그인
	public String login(String id, String pw) {
		String msg = "";
		if( id == "hong" && pw == "a123456") {
			msg = "로그인 되셨습니다.";
		}
		else {
			msg = "아이디 및 패스워드를 확인하세요.";
		}
		return msg;
	}
	
	// ③데이터 출력
	String data[] = null; /*필드에 선언한 배열. 문자형 1차 배열 빈 값*/
	
	public String[] news() {
		//필드에 있는 1차 배열 선언문을 이용하여 실제 데이터를 입력 후 데이터 반환
		this.data = new String[]{"KBS","SBS","MBC","JTBC","채널A"};
		return this.data;
	}
}
