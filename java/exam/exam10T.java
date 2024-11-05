package exam;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class exam10T {

	public static void main(String[] args) {
		Integer a[] = {1,3,6,9,12,15,18,21,24,27};
		LinkedList<Integer> no = new LinkedList<Integer>(Arrays.asList(a));
		System.out.println("변경전 : " + no);
		Scanner sc = new Scanner(System.in);
		System.out.println("1~30 중 숫자 하나를 입력하세요 : ");
		Integer user = sc.nextInt();
		boolean ck = false;	//
		int node = 0;	//node 카운팅
		for(Integer num : no) {		
			if(user==num) {
				break;				
			}
			else if(user<num) {	//배열 값이 클 경우			
				ck = true;
				break;
			}
			/*
			 // 필요없음
			else if(user>num) {	// 사용자 입력값이 배열값보다 더 클 경우
				node++;
				continue;
			}
			*/
			else {
				node++;
			}			
		}
		
		if(ck==true && node != 0) {
			no.add(node,user);
		}
		else if(node == no.size()) {
			no.addLast(user);
		}
		System.out.println(node);
		System.out.println(no);
		
		sc.close();
		
		
	}

}
