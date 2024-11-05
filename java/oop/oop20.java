package oop;

import java.util.Scanner;

//더블 반복문(복합) - Scanner 응용편
public class oop20 {

	public static void main(String[] args) {
		//oop20_box box = new oop20_box();
		//box.abc();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요 : ");
		int no1 = sc2.nextInt();
		System.out.println("두번째 숫자를 입력하세요 : ");
		int no2 = sc2.nextInt();
		
		oop20_box2 box2 = new oop20_box2();
		box2.abc(no1, no2);
		
		sc2.close();
		
	}

}

class oop20_box{
	public void abc() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 구구단 숫자를 입력하세요 :");
		int gugu = sc.nextInt();
		System.out.println("두번째 구구단 숫자를 입력하세요 : ");
		int gugu2 = sc.nextInt();
		
		int f, ff;
		for(f= gugu; f<=gugu2; f++) {
			for(ff=1; ff<10; ff++) {
				System.out.println(f + " x " + ff + " = " + f*ff);
			} 
		}
	}
}

class oop20_box2{
	public void abc(int a, int b) {
		int w = a;
		while( w<= b) {			
			for(int f=1; f<10; f++) {
				System.out.println(w + " x " + f + " = " + w*f);
			}
			w++;
		}
	}
}