package com.yrdomain.ch07;

public class SportsCar1 extends Car1 {
	@Override
	public void speedUp() { speed += 10; }
	
	//�������̵��� �� �� ����
	@Override
	public void stop() {
		System.out.println("������ī�� ����");
		speed = 0;
	}

}
