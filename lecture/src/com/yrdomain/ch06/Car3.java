package com.yrdomain.ch06;

public class Car3 {
	//�ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	//������
	Car3() {							// 1������
	}
	
	Car3(String model) {				// 2������
		this.model = model;
	}
	
	Car3(String model, String color) {	// 3������
		this.model = model;
		this.color = color;
	}
	
	Car3(String model, String color, int maxSpeed) { // 4������
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	

}
