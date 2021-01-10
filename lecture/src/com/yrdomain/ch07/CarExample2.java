package com.yrdomain.ch07;

public class CarExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 car2 = new Car2();
		
		for(int i = 1; i <= 5; i++) {
			int problemLocation = car2.run();
			
			switch(problemLocation) {
				case 1:
					System.out.println("앞왼쪽 HankookTire로 교체");
					car2.frontLeftTire = new HankookTire2("앞왼쪽", 15);
					break;
				case 2:
					System.out.println("앞오른쪽 KumhoTire로 교체");
					car2.frontRightTire = new KumhoTire2("앞오른쪽", 13);
					break;
				case 3:
					System.out.println("뒤왼쪽 HankookTire로 교체");
					car2.backLeftTire = new HankookTire2("뒤왼쪽", 14);
					break;
				case 4:
					System.out.println("뒤오른쪽 KumhoTire로 교체");
					car2.backRightTire = new KumhoTire2("뒤오른쪽", 17);
					break;
			}
			
			System.out.println("---------------------------");
		}
	}

}
