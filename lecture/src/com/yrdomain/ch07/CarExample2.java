package com.yrdomain.ch07;

public class CarExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 car2 = new Car2();
		
		for(int i = 1; i <= 5; i++) {
			int problemLocation = car2.run();
			
			switch(problemLocation) {
				case 1:
					System.out.println("�տ��� HankookTire�� ��ü");
					car2.frontLeftTire = new HankookTire2("�տ���", 15);
					break;
				case 2:
					System.out.println("�տ����� KumhoTire�� ��ü");
					car2.frontRightTire = new KumhoTire2("�տ�����", 13);
					break;
				case 3:
					System.out.println("�ڿ��� HankookTire�� ��ü");
					car2.backLeftTire = new HankookTire2("�ڿ���", 14);
					break;
				case 4:
					System.out.println("�ڿ����� KumhoTire�� ��ü");
					car2.backRightTire = new KumhoTire2("�ڿ�����", 17);
					break;
			}
			
			System.out.println("---------------------------");
		}
	}

}
