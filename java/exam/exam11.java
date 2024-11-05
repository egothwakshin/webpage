package exam;
/*
 응용문제11
 해당 데이터 배열에 대해 데이터값을 분석하는 프로세서를 제작해야 합니다.
 해당 데이터는 http://mekeyace.kbsn.or.kr/infodata.txt 에 있습니다. 
  [결과]
 
  String user[][] = {
		{"hong","홍길동","hong@gmail.com","경기도","010-1234-5678","SKT"},
        {"kang","강감찬","kang@naver.com","인천광역시","010-3344-5566","KT"},
        {"leesh","이순신","leesh@daum.net","강원도","010-5501-3366","KT"},
        {"hansb","한석봉","hansb@nate.com","제주도","011-4459-3233","SKT"},
        {"leesan","이산","korea_lee@gmail.com","서울","010-5050-5531","LGT"},
		{"do_jong","정도전","do_jong04@naver.com","경기도","010-5050-5531","KT"}
	};
  
  
  */
public class exam11 {

	public static void main(String[] args) {
		
		new exam11_box().abc();

	}

}

class exam11_box{
	
	 final String user[][] = {
				{"hong","홍길동","hong@gmail.com","경기도","010-1234-5678","SKT"},
		        {"kang","강감찬","kang@naver.com","인천광역시","010-3344-5566","KT"},
		        {"leesh","이순신","leesh@daum.net","강원도","010-5501-3366","KT"},
		        {"hansb","한석봉","hansb@nate.com","제주도","011-4459-3233","SKT"},
		        {"leesan","이산","korea_lee@gmail.com","서울","010-5050-5531","LGT"},
				{"do_jong","정도전","do_jong04@naver.com","경기도","010-5050-5531","KT"}
			};
		
	public void abc() {
		
		int w = 0;
		int skt=0, kt=0, lgt=0;
		
		while(w<user.length) {
			if( user[w][5] == "SKT") {
				skt++;
			} 
			else if( user[w][5] == "KT") {
				kt++;
			}
			else if( user[w][5] == "LGT"){
				lgt++;
			}			
			w++;
		}
		System.out.printf("SKT 사용자 : %d%nKT사용자 : %d%nLGT사용자 : %d%n", skt, kt, lgt);
		
				
	}
}
