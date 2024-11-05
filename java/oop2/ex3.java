package oop2;

public class ex3 {
	public static void main(String[] args) {
		String a = "500a0B";
		int b = 100;
		try {
			b = b + Integer.parseInt(a);
		}
		//같은 이름으로 Exception을 사용하지 않음
		catch(NumberFormatException nfe) { 	//해당 예외처리 발생시 
			nfe.printStackTrace();			//해당 문법으로 문제처리를 한 후 결과값을 정상적으로 진행시킴
			a = a.replaceAll("[a-zA-Z]", "");
			b = b + Integer.parseInt(a);
		}
		catch(Exception e) {
			e.printStackTrace();	// 오류발생시 해당라인 확인목적
			System.out.println(e);
		}
		System.out.println(b);	//최종출력
		
	}

}
