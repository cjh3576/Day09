package com.JH.mod2;

public class ModMain {

	public static void main(String[] args) {
		StaticTest.staticMethod();
		System.out.println(StaticTest.num2);

		StaticTest st = new StaticTest();
		st.instanceMethod();

	}

}
