package oop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

//LinkedList로 원시배열을 가공하기
public class web7 {

	public static void main(String[] args) {
		wb7_box wb = new wb7_box();
		

	}

}

class wb7_box{
	String product[][] = null;
	String money[] = null;
	Scanner sc = new Scanner(System.in);
	
	public wb7_box() {
		this.product = new String[][]{
			{"쿠첸 브레인 IH 전기압력밥솥","누벨르 디지털 미니 전기밥솥","제니퍼룸 마카롱 전기밥솥 화이트","쿠쿠 트윈프레셔밥솥"},
			{"4인용","3~4인용","3인용","1~2인용"},
			{"199500","31650","357910","283000"}
		};
		//this.abc();		//abc메소드 호출 (1차배열 연습용)
		this.bbb();
	}
	
	public void bbb() {
		//[쿠첸,4인용,199500],[누벨르,3~4인용,31650],.....
		LinkedList<ArrayList<String>> ls = new LinkedList<ArrayList<String>>();
		//ls 는 LinkedList이고, pd1은 ArrayList 임!
		
		int f,ff;
		for(f=0; f<this.product[0].length; f++) {	//4
			ArrayList<String> pd1 = new ArrayList<String>();		
			for(ff=0; ff<this.product.length; ff++){	//3
				pd1.add(this.product[ff][f]);		
			}
			ls.add(pd1); 	//ls 는 LinkedList이고, pd1은 ArrayList 임!
		}
		System.out.println(ls);
		
		System.out.println("상품명을 검색하세요 : ");
		String search = this.sc.nextLine();
		int w = 0;
		while(w<ls.size()) {
			int ck = ls.get(w).get(0).indexOf(search);
			if(ck >= 0) {
				System.out.printf("%s의 가격: %s%n",ls.get(w).get(0),ls.get(w).get(2));
			}
			w++;
		}
		this.sc.close();
	}
	
	
	public void abc() {
		/*
		사용자가 금액을 입력합니다. 단, 문자로 0을 입력시 반복문은 종료됩니다.
		그 외에 입력되는 사항은 모두 LinkedList 배열에 기록되어야 합니다.
		
		[결과]
		"금액을 입력하세요 : 5000"
		"금액을 입력하세요 : 6000"
		.
		.
		.
		"금액을 입력하세요 : 8000"
		"금액을 입력하세요 : 0"
		문제①"입력된 금액의 총 리스트 출력 : [5000,6000, ..., 8000] "
		문제②"입력된 금액의 총 리스트 출력 : [8000,6000, ..., 5000] "	//나중에 쓴 금액이 제일 앞에 오도록
		*/
		LinkedList<String> ls = new LinkedList<String>();
		
		/*
		 문제①
		int w = 0;
		while(true) {
			System.out.println("금액을 입력하세요 : ");
			String price = this.sc.nextLine();	
				if(price.equals("0")) {
					break;
				}
			ls.add(price);	
			
		w++;
		}
		System.out.println(ls);
		*/
		
		int w = 0;
		while(true) {
			System.out.println("금액을 입력하세요 : ");
			String user = this.sc.nextLine();
				if(!user.equals("0")) {
					//ls.add(0,user);
					ls.addFirst(user);		//addFirst : node번호 첫번째 삽입				
					//ls.addLast(user);		//addLast : node번호 마지막 삽입
				}
				else {
					break;
				}
			
			w++;
		}
		System.out.println(ls);
		this.sc.close();
		System.exit(0);
	}
	
}