package mypractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import oop.arraylist1;

public class twoclassarray2 {

	public static void main(String[] args) {
		new twoclassarray2_box().abc();

	}

}


class twoclassarray2_box{
	
	String data[][] = {
			{"대한민국","일본","중국","베트남","태국"},
			{"40","35","70","55","32"}
			};
	List<ArrayList<String>> all = new LinkedList<ArrayList<String>>();
	ArrayList<String> ns = new ArrayList<String>();
	
	public void abc() {
		int f;
		for(f=0; f<data[0].length; f++) {
			String nw[] = {data[0][f], data[1][f]};
			this.ns = make(nw);
			all.add(this.ns);
			
		}
		System.out.println(all);
		
	}

	public ArrayList<String> make(String kk[]){
		ArrayList<String> cr = new ArrayList<String>(Arrays.asList(kk)); 
		return cr;
	}
}
