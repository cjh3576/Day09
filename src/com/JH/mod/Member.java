package com.JH.mod;

public class Member {
	private String name;
	private int age;
	private double weight;
	private double height;

	//생성자 두개 
	// 디폴트 생성자
	//회원정보를 매개변수로 받는 생성자

	public Member() {
//		this.name = "hyuk";
//		this.age = 26;
//		this.height = 178.0;
//		this.weight = 70.0;
	}
	public Member(double weight) {
		this.weight = weight;
	}
	
	public Member(String name, int age, double weight, double height) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void check () {
		//자기키 - 100) *0.95) = 결과물이 자기 몸무게보다 작다면 비만출력 / 크면 저체중 / 같으면 표준
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.weight);
		System.out.println(this.height);
		if((this.height - 100.0) *0.95>this.weight) {
			System.out.println("저체중 입니다.");
		}
		else if ((this.height - 100.0) * 0.95 == this.weight) {
			System.out.println("표준체중 입니다." );
		}
		else if ((this.height - 100.0) *0.95 < this.weight) {
			System.out.println("비만 체중입니다. ");
		}
	}
}
