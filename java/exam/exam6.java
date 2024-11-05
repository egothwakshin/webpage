package exam;
/*
 응용문제6 - 외부class사용
 다음 데이터 배열을 확인 후 짝수 노드(index)번호 값만 모두 합한 결과를 출력하시오.
 단, 노드번호 0 도 짝수에 포함. 반복문 자유. - 원시배열 사용
 
  60,39,42,7,93,26,38,41,9,12,71
  [결과]
  모든 짝수 합 : 313
  
  
  */
public class exam6 {

	public static void main(String[] args) {
		
		new exam6_box().abc();

	}

}

class exam6_box{
		
	public void abc() {
			
		int arr[] = {60,39,42,7,93,26,38,41,9,12,71};
		
		int sum_even = 0;
		int f;
		for(f=0; f<arr.length; f++) {
			if( f % 2 == 0) {
				sum_even += arr[f];
			}
		}
		System.out.println(sum_even);
		
	}
}
