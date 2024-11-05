package exam;

import java.util.Scanner;

/*
 응용문제1
 Scanner 라이브러리를 이용하여 다음과 같이 결과가 나오도록
 코드를 작성하시오.
 단, 최대 및 최소값은 다음과 같습니다. 0~100
 [결과]
 "점수를 입력해주세요 : xx "
 100~80 : A등급
 79~60 : B등급
 59~40 : C등급
 39 이하 : D등급 
  
  
  */
public class exam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력해주세요 : ");
		int score = sc.nextInt();
		
			if(score >= 80 && score <=100) {
				System.out.println("A등급");
			}
			else if(score >=60 && score <= 79) {
				System.out.println("B등급");
			}
			else if(score >=40 && score <= 59) {
				System.out.println("C등급");
			}
			else if(score >=0 && score <=39 ){
				System.out.println("D등급");
			}
			else if(score < 0 || score > 100){
				System.out.println("0~100 까지만 입력가능합니다.");
			}
			
		

	}

}

