package oop2;
//ab1.java와 연계
 import java.util.ArrayList;
import java.util.Scanner;

import oop.oop2;

public class oop_class3 {
	public static void main(String[] args) {
		new oc3_box().ab_method1("유관순");
		new oc3_box().ab_method1();
		new oc3_box().ab_method1(300);
	}
}

class oc3_box extends ab1{
	
	@Override
	public void ab_method1(int level) {
		kk = level;
	System.out.println(level);
	}
	@Override
	public void ab_method1() {
		System.out.println(this.level);
	}
	@Override
	public void ab_method1(String uid) {
		this.userid = uid;
		System.out.println(this.userid);
		System.out.println("사용자 이름을 입력하세요: ");
		String username = this.sc.nextLine();
		System.out.println(username);
		this.sc.close();
		this.all = new ArrayList<String>();
		this.all.add("HTML");
		this.all.add("CSS");
		this.all.add("JAVA");
		System.out.println(this.all);
	}
}