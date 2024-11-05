package game;

import java.util.Scanner;

//업 & 다운 게임
public class updown {

	public static void main(String[] args) {
		new ud().gm();

	}

}

class ud {

	int pc, user;
	int count = 0; // 게임 실행횟수
	Scanner sc = null;

	public void gm() {
		/*
		 * random 사용법 int a = (int)Math.ceil(Math.random()*10); int b =
		 * (int)Math.floor(Math.random()*10); int c = (int)Math.round(Math.random()*10);
		 */
		/*
		 * 추가옵션: 기회는 총 3번 3번 이상 틀릴 경우 "컴퓨터 승리" 라고 출력하시오.
		 * 
		 */
		this.pc = (int) Math.ceil(Math.random() * 20);
		this.sc = new Scanner(System.in);
		do {

			System.out.println("1~20까지 숫자 중 하나를 입력하세요 : ");
			this.user = this.sc.nextInt(); // 사용자가 입력할 숫자
			if (this.pc == this.user) {
				System.out.println("정답!");
				break;
			} else {
				this.count++;
				if (this.pc < this.user) {
					System.out.println("Down!");
					
				} else {
					System.out.println("Up!");
				
				}
				if (this.count == 3) {
					System.out.println("컴퓨터승리!");
					break;
				}
			}
		} while (true);

	}
}
