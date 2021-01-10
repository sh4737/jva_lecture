package com.yrdomain.ch06;

public class CalculatorExample3 {
	public static void main(String[] args) {
		Calculator3 myCalcu = new Calculator3();
		
		//정사각형의 넒이 구하기
		double result1 = myCalcu.areaRectangle(10);
		
		//직사각형의 넒이 구하기
		double result2 = myCalcu.areaRectangle(10, 20);
		
		//결과 출력
		System.out.println("정사각형 넒이=" + result1);
		System.out.println("직사각형 넒이=" + result2);
	}

}
