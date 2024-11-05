package exam;
/*
 응용문제5 - 외부클래스 사용
 다음 데이터리스트가 있습니다.
 다음 결과에 맞는 프로세서를 작성하시오.
 
 단, 원시배열만 사용. 반복문은 do~while
 
 숫자: 10,20,15,3,9,22,8,3,27
 
 [결과]
 모든 합: 117
  
  
  */
public class exam5 {

	public static void main(String[] args) {
		
		new exam5_box().abc();
	}

}

class exam5_box{

	
	public void abc() {
				
		int arr[] = {10,20,15,3,9,22,8,3,27};
		int sum = 0;
		int w = 0;
		do {
			sum += arr[w];
			w++;
		}while(w<arr.length);
		System.out.println("배열의 모든 합 : " + sum);
		
	}
}
