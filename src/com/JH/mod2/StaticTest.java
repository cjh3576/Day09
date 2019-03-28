package com.JH.mod2;

public class StaticTest {
	public int num = 10;
	public static int num2 = 20;
	public void instanceMethod() {
		System.out.println("멤버메소드");
		StaticTest.staticMethod();
	}
	
	public static void staticMethod() {
		System.out.println("클래스메소드");
	
		
	}
}
