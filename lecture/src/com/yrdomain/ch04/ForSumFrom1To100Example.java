package com.yrdomain.ch04;

public class ForSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i<=100; i++) {
			sum += i;
			// sum = sum + i ??
		}
		
		System.out.println("1~100 �� : " + sum);
	}

}