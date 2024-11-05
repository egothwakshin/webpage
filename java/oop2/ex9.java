package oop2;
/*
 응용문제) Scanner 미사용
 45 x 3 + 16 + 5 + 22 x 8 (실제값 짝수) 이 계산된 최종값을 외부클래스에 전송합니다.
 해당 외부클래스에서 짝수일 경우 예외 오류를 발생시킵니다.
 홀수일 경우 "홀수값 입니다." 라는 결과값을 return으로 보냅니다.
 최종 메인 메소드에서 결과값을 출력시키는 코드를 작성하시오.
  */
public class ex9 {
	public static void main(String[] args) {
		try {
			int kk = 45 * 3 + 16 + 5 + 22 * 8;
			//String result = new ex9_box().abc(kk);
			String result = new ex9_box().abc2(kk);	//값전송
			System.out.println(result);				//return값 출력
		}
		catch(Exception e) {			
			System.out.println(e.getMessage());
		}
	}
}

class ex9_box{
	
	//try~catch 쓴 경우
	public String abc2(int total) throws Exception {
		String msg = "";
		try {
			if(total % 2 == 0) {
				throw new Exception("올바르지않은 값(짝수)입니다.");
			}
			else {
				msg = "홀수값입니다.";
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}	
		return msg;	
	}
	
	
	
	//try~catch 안 쓴 경우
	public String abc(int x) throws Exception {
		String str = "";
		if( x % 2 != 0) {
			str = "홀수값입니다.";
		}
		else {
			/*
			Exception ep = new Exception("예외처리발생. 해당결과 짝수");
			throw ep;		//강제 catch 실행
			*/
			throw new Exception("예외처리발생. 해당결과 짝수"); //위 두줄코드를 한줄로 줄임
			
		}
		return str;
		
	}
	
	
}
