package com.yrdomain.ch06;

public class CarExample9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car9 myCar = new Car9();
		
		//�߸��� �ӵ� ����
		myCar.setSpeed(-50);
		
		System.out.println("���� �ӵ�: " + myCar.getSpeeed());
		
		//�ùٸ� �ӵ� ����
		myCar.setSpeed(60);
		
		//����
		if(!myCar.isStop()) {
			myCar.setStop(true);		
		} else {
			//pass
		}
		System.out.println("���� �ӵ�: " + myCar.getSpeeed());
	}

}
