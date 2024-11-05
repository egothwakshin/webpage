package oop;

import java.util.Arrays;

// 상품 출력 파트(datalist.java와 연계)
public class product{

	public static void main(String[] args) {
		new_product npd = new new_product();
		//npd.np();
		//npd.aaa();
	}

}
// 신규상품 출력 파트
class new_product{
	datalist dl = new datalist();	// 외부파일의 datalist 클래스 로드
	/*
	 응용문제
	 이벤트 상품으로 해당 출력하는 파트가 있습니다.
	 이벤트 상품 중 할인율이 20% 이상 되는 상품만 출력하시오. 
	  */
	
	public void aaa() {
	
		String zzz[][] = this.dl.product();
		int gp = zzz.length; // 상품종류 9
		int ea = zzz[0].length;	// 상품내역 6	
		
		int w = 0;
		do {
			int ww = 0;
			while( ww < ea) {
				if(zzz[w][1]=="Y") {		//할인 상품만 거르는 조건
					if( Integer.parseInt( zzz[w][4]) >= 20 ) // Integer.parseInt()문자형을 숫자로 전환
						System.out.println(zzz[w][ww]);
				}
				ww++;
			}
			w++;
		}while(w < gp);
		
		
	}
	
	
	
	public void np() {	// 상품 출력파트 (할인 상품만 출력 합니다.)

		String arr[][] = this.dl.product();
		//System.out.println(Arrays.deepToString(arr));		
		
		int gp = arr.length; // 그룹개수. 상품종류 9
		int ea = arr[0].length;	// 데이터개수. 상품내역 6				
		
		int w = 0 ;
		while(w < gp) {
			//System.out.println(Arrays.toString(arr[w]));
			//[]괄호 하나넣었기 때문에 toString 써도 가능함.
			if(arr[w][1] == "Y") {	// 할인이 적용된 상품
				int z = 0;
				while(z < ea) {
					System.out.println(arr[w][z]);	//최종 상품 출력 부분
					z++;
				}
			}
			w++;			
		}
		
	}
}
