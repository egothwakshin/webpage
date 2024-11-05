package exam;

public class ex21 {
	public static void main(String[] args) {
		new ex21_box().pay();
		//new ex21_box().banks();
		//한개씩만 호출해야 error 안뜸
	}
}

class ex21_box extends ex_ab{
	
	String a[] = {"유재석","신동엽","정상훈","아이유","한지민"};
	
	//내코드
	public void pay() {	
		super.paymoney(a);
	}
	
	//선생님코드
	
	Integer total = 0;
	public void banks() {
		int w = 0;
		while( w < a.length) {
			this.total += super.in_money(a[w]);
			w++;
		}
		super.sc.close();
		System.out.println("총입금금액: " + this.total);
	}
	
}
