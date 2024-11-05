package exam;
//오버라이드(Override) : 추상클래스에서 선언한 메소드 생성
//오버로딩(Overloading) : 추상클래스에서 선언하지 않은 메소드 생성
/* 
1.메소드: default,public,protected 사용가능. 
2.필드에 변수 선언: public, protected 사용가능
					단, abstract에서 private으로 처리하는 변수일 경우 사용가능
3. abstract에서 '즉시실행메소드'는 abstract이용 못함
4. 즉시실행 메소드 호출시 abstract 메소드가 아닌 실제 클래스 즉시실행메소드를 호출
*/
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;

//추상클래스
public abstract class ex_ab {
	
	//ex20
	Date times = null;
	protected String datecheck (String part) {
		this.times = new Date();
		SimpleDateFormat sf = new SimpleDateFormat(part);
		String dates = sf.format(times);
		return dates;		
	}
	
	//ex21 내코드
	Scanner sc = new Scanner(System.in);
	protected void paymoney(String z[]) {		
		int f;
		int sum = 0;
		for(f=0; f<z.length; f++) {
			System.out.println(z[f] + " 이체금액: ");
			int money = this.sc.nextInt();
			sum += money;
		}
		sc.close();
		System.out.println(sum);		
	}
	
	//ex21 선생님코드
	protected Integer in_money(String user) {
		this.sc = new Scanner(System.in);
		System.out.println(user + "이체금액: ");
		Integer m = this.sc.nextInt();
		return m;
	}
	
	//ex22 내코드
	ArrayList<String> pd = new ArrayList<String>();
	protected ArrayList<String> product(String z){
		this.pd.add(z);
		return this.pd;	
	}
	
	//ex22 선생님코드
	protected ArrayList<String> arr_make(String qa) {
		this.sc = new Scanner(System.in);
		ArrayList<String> a = new ArrayList<String>();	//입력한 내용리스트
		
		while(true) {
			System.out.println(qa);
			String pdname = this.sc.nextLine();
			if(pdname.equals("종료") || pdname.equals("exit")) {
				break;
			}
			a.add(pdname);
		}
		return a;
	}
	
	//ex25 선생님코드
		private Date times1 = null;
		Scanner sc2 = null;
		InputStream is = null;
		FileOutputStream os = null;
		String url = "";	//경로
		String filename = "";	//파일명
		private byte allbyte[] = null;
		
		protected void file_write(String src, String file) {
			this.url = src;
			this.filename = file;
			try {
				this.os = new FileOutputStream(this.url + this.filename,true);
				this.sc2 = new Scanner(System.in);
			
				while(true) {
					//this.sc.nextByte() : 키보드에 특정키(배열X)
					System.out.println("이동할 URL을 입력하세요: ");
					String msg = this.sc.nextLine() + "\n";
					if(msg.equals("종료\n")) {
						break;	
					}
					this.allbyte = msg.getBytes();
					this.os.write(this.allbyte);					
					this.os.flush();
			
			
				}
			}catch(Exception e) {
				System.out.println("해당파일을 찾을 수 없습니다.");
			}
			finally {
				this.sc2.close();
				try {
				this.os.close();
				}
				catch(Exception e) {
					System.out.println("강제종료 실패!");
				}
			}
			
		}
	}

