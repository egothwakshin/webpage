package exam;
/*
응용문제5
다음 댓글을 입력하는 프로세서를 제작해야 합니다. 다음과 같이 결과가 출력 되어야 합니다.

[댓글입력]
내용을 입력해 주세요 : JAVA가 너무 어려워요~~~ 공부해야 하는데..돔봥와~~
[출력결과]
[JAVA가 너무 어려워요~~~ 공부해야 하는데..돔봥와~~, 2024-05-17 14:22:17] 
 
*/
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class exam16 {

	public static void main(String[] args) {
		
		//내코드 new exam16_box().abc();
		
		ex16_box ex = new ex16_box();
		
	}
}

class ex16_box{
	Scanner sc = null;
	private ArrayList<String> all = new ArrayList<String>();
	private String msg = "";	//내용입력하는 변수
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	Date today = null;

	
	public ex16_box() {	//즉시실행메소드
		this.abc();	//은닉화 호출
	
	}
	private void abc() {
		this.sc = new Scanner(System.in);
		this.msg = this.sc.nextLine();
		this.today = new Date();	//날짜를 저장하는 형태의 데이터일 경우 최종 마지막 입력사항 밑에 처리가 되도록 합니다.
		this.all.add(this.msg);
		this.all.add(this.sdf.format(today));
		System.out.println(this.all);
	}
}



//내코드
/*
class exam16_box{
	
	Scanner sc = new Scanner(System.in);
	
	public void abc() {
		
		System.out.println("내용을 입력해주세요: ");
		String str = this.sc.nextLine();
		Date day = new Date();
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(str + ", " +  sim.format(day));
	}
}
*/

	//현재시간출력
	/*
	Date day = new Date();	//PC시간 라이브러리 로드
	
	 yyyy:년도 MM:월 dd:일
	 HH(hh):시간, mm:분, ss:초
	 a: 오전(AM),오후(PM) 을 표시하는 인자값
	 E: 요일
	 Locale: 언어셋을 변경할 때 사용하는 라이브러리
	
	//SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
	//SimpleDateFormat sim = new SimpleDateFormat("E", Locale.ENGLISH);
	
	System.out.println(sim.format(day));	//출력
	*/

	

