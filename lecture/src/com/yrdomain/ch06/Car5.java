package com.yrdomain.ch06;

public class Car5 {
	//필드
	int gas;
	
	//생성자
	
	//메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;	//false를 리턴
		} else {
			//
		}
		System.out.println("gas가 있습니다.");
		return true;		//true를 리턴
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량:" + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas잔량:" + gas + ")");
				return;			//리턴값을 보내는게 아니라 그냥 메소드 실행 종료를 위함
			}
		}
	}

}
