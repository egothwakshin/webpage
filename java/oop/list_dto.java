package oop;

import java.util.ArrayList;
import java.util.List;

// 배열에 자료형에 해당 클래스를 로드하여 적용하는 방법(DTO)

//실행 부분
public class list_dto {

	public static void main(String[] args) {
		new list_data();
	}
}

//module(반복문,원시배열...)
class list_data{
	String user[][] = {
			{"hong","kim"},
			{"홍길동","강감찬"}
	};
	List<dto_info> di = null;	//개발자가 ArrayList, LinkedList, Hashmap 등을 자유롭게 쓰기위해 'List' 라고 적어둠
	/*
	 <>안에 String, Integer 아닌 클래스명을 넣음
	 클래스 배열에 getter,setter 클래스를 로드하여 1차배열 생성및출력
	 */
	public list_data() {	//즉시 실행 메소드
		this.list_useradd();
	}
	public void list_useradd() {	//사용자를 추가하는 메소드
		 dto_info sg = new  dto_info();	//getter,setter 메소드를 로드
		 int w = 0;
		 while(w<this.user.length) {
			 this.di = new ArrayList<dto_info>();	//1차배열로 값을 원시배열->클래스배열로 이관
			 
			 sg.setMid(user[0][w]); //setter에 값을 이관
			 sg.setMname(user[1][w]); //setter에 값을 이관
			 this.di.add(sg);	//클래스 배열에 추가
			 this.user_print(); // 출력파트 실행(view 실행)
			 w++;
			
		 }
		 
	}	
//출력메소드(jsp부분)
	public void user_print() {
		for(dto_info z : this.di) {	//foreach로 해당 데이터를 출력
			System.out.println(z.getMid());
			System.out.println(z.getMname());
		}
		
	}
}

	



















//getter, setterr (module)가 있는 클래스
class dto_info{
	String mid, mname;

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}
}
