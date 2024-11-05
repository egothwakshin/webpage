package oop;

//자료형2. 자료형 변환.
public class oop2 {

	public static void main(String[] args) {
		boolean ck = true; // true 또는 false
		System.out.println(ck);

		// byte : 주로 파일 용량 체크시 사용
		byte money = 127;
		System.out.println(127);

		// int : 21억, long : 9경,
		long a = 2234567891L;
		short b = 32345; // short : 3만정도까지

		// 문자 자료형을 클래스로 변환
		char word = '홍';
		String name = String.valueOf(word); // char -> String 변환
		System.out.println(name);
		System.out.println(name.getClass()); // class 타입형태
		System.out.println(name.getClass().getName());

		// 문자열 클래스에서 문자 자료형으로 변환
		String id = "hong";
		char word2 = id.charAt(2); // charAt(배열번호)
		System.out.println(word2);

		/* Integer => short, int, long, byte */
		// 숫자 자료형을 클래스로 변환
		int n = 100;
		Integer z = n;
		System.out.println(z);

		// 숫자 클래스를 숫자 자료형으로 변환
		Integer n2 = 1000;
		int z2 = n2;
		System.out.println(z2);

		// 문자열 클래스를 숫자형 클래스 또는 숫자형 자료형으로 변환
		String total = "10000";
		String etc = "1989";

		/*
		 * parseInt : 기본자료형 int -> 직접적으로 문자 데이터를 변환
		 * valueOf : 기본자료형 int -> 문자 데이터값을 '검토'후 변환
		 */

		int all = Integer.parseInt(total) + Integer.valueOf(etc);
		System.out.println(all);

		float m = 38.72f;
		String sm = String.valueOf(m);
		System.out.println(sm);

	}
}
