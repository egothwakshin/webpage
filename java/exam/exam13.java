package exam;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import oop.arraylist1;
/*
응용문제2
http://mekeyace.kbsn.or.kr/muser.txt 해당 데이터가 있습니다. 
해당 데이터를 기점으로 다음과 같이 적용되는 프로세서를 제작하시오

예시)
검색할 고객명을 입력하세요 : 강감찬
변경할 연락처를 입력하세요 : 01022225555

정상적으로 변경이 완료 되었습니다.

단, 검색할 고객명이 없을 경우 "해당 고객은 검색 되지 않습니다." 
 */
public class exam13 {
	public static void main(String[] args) {
		//new exam13_box().abc();
		
		//선생님코드
		ex13_box ex = new ex13_box();
		

	}
}

/*내코드
class exam13_box{
	
	
	String member[][] = {
			{"홍길동","SKT","45","hong@nate.com","01012234556"},
			{"이순신","LGT","55","lee@gmail.com","01022309544"},
			{"강감찬","KT","25","kang@gmail.com","01036601688"}
	};
	
	ArrayList<ArrayList<String>> all = new ArrayList<ArrayList<String>>();
	Scanner sc = new Scanner(System.in);
	
	
	public void abc() {
		
		int f,ff;
		for(f=0; f<member.length; f++) {
		ArrayList<String> al = new ArrayList<String>();
			for(ff=0; ff<member[0].length; ff++) {
				al.add(member[f][ff]);				
			}
		all.add(al);
		}
		System.out.println(all);
		
		System.out.println("검색할 고객명을 입력하세요: ");
		String str = sc.nextLine();
		
		int w = 0;
		while(w<all.size()) {
			if(str.equals(all.get(w).get(0))) {
				all.get(w).set(4, "01022225555");
			}			
			w++;
		}
		System.out.println(all);
		
	}
}
*/


//선생님코드 (1차클래스배열 메소드를 이용해서 2차원시배열->2차클래스배열 만드는방법 포함)
class ex13_box{
	String member[][] = null;
	List<ArrayList<String>> all = new LinkedList<ArrayList<String>>();	//전체 고객데이터 배열
	Scanner sc = new Scanner(System.in);
	
	public ex13_box() {	//즉시실행
		this.member = new String[][] {
			{"홍길동","SKT","45","hong@nate.com","01012234556"},
			{"이순신","LGT","55","lee@gmail.com","01022309544"},
			{"강감찬","KT","25","kang@gmail.com","01036601688"}
			};
			this.search();	//은닉화.main에서 호출안하고 즉시실행 메소드에 은닉해서 호출
	}
	
	//고객검색 및 데이터 변경
	public void search() {
		int w = 0;
		do {
			ArrayList<String> result = this.data(this.member[w]);
			this.all.add(result);
			w++;
		}while(w<this.member.length);
		System.out.println(this.all);
		
		//검색
		System.out.println("고객명을 입력하세요: ");
		String search_nm = this. sc.nextLine();
		
		Integer idx = 0;	//배열 노드 번호로 이용할 변수
		boolean check = false;	//검색대상이 있을 경우= true
		for(ArrayList<String> info : this.all) {		//foreach로 2차배열->1차배열로 쪼개서 출력
			//System.out.println(info);
			//System.out.println(info.get(0));
			if(info.get(0).equals(search_nm)) {
				check = true;	//검색결과가 있을 경우 true로 변환
				break;
			}
			idx++;
		}
		if(check == false) {
			System.out.println("해당 고객은 검색되지 않습니다.");
		}
		else {	// 검색대상이 있을 경우 ( check == true; )
			System.out.println("변경할 연락처를 입력하세요: ");
			String tel = this.sc.nextLine();
			//System.out.println(this.all.get(idx).get(4));
			ArrayList<String> redata = this.all.get(idx);	// 2차배열에 있는 그룹 하나 뽑아서 1차배열로 만듬
			redata.set(4, tel);								// 뽑아낸 1차배열의 데이터값 변경
			System.out.println(redata);
		}
		System.out.println(idx);
		System.out.println(this.all); 	//종속된 1차배열값 변경하면 자동으로 2차배열값까지 변경됨
		this.sc.close();
	}
	
	
	
	
	//1차배열 생성 메소드
	public ArrayList<String> data(String m[]){
		ArrayList<String> db = new ArrayList<String>(Arrays.asList(m));
		return db;
	}
}