package com.yrdomain.ch04;

public class WhilePrintFrom1To10Example {
	public static void main(String[] args) {
		int i = 1;
		while ( i <= 10) {
			// while 안에 조건문을 잘못 넣으면 영원히 순환할 수 있다.
			System.out.println(i);
			i++;
		}
	}

}
