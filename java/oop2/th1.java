package oop2;
//멀티쓰레드 환경(class를 로드하여 출력하는 형태)
/*
 Thread는 기본으로 1Thread로 작동
 Thread클래스를 해당클래스로 상속시킨 후
 Thread선언, start()메소드 활용시 멀티쓰레드로 작업환경이 변경됨.
 단, 웹 기본 속성은 단일쓰레드임.
  */
public class th1 {

	public static void main(String[] args) {	
		/*
		//단일쓰레드 구성코드
		th1_box th = new th1_box();
		th.aaa();
		th.bbb();
		int w = 0;
		do {
			th1_box thb = new th1_box();
			thb.ccc(w);
			w++;
		}while(w<=20);
		*/
		 		
		//멀티쓰레드 호출
		int w = 0;
		do {
			th2_box thb = new th2_box(w);
			Thread th = new Thread(thb);
			th.start();		//run()메소드 호출+실행			
			//new Thread(new th2_box(w)).start(); //위 3줄을 한줄로 줄임
			
			//thb.zzz(w);	//멀티쓰레드미작동(단일쓰레드작동)
			w++;
		}while(w<=20);
				
	}
}
//멀티쓰레드
class th2_box extends Thread{
	int no = 0;
	public th2_box(int n) {	//즉시실행
		this.no = n;
	}
	
	public void zzz(int n) {		//멀티쓰레드 미적용
		System.out.println(this.no);
	}
	
	@Override
	public void run() {		//멀티쓰레드 클래스를 적용한 메소드
		System.out.println(this.no);
	}
}

//단일쓰레드
class th1_box{
	public void ccc(int z) {
		System.out.println("c" + z);
	}
	
	public void aaa() {
		int w = 0;
		do {
			System.out.println("a" + w);
			w++;
		}while(w<=20);
	}
	public void bbb() {
		int w = 0;
		do {
			System.out.println("b" + w);
			w++;
		}while(w<=20);
	}
}