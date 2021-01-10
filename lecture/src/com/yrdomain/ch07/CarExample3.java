package com.yrdomain.ch07;

public class CarExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car3 car3 = new Car3();
		
		for(int i = 1; i <= 5; i++) {
			int problemLocation = car3.run();
			if(problemLocation != 0) {
				System.out.println(car3.tires[problemLocation - 1].location + "HankookTire·Î ±³Ã¼");
				car3.tires[problemLocation - 1] = new HankookTire2(car3.tires[problemLocation - 1].location, 15);
			}
			System.out.println("---------------------");
		}

	}

}
