package oop;

import java.util.Scanner;

/*
응용문제.
사용자가 3개의 값을 물어봅니다.
첫번째 숫자 : 2
두번째 숫자 : 4
짝수 또는 홀수를 입력 : 홀수
2단~4단 결과값 중 홀수구구단만 출력되게 하는코드.

[결과]
3 * 1 = 3
3 * 3 = 9
3 * 5 = 15
3 * 7 = 21
3 * 9 = 27

cf)'짝수' 입력시
2 * 1 = 2
....
2 * 9 = 18

3 * 2 = 6
3 * 4 = 12
3 * 6 = 18
3 * 8 = 24

4 * 1 = 4
...
4 * 9 = 36

*/
public class oop22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자 입력 : ");
		int aa = sc.nextInt();
		System.out.println("두번째 숫자 입력 : ");
		int bb = sc.nextInt();
		System.out.println("홀수 또는 짝수 입력 : ");
		String cc = sc.next(); // sc.nextLine(); 은 왜 안될까??
						
		oop22_box op22 = new oop22_box();
		op22.gugu(aa, bb, cc);
	}

}

class oop22_box{
	public void gugu(int x, int y, String z) {
		int f;
		for(f=x; f<=y; f++) {
			int ff=1;
			while(ff<10) {
				if(z.equals("홀수")) {
					if(f*ff % 2 != 0){
						System.out.println(f + " x " + ff + " = " + f*ff);
					}
				}
				else if(z.equals("짝수")) {
					if(f*ff % 2 ==0) {
						System.out.printf("%d x %d = %d%n", f, ff, f*ff);
					}
				}
				ff++;
			}
		}
		
	}
}
