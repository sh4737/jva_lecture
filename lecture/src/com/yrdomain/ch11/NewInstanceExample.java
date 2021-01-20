package com.yrdomain.ch11;

public class NewInstanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class clazz = Class.forName("com.yrdomain.ch11.SendAction");
//			Class clazz = Class.forName("com.yrdomain.ch11.ReceiveAction");
			Action action = (Action) clazz.newInstance();
			action.execute();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();			
		} catch (IllegalAccessException e) {
			
		}

	}

}
