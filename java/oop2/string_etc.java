package oop2;
//String, StringBuilder, StringBuffer
public class string_etc {

	public static void main(String[] args) {
		/*같은 자료형(또는 자료형클래스)이더라도 new가 붙으면
		인스턴스 영역(메모리)으로 변경되므로 다름*/
		String a = "a1234";
		String b = "a1234";
		String c = new String("a1234");
		String d = new String("a1234");
			
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		System.out.println(a==c);
		System.out.println(a.equals(c));
		
		System.out.println(c==d);
		
		/*StringBuffer, StringBuilder : 멀티쓰레드를 이용함
		  StringBuffer : 멀티 쓰레드가 빠름
		  StringBuilder : 단일 쓰레드가 빠름
		 */
		StringBuffer sb = new StringBuffer();	
		sb.append("홍길동");
		sb.append("님 환영합니다");
		System.out.println(sb);
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append("이순신");
		sb2.append("포인트는5000입니다.");
		System.out.println(sb2);
	}

}
