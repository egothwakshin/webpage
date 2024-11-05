package exam;
//실행(메인)
public class class1 {
	public static void main(String[] args) {
		new class1_box().zzz();
	}
}

class class1_box extends class2{
	
	public void zzz() {
		try {
		super.abc();
		System.out.println(super.datecheck("yyyy-mm-dd"));
		}
		catch(Exception e) {
			
		}
		
	}
}
