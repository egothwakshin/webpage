package oop;
//다차원 배열
/*
응용문제
실버 회원 정보 리스트만 데이터를 추출하여 출력하시오.
출력방식은 다음과 같습니다.
[결과]
강감찬
실버
2500

이순신
실버
2200 
 
   
 */
public class array8 {

	public static void main(String[] args) {
		/*
		String data[][][] = {
				{
					{"홍길동", "강감찬", "유관순", "이순신", "이산"},
					{"일반", "실버", "골드", "실버", "일반"}											
				},
				{
					{"1500", "2500", "1000", "2200", "3000"},
				
				}	
				
		};
		*/
		
		
		
		String data[][][] = {
				{
					{"홍길동", "강감찬", "유관순", "이순신", "이산"},
					{"일반", "실버", "골드", "실버", "일반"}											
				},
				{
					{"1500", "2500", "1000", "2200", "3000"},
					{"5%", "10%", "20%", "10%", "5%"}
				}	
				
		};
		
		
		
		/*
		해당 배열을 기준으로 다음 결과를 출력하는 코드를 작서하시오.
		[결과]
		고객명
		회원등급
		포인트				  
		 */
		
		int gp0 = data[0].length;	// 그룹0 안에 그룹개수 = 2
		int gp1 = data[1].length;	// 별도그룹. 그룹1 안에 그룹개수 = 1
		int ea = data[0][1].length;	// 그룹0 의 첫번째 그룹의 데이터개수 = 5
		//System.out.println(gp0);
		//System.out.println(gp1);
		//System.out.println(ea);
		
		
		int f,ff,fff;
		for(f=0; f<ea; f++) {
			if(data[0][1][f] == "실버") {
				for(ff=0; ff<gp0; ff++) {
					System.out.println(data[0][ff][f]);
				}
				for(fff=0; fff<gp1; fff++) {
					System.out.println(data[1][fff][f]);
				}
			}
		}
		

			
		
		
		
		
		
		/*
		int w = 0;
		while(w < ea) {	// ea=5
			int ww = 0;
			while(ww < gp0) {	// gp=2
				System.out.println(data[0][ww][w]);
				ww++;
			}
			System.out.println(data[1][0][w]);
			w++;
		}
		*/
		
		/*
		int w = 0;
		while(w < ea) {	// ea=5
			int ww = 0;
			while(ww < gp0) {	// gp=2
				System.out.println(data[0][ww][w]);
				ww++;
			}
			//별도그룹
			int www = 0;
			while(www < gp1) {
				System.out.println(data[1][www][w]);
				www++;
			}
			w++;
		}
		*/
		
		

	}

}
