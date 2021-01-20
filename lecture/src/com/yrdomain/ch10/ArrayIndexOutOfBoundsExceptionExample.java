package com.yrdomain.ch10;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String data1 = args[0];
		String data2 = args[1];
		
		for(int n = 0; n <= 10; n++) {
			if (args[n] == null) {
				args[n] = "1";
			} else {
				//p
			}
		}
		
		System.out.println("args[0]: " + data1);
		System.out.println("args[1]: " + data2);

	}

}
