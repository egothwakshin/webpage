package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam15T {
	public static void main(String[] args) {
		ex15_box ex = new ex15_box();
		ex.pdmake();
	}

}

class ex15_box{
	Scanner sc = new Scanner(System.in);
	List<ArrayList<String>> pd = new ArrayList<ArrayList<String>>();	
	exdto ed = new exdto();
	
	public void pdmake() {
			
		System.out.println("상품명을 입력하세요: ");
		String info1 = this.sc.nextLine();
		ed.setPd_name(info1);
		
		System.out.println("상품가격을 입력하세요: ");
		String info2 = this.sc.nextLine();
		ed.setPd_price(info2);
		
		System.out.println("상품수량을 입력하세요: ");
		String info3 = this.sc.nextLine();
		ed.setPd_ea(info3);
		
		this.pd.add(ed.make());
		
		System.out.println(this.pd);
			
		this.pdmake();
		this.sc.close();
	}
	
}
