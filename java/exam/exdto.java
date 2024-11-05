package exam;
//dto = exam15.java와 연계

import java.util.ArrayList;

public class exdto {

	String pd_name, pd_price, pd_ea;
	ArrayList<String> all = null;

	public String getPd_name() {
		return pd_name;
	}

	public void setPd_name(String pd_name) {
		this.pd_name = pd_name;
	}

	public String getPd_price() {
		return pd_price;
	}

	public void setPd_price(String pd_price) {
		this.pd_price = pd_price;
	}

	public String getPd_ea() {
		return pd_ea;
	}

	public void setPd_ea(String pd_ea) {
		this.pd_ea = pd_ea;
	}
	
	//내코드
	/*
	public ArrayList<String> make(){
		ArrayList<String> arr = new ArrayList<String>();
		arr.add(getPd_name());
		arr.add(getPd_price());
		arr.add(getPd_ea());
		return arr;	
	}
	*/
	
	//선생님코드
	public ArrayList<String> make(){
		this.all= new ArrayList<String>();
		this.all.add(getPd_name());
		this.all.add(getPd_price());
		this.all.add(getPd_ea());
		return this.all;
	}
	
	
}
