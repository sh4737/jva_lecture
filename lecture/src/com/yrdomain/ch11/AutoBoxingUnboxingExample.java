package com.yrdomain.ch11;

public class AutoBoxingUnboxingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ڵ� Boxing
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());
		
		//���� �� �ڵ� Unboxing
		int value = obj;
		System.out.println("value: " + value);
		
		//���� �� �ڵ� Unboxing
		int result = obj + 100;
		System.out.println("result: " + result);
	}

}
