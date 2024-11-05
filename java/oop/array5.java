package oop;

// 2차 배열을 이용한 데이터 응용편
public class array5 {

	public static void main(String[] args) {
		ay5_box ab = new ay5_box();
		ab.abc();

	}

}

class ay5_box {
	// 회원정보 데이터를 배열화 하며, 상수로 적용함.
	final String data[][] = { 
			{ "hong", "kim", "park", "jang" }, 
			{ "a1234", "b1234", "c1234", "abc1234" }, 
			{ "1000", "1500", "2000", "4500" } 
			};

	public void abc() {
		String id = "park";
		String pw = "c1234";
		
		int gp = this.data.length;	//그룹 개수 3
		int ea = this.data[0].length;	// 첫번째 그룹 데이터 개수 4
		int count = 0;		// 카운팅 변수
	
		
		int f,ff;		
		for(f=0; f<ea; f++) {			// ②바깥쪽반복문으로 데이터(가로)돌림
			if(id == this.data[0][f]) {							
				for(ff=0; ff<gp; ff++) {	// ①안쪽반복문으로 그룹(세로) 돌리고
				//System.out.println(this.data[ff][f]); 
					if(pw == this.data[ff][f]) {	//패스워드 검토
						System.out.println("로그인하셨습니다");
						System.out.println(this.data[2][f]);	//포인트 출력
						count++;	// 로그인될 경우 +1 증가
						break;
					}
				}
			}
		}
		//반복문 작동시 해당 조건이 없을 경우 기본카운팅변수값 조건으로 출력
		if(count == 0) {
			System.out.println("아이디 및 패스워드를 확인하세요.");
		}
		
		
	}
}