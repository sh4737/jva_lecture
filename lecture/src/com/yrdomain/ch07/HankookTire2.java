package com.yrdomain.ch07;

public class HankookTire2 extends Tire2 {
	//�ʵ�
	//������
	public HankookTire2(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//�޼ҵ�
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "HankookTrie ����: " + (maxRotation-accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("***" + location + "HankookTire ��ũ ***");
			return false;
		}
	}

}
