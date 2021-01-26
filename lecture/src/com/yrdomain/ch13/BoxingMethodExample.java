package com.yrdomain.ch13;

public class BoxingMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box2<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();
		
		Box2<String> box2 = Util.boxing("ȫ�浿");
		String strValue = box2.get();
	}

}
