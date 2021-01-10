package com.yrdomain.ch07;

class A1 {}

class B1 extends A1 {}
class C1 extends A1 {}
class D1 extends B1 {}
class E1 extends C1 {}


public class PromotionExample {
	public static void main(String[] args) {
		B1 b1 = new B1();
		C1 c1 = new C1();
		D1 d1 = new D1();
		E1 e1 = new E1();
		
		A1 a1 = b1;
		A1 a2 = c1;
		A1 a3 = d1;
		A1 a4 = e1;
		
		B1 b2 = d1;
		C1 c2 = e1;
		
//		B1 b3 = e1;		//상속관계가 아니라서 컴파일 에러
//		C1 c3 = d1;
	}

}
