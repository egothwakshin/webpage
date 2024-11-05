package oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// 2차 class 배열을 이용한 정렬방식
public class web2 {
	public static void main(String[] args) {
		final String a[][] = {
				{"김남주","윤보미","정은지"},
				{"21","19","24"}
		};
		//나이를 오름차순으로 사용하기 위해 만든 클래스배열
		ArrayList<String> all = new ArrayList<String>(Arrays.asList(a[1]));
		Collections.sort(all);
		System.out.println(all);
		
		//최종결과 데이터 배열
		ArrayList<ArrayList<String>> all2 = new ArrayList<ArrayList<String>>();
		
		int ww = 0;
		while(ww<a.length) {	//2
			ArrayList<String> mb = new ArrayList<String>();
			int z = 0;
			while(z<a[0].length) {	//3
				String node = all.get(z);
				//원시배열을 가상 클래스화 하여 indexOf로 위치를 파악(배열번호 위치)
				int ck = Arrays.asList(a[1]).indexOf(node);	// -1 단어 없음. 그외 단어 확인됨
				mb.add(a[ww][ck]);
				//System.out.println(node);
				//System.out.println(ck);
				z++;
			}
			all2.add(mb);	//최종결과 데이터를 그룹순서에 맞게 적용
			ww++;
		}
		System.out.println(all2);
		

	}

}
