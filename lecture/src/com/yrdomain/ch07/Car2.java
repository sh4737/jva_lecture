package com.yrdomain.ch07;

public class Car2 {
	//�ʵ�
	Tire2 frontLeftTire = new Tire2("�տ���", 6);
	Tire2 frontRightTire = new Tire2("�տ�����", 2);
	Tire2 backLeftTire = new Tire2("�ڿ���", 3);
	Tire2 backRightTire = new Tire2("�ڿ���", 4);
	
	//������
	
	//�޼ҵ�
	int run() {
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		if(frontLeftTire.roll() == false) { stop(); return 1; }
		if(frontRightTire.roll() == false) { stop(); return 2; }
		if(backLeftTire.roll() == false) { stop(); return 3; }
		if(backRightTire.roll() == false) { stop(); return 4; }
		return 0;
		
	}
	
	void stop() {
		System.out.println("[�ڵ����� ����ϴ�.]");
	}

}
