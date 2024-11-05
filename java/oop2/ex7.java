package oop2;
//throws, throw 모두 사용
public class ex7 {
	public static void main(String[] args) {
		try {
			ex7_box ex = new ex7_box();
			ex.abc("ok");
		}
		catch(Exception e) {
			System.out.println(e.getMessage()); //throws 메소드에 문제사항 출력
			//상대방에서 처리된 사항을 확인하는 조건문
			if(e.getMessage()==null) {
				System.out.println("정상적으로 데이터를 처리 하였습니다.");
			}
			else {
				System.out.println("코드 오류가 발생하였습니다.");
			}
		}
	}
}

class ex7_box{
	Exception ep = null;
	
	public void abc(String a) throws Exception {
		/*
		// 성공, 실패 관계없이 무조건 전송메세지를 발송하는 코드
		if(a=="ok") {
			String key = "abc123";
			int keycode = Integer.valueOf(key);
		}
		else {
			this.ep = new Exception();
			throw this.ep;

		}
		*/
		
		
		// 정상적으로 처리가 되었을 경우 null 처리가 됨
		try {
			if(a=="ok") {
				String key = "a123";
				int keycode = Integer.valueOf(key);
				System.out.println(keycode);
			}
			else if(a=="no"){
				System.out.println("정상적 처리 완료");
			}

		}
		catch(Exception e) {	//상대방 코드에는 문제사항 미전달 및 자신의 코드 오류 출력
			e.printStackTrace();
			this.ep = new Exception();
			throw this.ep;
		}
		
	}
}
