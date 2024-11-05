package oop2;
//멀티쓰레드 (interface) 활용
/*
 web개발자가 유일하게 Thread 활용하는 경우  -> API Server
 Javascript 멀티쓰레드(4↓) -> web worker
 */
public class th2 {
	public static void main(String[] args) {
		for(int f=0; f<=100; f++) {
			th2_class th = new th2_class();
			th.abc(f);
			Thread tr = new Thread(th);	//interface도 동일하게 Thread 호출
			
			//각 작업별로 Thread가 휴식기 및 활동을 각각 별개로 작업이 이뤄짐.
			try {
				tr.sleep(1000);
				tr.start();
			}
			catch(Exception e) {
				System.out.println("쓰레드 문제 발생!");
			}
		}
	}
}
//interface Thread (Runnable 활용하며 run작동)
class th2_class implements Runnable{
	int n = 0;
	public void abc(int z) {
		this.n = z;
	}
	
	@Override
	public void run() {		//run 메소드에 코드 작성시 결과값은 다르게 출력됩니다.
		try {
		//Thread.sleep(5000);				//Thread.sleep : 휴식기(시간) 1000 = 1초
		System.out.println(this.n);
		}
		catch(Exception e) {
			System.out.println("Thread 오류 발생!");
		}
	}
}
