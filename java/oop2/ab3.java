package oop2;
//oop_class6.java와 연계
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
//2024-05-13 15:32:24 => Data 규칙성 //2024-5-10 3:32:6 => error
public abstract class ab3 {	
	int number = 0;
	
	public ab3(int a) {		//즉시실행		
		this.number = a;
	}
	public abstract String product();	//문자열메소드
	public abstract Integer basket();	//숫자열메소드
	public void pay() {};					//void메소드		
	
	//현재시간 출력
	public String today() {
		/*
		 yyyy-MM-dd : 년-월-일
		 
		 HH/hh:mm:ss : 시간(24/12)-분-초
		 a:오전/오후 표시인자값
		 
		 E: 요일
		 Locale.(언어명) : 언어셋을 변경할 때 사용하는 라이브러리
		*/
		
		//PC시간 라이브러리 로드
		Date day = new Date();	
		SimpleDateFormat sim1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sim2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
		SimpleDateFormat sim3 = new SimpleDateFormat("E", Locale.ENGLISH);		
		System.out.println(sim1.format(day));
		System.out.println(sim2.format(day));	
		System.out.println(sim3.format(day));	
		
		return sim1.format(day);
	}
}
