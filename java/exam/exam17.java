package exam;
/*
응용문제6
다음 배열을 기준으로 예외처리를 적용시켜서 정상적으로 출력 되는 코드를 작성하시오.
문자배열 {"1000","2000","","400","","600"} 을 숫자배열로 변경
숫자배열 [1000,2000,0,400,0,600]
*/
import java.util.ArrayList;

public class exam17 {
	public static void main(String[] args) {
			//내코드 new exam17_box().abc();
		new ex17_box();
		
	}
}

class ex17_box{
	private String[] data = null;
	private ArrayList<Integer> data2 = new ArrayList<Integer>(); //숫자처리 배열
	
	public ex17_box() {
		this.data = new String[] {"1000","2000","","400","","600"};
		try {
		this.check();
		}
		catch(Exception e) {
			System.out.println("해당 메소드 전송 오류 발생!!");
		}		
	}
	public void  check() throws Exception {
		int w = 0;
		do {
			try {
				this.data2.add(Integer.valueOf(data[w]));
			}catch(Exception e) {
				//e.printStackTrace();
				//e.getMessage();
				System.out.println(e);	
				try {
					this.data2.add(0);
				}catch(Exception e2) {
					System.out.println(e2);
				}
			}
			w++;
		}while(w<this.data.length);
		System.out.println(this.data2);
		
	}
}

//내코드 (미완성)
/*
class exam17_box{
	
	String arr[] = {"1000","2000","","400","","600"};
	ArrayList<Integer> al = new ArrayList<Integer>();
	
		
	public void abc() {
		
		try {
			int f;
			for(f=0; f<arr.length; f++) {
				al.add(Integer.parseInt(arr[f]));
			}
			System.out.println(al);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
*/
