package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class exam9T {

	public static void main(String[] args) {
		
		new ex9().abc();
	}

}

class ex9{
	
	static ArrayList<ArrayList<String>> member = new ArrayList<ArrayList<String>>();
	ArrayList<String> person = null;	//각 고객들의 데이터 입력받는 배열
	final String list[] = {"아이디", "패스워드", "고객명", "이메일"};
	Scanner sc = new Scanner(System.in);
	
	
	public void abc() {		//회원가입 파트
		this.person = new ArrayList<String>();
		int w = 0;
		while(w < list.length) {
			System.out.print(list[w] + " 입력하세요 : ");
			this.person.add(this.sc.nextLine());
			w++;
		}
		this.member.add(this.person);
		this.print();
	}
	public void print() {	//출력 (가입된 사용자 리스트)
		System.out.println(this.member);
		this.abc(); 		//abc메소드 재호출	(재귀호출, 재귀함수)
	}

}