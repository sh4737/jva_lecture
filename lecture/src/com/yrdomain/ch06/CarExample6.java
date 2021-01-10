package com.yrdomain.ch06;

public class CarExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car6 myCar = new Car6();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재속도: " + speed + "km/h");

	}

}
