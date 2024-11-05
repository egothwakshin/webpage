package mypractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class twoclassarray {

	public static void main(String[] args) {
		new twoclassarray_box().abc();
		
	}

}

class twoclassarray_box{
	
	String data[][] = {
			{"대한민국","일본","중국","베트남","태국"},
			{"40","35","70","55","32"}
			};
	
	List<ArrayList<String>> all = new LinkedList<ArrayList<String>>();
	
	public void abc() {
		
		int f;
		for(f=0; f<data.length; f++) {
			ArrayList<String> result = kkk(data[f]);
			all.add(result);
			
		}
		System.out.println(all);
	}
	
	public ArrayList<String> kkk(String zz[]) {
		ArrayList<String> cr = new ArrayList<String>(Arrays.asList(zz));
		
		return cr;
	}
	
	
	
	
}
