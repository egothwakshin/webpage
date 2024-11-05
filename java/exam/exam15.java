package exam;
//exdto를 이용한 DTO 응용편
/*
응용문제4
DTO를 이용하여 클래스 배열에 저장 되도록 합니다.
입력사항은 다음과 같습니다.

[상품등록]
상품명을 입력하세요 : 
상품 가격을 입력하세요 :
상품 수량을 입력하세요 : 

[등록된 상품 리스트]
[ ["냉장고","600000","5"], ["에어콘","1500000","2"] ] 

*/
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class exam15 {

	public static void main(String[] args) {
		
		new exam15_box().abc();

	}

}

class exam15_box{
	
	//내코드
	/*
	Scanner sc = new Scanner(System.in);
	List<ArrayList<String>> all = new LinkedList<ArrayList<String>>();
	ArrayList<String> al = new ArrayList<String>();
	exdto dt = new exdto();
	*/
	
	
	public void abc() {
		
		//내코드
		/*

		int f;
		for(f=1; f<=2; f++) {
			System.out.println("상품명을 입력하세요: ");
			String name = sc.nextLine();
			System.out.println("상품가격을 입력하세요: ");
			String price = sc.nextLine();
			System.out.println("상품수량을 입력하세요: ");
			String ea = sc.nextLine();
			dt.setPd_name(name);
			dt.setPd_price(price);
			dt.setPd_ea(ea);
			al = dt.make();
			all.add(al);
		}
		
		System.out.println(all);
		*/
		
	}	
}
