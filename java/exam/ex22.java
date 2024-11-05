package exam;

import java.util.ArrayList;
import java.util.Scanner;

/*
 응용문제3
  
  
  
  */
public class ex22 {
	public static void main(String[] args) {
		//new ex22_box().abc();
		new ex22_box().product();
	}
}
              
                             
class ex22_box extends ex_ab{
	

	//내코드
	ArrayList<String> al = null;
	public void abc() {
		while(true) {
		System.out.println("추가할 상품명을 입력하세요: ");
		String pdname = super.sc.nextLine();
			if(pdname.equals("종료")) {
				break;
			}
			this.al = product(pdname);
		}
		super.sc.close();
		System.out.println(al);
	}
	
	//선생님코드
	public void product() {
		ArrayList<String> result = new ArrayList<String>();
		result = super.arr_make("추가할 쿠폰명을 입력하세요: ");
		System.out.println(result);
	}
}