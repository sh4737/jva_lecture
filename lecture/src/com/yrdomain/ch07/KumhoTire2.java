package com.yrdomain.ch07;

public class KumhoTire2 extends Tire2 {
	//�ʵ�
	//������
	public KumhoTire2(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//�޼ҵ�
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "KumhoTire ����: " + (maxRotation - accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("***" + location + "KumhoTire ��ũ ***");
			return false;
		}
	}

}
