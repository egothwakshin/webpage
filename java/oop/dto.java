package oop;
// getter, setter : 데이터를 주고 받는 역할을 하는 class (※설명 web1.java 참고)

import java.util.ArrayList;

public class dto {
	String id, name, email, age;
	ArrayList<String> all_arr = new ArrayList<String>();	//전역 1차배열

	public String getId() {	// getter (return 메소드)
		return id;
	}

	public void setId(String id) {	// setter (필드에 있는 변수를 데이터에 삽입)
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	//전역 형태의 배열
	public ArrayList<String> make2(){
		this.all_arr.add(getName());
		return this.all_arr;
	}
	
	//1차 배열
	public ArrayList<String> make(){
		ArrayList<String> arr = new ArrayList<String>();
		arr.add(getId());
		arr.add(getName());
		arr.add(getEmail());
		arr.add(getAge());
		
		return arr;
	}
	
	
	
	//2차 배열
	public ArrayList<ArrayList<String>> data(){
		//1차배열 생성
		ArrayList<String> al = new ArrayList<String>();
		
		//최종 2차 배열 생성 후 return 으로 데이터 반환
		ArrayList<ArrayList<String>> all = new ArrayList<ArrayList<String>>();
;		return null;
	}
}
