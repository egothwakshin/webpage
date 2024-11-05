package exam;
/*
응용문제3
http://mekeyace.kbsn.or.kr/muser.txt 해당 데이터 중 나라에 대한 기대심리 데이터를 이용하여
다음과 같이 출력되도록 class 배열을 이용하여 데이터를 커스텀 하시오.

결과 DATA : 
["대한민국(40)","일본(35)","중국(70)","베트남(55)","태국(32)"] 
 */
import java.util.ArrayList;
import java.util.LinkedList;

public class exam14 {
	public static void main(String[] args) {
		new exam14_box().abc();
	}
}

class exam14_box{
	String data[][] = {
			{"대한민국","일본","중국","베트남","태국"},
			{"40","35","70","55","32"}
			};
	LinkedList<LinkedList<String>> all = new LinkedList<LinkedList<String>>();
	LinkedList<String> ls = null;
	ArrayList<String> as = new ArrayList<String>();
		
	public void abc() {
		
		int f,ff;
		
		for(f=0; f<this.data[0].length; f++){
			this.ls = new LinkedList<String>();
			for(ff=0; ff<this.data.length; ff++) {
				System.out.println(this.data[ff][f]);
				this.ls.add(this.data[ff][f]);
			}
			this.all.add(ls);
		}
		System.out.println(this.all);
		
		int w = 0;
		while(w<all.size()) {
		String str = all.get(w).get(0) + "(" + all.get(w).get(1) + ")";
		this.as.add(str);
		System.out.println(str);
		w++;
		}
		System.out.println(this.as);
				
		
		
	}
}
