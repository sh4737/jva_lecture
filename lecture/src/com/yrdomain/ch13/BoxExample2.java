package com.yrdomain.ch13;

public class BoxExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box2<String> box1 = new Box2<String>();
		box1.set("hello");
		String str = box1.get();
		
		Box2<Integer> box2 = new Box2<Integer>();
		box2.set(6);
		int value = box2.get();
	}

}
