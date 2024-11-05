package exam;

import java.util.ArrayList;
import java.util.Scanner;

/*
 응용문제9 - 외부클래스 사용
 사용자가 간편회원가입진행
 ArrayList 사용
 
  질문내용 배열 -원시배열
  {"아이디","패스워드","고객명","이메일"}
  
  <간편회원가입 실행>
  아이디 입력하세요:
  패스워드 입력하세요:
  고객명 입력하세요:
  이메일 입력하세요:
  입력하세요:
  
  <배열저장형태>
  [
  {...,홍길동,...}
  {...,이순신,...}

  ]
  
  
  
  */
public class exam9 {

	public static void main(String[] args) {
		
		new exam9_box().abc();

	}

}


class exam9_box{
	
	public void abc() {
		
		Scanner sc = new Scanner(System.in);
		String arr[] = {"아이디", "패스워드", "고객명", "이메일"};
		
		ArrayList<ArrayList<String>> all = new ArrayList<ArrayList<String>>();
		
				
		int f;
		int w=0;
		while(w<2) {
			ArrayList<String> aa =  new ArrayList<String>();
			for(f=0; f<arr.length; f++) {				
				System.out.printf("%s 입력하세요 : ", arr[f]);
				String k_f = sc.nextLine();
				aa.add(k_f);
				
			}
			all.add(aa);
			w++;
			}
		System.out.println(all);		
		sc.close();
	}
}
