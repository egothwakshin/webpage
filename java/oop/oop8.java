package oop;
//반복문 for
public class oop8 {

	public static void main(String[] args) {
		oop8_for op8f = new oop8_for();
		op8f.abc();

	}

}
  
class oop8_for{
	
	public void abc() {
		int f;
		for( f=1; f<=10; f++) { // 1~10 오름차순
			//System.out.println(f);
			break;
			// break : 반복문 강제 종료
		}
		
		for( f=5; f>0 ; f--) {	// 5~1 내림차순
			//System.out.println(f);
		}
		
		for( f=1; f<10 ; f++) {
			//System.out.printf("8 x %d = %d%n", f, 8*f);
			//System.out.println(8 + " x " + f + " = " + 8*f );
		}
		
		/*
		 응용문제2. 반복문+조건문
		 1~50 까지의숫자 중 5의 배수만 출력,
		 25 이상이 되면 강제 정지
		 */
		
		for ( f=1 ; f<=50; f++) {
			if( f % 5 == 0) {
				//System.out.println(f);	
			
			}
			if( f >= 25) {
				break;
			}
			//System.out.println(f);
		}
		
		//무한루프 + break
		for ( f=1; ; f++) {
			//System.out.println(f);
			if( f>=50) {
				break;				
			}
		}
		
		//continue 사용법
		int p;
		for( p=1; p<20; p++) {
			if(p==10 || p==13 || p==17) {
				continue;
				//해당 코드 실행시 '반복문' 아래 코드는 실행 안 됨.
			}
			System.out.println(p);
		}
	}
}