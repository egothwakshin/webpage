package oop2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//멀티쓰레드 응용편
/*
 응용문제
 Thread 를 이용하여 배열의 모든 합을 출력하시오.  
  */
public class th3 {
	public static void main(String[] args) {
		Integer data1[] = {10,20,30,40,50,60,70,80,90};
		Integer data2[] = {5,10,15,20,25,30,35,40,45};
		Integer data3[] = {7,14,21,28,35,42,49,56,63};
		/*
		//내코드
		th_box th1 = new th_box(data1);
		th_box th2 = new th_box(data2);
		th_box th3 = new th_box(data3);
		
		Thread th = new Thread(th1);
		th.start();
		
		th = new Thread(th2);
		th.start();
		
		th = new Thread(th3);
		th.start();
		*/
		
		/*
		원시배열에서 신규 원시배열로 이관방법
		Integer mk[] = data1;
		System.out.println(Arrays.asList(mk));
		 */
		
		/*
		선생님코드★ 반복문 활용하여 멀티쓰레드호출	
		(Object배열을 이용하여 여러 배열을 순차적으로 적용하는 방법)
		*/
		
		Object data_all[] = {data1, data2, data3};
		//Integer list[] = (Integer[])data_all[0];
		//System.out.println(Arrays.asList(list));
		
		int w = 0;
		while(w<data_all.length) {
			//new Thread(new th_box((Integer[])data_all[w])).start();
			th_box tb = new th_box((Integer[])data_all[w]);
			Thread td = new Thread(tb);
			td.start();			
			w++;
		}
		
	}
}

class th_box extends Thread{
	ArrayList<Integer> all = null;
	
	public th_box(Integer z[]) {
		this.all = new ArrayList<Integer>(Arrays.asList(z));
		System.out.println(Arrays.asList(z));
		
	}
	@Override
	public void run() {
	 int w =0;
	 int sum =0;
	 while(w<all.size()) {
		 sum += all.get(w);
		 w++;
	 }
	 System.out.println(sum);
	}
}
