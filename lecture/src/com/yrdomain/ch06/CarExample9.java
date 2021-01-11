package com.yrdomain.ch06;

public class CarExample9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car9 myCar = new Car9();
		
		//잘못된 속도 변경
		myCar.setSpeed(-50);
		
		System.out.println("현재 속도: " + myCar.getSpeeed());
		
		//올바른 속도 변경
		myCar.setSpeed(60);
		
		//멈춤
		if(!myCar.isStop()) {
			myCar.setStop(true);		
		} else {
			//pass
		}
		System.out.println("현재 속도: " + myCar.getSpeeed());
	}

}
