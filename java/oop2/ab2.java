package oop2;
//응용편 - oop_class4.java와 연계

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class ab2 {	
	/*내코드
	Scanner sc = new Scanner(System.in);
	List<Integer> all = null;
	public int abc() {
		return 0;
	}
	*/
		
	//선생님코드
	 Scanner sc = new Scanner(System.in);
	 List<Integer> arr = null;	//클래스배열
	 int sum = 0; //총 합계
	 int user;	// sc에 사용할 변수
	 
	 //public abstract ArrayList<String> data();
	 
	 public abstract void userinfo(String id, String pw);//사용자 정보 필수사항 메소드
	 	 
	 public ab2() {
		 System.out.println("즉시실행");
	}	//즉시실행. 해당 메소드는 abstract 안에서만 작동되는 메소드
	 public void abc(){			//산술연산 작업, 반복문
	 	int result = this.cal();
	 	System.out.println(result);
	 }
	 public Integer cal(){	//최종값 return
		 return this.sum;
	 }
	 
}
