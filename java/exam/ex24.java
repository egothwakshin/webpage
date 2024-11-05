package exam;
//menu_interface.java 연계
/*
 응용문제3
 메뉴를 주문하는 프로세서를 interface로 작성
 
  "메뉴를 선택해주세요 [1.돈까스, 2.함박스테이크, 3.냉면, 4.콩국수]: "
  해당 메뉴 외에 숫자 입력시 "메뉴에 없는 코드입니다."
  출력후 프로세서 종료( system.exit(0) )
  메뉴설명
  돈까스 : 9000, 약간 매운맛, 우동
  함박스테이크 : 14500, 담백한 맛, 야채튀김
  냉면 : 10000, 새콤달콤한 맛
  콩국수 : 4800, 달콤한 맛, 서리태콩국수
  
  */

import java.util.Scanner;

public class ex24 {
	public static void main(String[] args) {
		menu_choice mc = new menu_choice();
		mc.choice();
		
	}
}
class menu_choice{
	ex24_box eb = new ex24_box();
	String menu[] = {"돈까스","함박스테이크","냉면","콩국수"};
	Scanner sc = new Scanner(System.in);
	
	public void choice() {
		
		System.out.printf("메뉴를 선택해주세요 [1.%s 2.%s 3.%s 4.%s]:%n", menu[0], menu[1],menu[2],menu[3]);
		int kk = this.sc.nextInt();
		String result = "";
		switch(kk) {
			case 1:
				result = this.menu[0] + ": " + eb.menu_inter(1);
				break;
			case 2:
				result = this.menu[1] + ": " + eb.menu_inter(2);
				break;
			case 3:
				result = this.menu[2] + ": " + eb.menu_inter(3);
				break;
			case 4:
				result = this.menu[3] + ": " + eb.menu_inter(4);
				break;
			default:
				break;	
		}
		System.out.println(result);
		
	}
}

class ex24_box implements menu_interface{
	String mi[][] = {
			{"9000","14500","10000","4800"},
			{"약간매운맛","담백한맛","새콤달콤한맛","달콤한맛"},
			{"우동","야채튀김","","서리태콩국수"}		
	};
	@Override
	public String menu_inter(int z) {
		String str = "";
		if(z==3) {
			str = mi[0][z-1] + ", " + mi[1][z-1];
		}
		else {
			str = mi[0][z-1] + ", " + mi[1][z-1] + ", "+ mi[2][z-1];
		}
		return str;
	}
}

