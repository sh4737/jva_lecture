package com.yrdomain.ch07;

public class InstanceofExample {
	public static void method1(Parent3 parent3) {
		if(parent3 instanceof Child3) {
			Child3 child3 = (Child3) parent3;
			System.out.println("method1 - Child3�� ��ȯ ����");
		} else {
			System.out.println("method1 - Child3�� ��ȯ���� ����");
		}
	}
	
	public static void method2(Parent3 parent3) {
		Child3 child3 = (Child3) parent3;
		System.out.println("method2 - Child3�� ��ȯ ����");
	}
	
	public static void main(String[] args) {
		Parent3 parentA = new Child3();
		method1(parentA);
		method2(parentA);
		
		Parent3 parentB = new Parent3();
		method1(parentB);
		method2(parentB);
	}

}
