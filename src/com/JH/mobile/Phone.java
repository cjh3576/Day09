package com.JH.mobile;

public class Phone {
	String brand;
	int price;
	String color;
	int size;
	public Phone() {
		//디폴트 생성자, 빈생성자, 기본생성자
		//매개변수가 없는 생성자
		//클래스내에 생성자가 하나라도 없으면 컴파일러가 디폴트 생성자를 하나 생성한다.
		this.brand = "LG";
		this.price = 200;
		color = "RED";
		size = 20;
	}
	public Phone(int price) {
		this.brand = "LG";
		this.price = price;
		color = "RED";
		size = 20;
	}
	public Phone(int price, String color) {
		this.brand = "LG";
		this.price = price;
		this.color = color;
		size = 20;
	}
	public Phone(int price, String color, int size) {
		this.brand = "LG";
		this.price = price;
		this.color = color;
		this.size = size;
	}
	
	public void info() {
		System.out.println("phone~~~~~~~~~");
		
	}
}
