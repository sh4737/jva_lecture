package com.yrdomain.ch06;

public class CarExample5 {
	public static void main(String[] args) {
		Car5 myCar = new Car5();
		
		myCar.setGas(5);	//Car5�� setGas() �޼ҵ� ȣ��
		
		boolean gasState = myCar.isLeftGas(); //Car5�� isLeftGas() �޼ҵ� ȣ��
		if(gasState) {
			System.out.println("����մϴ�.");
			myCar.run();	//Car5�� run() �޼ҵ� ȣ��
		}
		
		if(myCar.isLeftGas()) {		//Car5�� isLeft() �޼ҵ� ȣ��
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		} else {
			System.out.println("gas�� �����ϼ���.");
		}
	}

}
