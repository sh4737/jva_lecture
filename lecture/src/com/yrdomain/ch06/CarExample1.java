package com.yrdomain.ch06;

public class CarExample1 {
	public static void main(String[] args) {
		// ��ü ����
		Car1 myCar = new Car1();
		
		//�ʵ尪 �б�
		System.out.println("����ȸ��: " + myCar.company);
		System.out.println("�𵨸�: " + myCar.model);
		System.out.println("����: " + myCar.color);
		System.out.println("�ְ�ӵ�: " + myCar.maxSpeed);
		System.out.println("����ӵ�: " + myCar.speed);
		
		//�ʵ尪 ����
		myCar.speed = 60;
		System.out.println("������ �ӵ�: " + myCar.speed);
	}

}
