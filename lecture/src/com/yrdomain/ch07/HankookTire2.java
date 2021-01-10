package com.yrdomain.ch07;

public class HankookTire2 extends Tire2 {
	//필드
	//생성자
	public HankookTire2(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "HankookTrie 수명: " + (maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "HankookTire 펑크 ***");
			return false;
		}
	}

}
