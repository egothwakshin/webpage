package oop2;
//oop_class2.java 연계, exam패키지 oop_exam.java 연계
public class oop_class1 {
	public static void main(String[] args) {
		new oc1_box().abc();
		oc1_box ob = new oc1_box();
		//ob.user = "강감찬"; 
		//private 변수로 선언되어있어서 외부에서 변경불가능
		ob.age = 55;
		ob.abc();
	}
}

