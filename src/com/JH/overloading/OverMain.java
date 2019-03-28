package com.JH.overloading;

public class OverMain {

	public static void main(String[] args) {
		Cal cal = new Cal();
		CalView calview = new CalView();
		
		int hap = cal.plus(10, 20);
		float fhap = cal.plus(10.2f, 20.2f);
		calview.viewInt(hap);
		calview.viewfloat(fhap);
		
		
	}

}
