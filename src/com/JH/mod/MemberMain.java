package com.JH.mod;

public class MemberMain {

	public static void main(String[] args) {
		Member m = new Member("jae", 26, 50.0, 178.0);
		m.check();
		
		m.setAge(25);
		m.check();

	}

}
