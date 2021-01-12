package com.yrdomain.ch07;

public class AnimalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("----");
		
		//������ �ڵ� Ÿ�� ��ȯ
		Animal animal = null;
		animal = new Dog();		//�ڵ� Ÿ�Ժ�ȯ
		animal.sound();			//�����ǵ� �޼ҵ� ȣ��
		animal = new Cat();		//�ڵ� Ÿ�Ժ�ȯ
		animal.sound();			//�����ǵ� �޼ҵ� ȣ��
		System.out.println("-------");
		
		//�޼ҵ��� ������
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
