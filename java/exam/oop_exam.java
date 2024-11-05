package exam;

import oop2.oc1_box;	//패키지가 다를 경우 public class만 로드 가능
						//default class는 로드하지 못함
public class oop_exam {	
	public static void main(String[] args) {
		oop2.oc1_box oc1 = new oc1_box();
		//oc1.age = 80;			//error -> protected 변수는 패키지가 다를경우 값 변경 불가능
		//oc1.abc(); 				//error -> abc메소드가 protected 메소드라서 호출 불가능.
		oc1.agree = false; 		//public - 같은 패키지 및 다른 패키지에서도 변경 및 핸들링가능
		System.out.println(oc1.agree);

	}

}
