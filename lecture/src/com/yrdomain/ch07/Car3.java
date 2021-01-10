package com.yrdomain.ch07;

public class Car3 {
	//필드
	Tire2[] tires = {
			new Tire2("앞왼쪽", 6),
			new Tire2("앞오른쪽", 2),
			new Tire2("뒤왼쪽", 3),
			new Tire2("뒤오른쪽", 4)
	};
	
	//메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
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
		System.out.println("[자동차가 멈춥니다.]");
	}

}
