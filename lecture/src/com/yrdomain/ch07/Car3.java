package com.yrdomain.ch07;

public class Car3 {
	//�ʵ�
	Tire2[] tires = {
			new Tire2("�տ���", 6),
			new Tire2("�տ�����", 2),
			new Tire2("�ڿ���", 3),
			new Tire2("�ڿ�����", 4)
	};
	
	//�޼ҵ�
	int run() {
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		for(int i = 0; i < tires.length; i++) {
			if(tires[i].roll() == false) {
				stop();
				return (i+1);				
			} else {
				//
			}
		}
		return 0;
	}
	
	void stop() {
		System.out.println("[�ڵ����� ����ϴ�.]");
	}

}
