package com.yrdomain.ch03;

public class CheckOverflowExample {
	public static void main(String[] args) {
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println("�����÷ο찡 �߻��Ͽ� ��Ȯ�ϰ� ����� �� ����");
			
		}
	}
	
	public static int safeAdd(int left, int right) {
		if((right>0)) {
			if(left>(Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("�����÷ο� �M��");
			}
		} else {
			if(left<(Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("�����÷ο� �M��");
			}
		}
		return left+right;
	}

}
