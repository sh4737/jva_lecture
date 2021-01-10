package com.yrdomain.ch06;

public class Car3 {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car3() {							// 1생성자
	}
	
	Car3(String model) {				// 2생성자
		this.model = model;
	}
	
	Car3(String model, String color) {	// 3생성자
		this.model = model;
		this.color = color;
	}
	
	Car3(String model, String color, int maxSpeed) { // 4생성자
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	

}
